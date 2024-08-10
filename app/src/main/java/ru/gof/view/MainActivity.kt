package ru.gof.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gof.chain_of_responsibility.Message
import ru.gof.chain_of_responsibility.NotifierImplMMS
import ru.gof.chain_of_responsibility.NotifierImplSMS
import ru.gof.chain_of_responsibility.NotifierImplServer
import ru.gof.chain_of_responsibility.Priority

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }


        //region Chain of responsibility
        val notifierImplSMS: NotifierImplSMS = NotifierImplSMS(Priority.LOW)
        val notifierImplMMS: NotifierImplMMS = NotifierImplMMS(Priority.NORMAL).also {
            notifierImplSMS.setNotifier(it)
        }
        val notifierImplServer: NotifierImplServer = NotifierImplServer(Priority.HIGH).also {
            notifierImplMMS.setNotifier(it)
        }
        notifierImplSMS.notifyManager(
            Message("Сообщение о лёгкой неисправности", Priority.LOW))
        notifierImplSMS.notifyManager(
            Message("Сообщение о средней неисправности", Priority.NORMAL))
        notifierImplSMS.notifyManager(
            Message("Сообщение о тяжёлой неисправности", Priority.HIGH))
        //endregion


    }
}