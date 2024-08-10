package ru.gof.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gof.factory_method.factory.DeveloperFactory
import ru.gof.factory_method.factory.createDeveloperBySpecialisation
import ru.gof.factory_method.items.Developer
import ru.gof.factory_method.items.Specialisation

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

/*
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
*/
        //region Factory method
        val developerFactoryJava: DeveloperFactory =
            createDeveloperBySpecialisation(Specialisation.JAVA)
        val developerJava: Developer = developerFactoryJava.createDeveloper()
        developerJava.writeCode()

        val developerFactoryCpp: DeveloperFactory =
            createDeveloperBySpecialisation(Specialisation.CPP)
        val developerCpp: Developer = developerFactoryCpp.createDeveloper()
        developerCpp.writeCode()

        val developerFactoryPhp: DeveloperFactory =
            createDeveloperBySpecialisation(Specialisation.PHP)
        val developerPhp: Developer = developerFactoryPhp.createDeveloper()
        developerPhp.writeCode()
        //endregion
    }
}