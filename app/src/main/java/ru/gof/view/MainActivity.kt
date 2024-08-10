package ru.gof.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gof.abstract_factory.items.TeamProjectFactory
import ru.gof.abstract_factory.projects.banking.BankingTeamProjectFactory
import ru.gof.abstract_factory.projects.web.WebTeamProjectFactory
import ru.gof.chain_of_responsibility.Message
import ru.gof.chain_of_responsibility.NotifierImplMMS
import ru.gof.chain_of_responsibility.NotifierImplSMS
import ru.gof.chain_of_responsibility.NotifierImplServer
import ru.gof.chain_of_responsibility.Priority
import ru.gof.factory_method.factory.DeveloperFactory
import ru.gof.factory_method.factory.createDeveloperBySpecialisation
import ru.gof.factory_method.items.Developer
import ru.gof.factory_method.items.Specialisation
import ru.gof.singleton.not_gof_realization.SingletonClass
import ru.gof.singleton.not_gof_realization.SingletonClassJava
import ru.gof.utils.showMessage

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
        showMessage("")
        showMessage("")
        showMessage("-----CHAIN OF RESPONSIBILITY----")
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

        //region Factory method
        showMessage("")
        showMessage("")
        showMessage("-----FACTORY METHOD----")
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

        //region Abstract factory
        showMessage("")
        showMessage("")
        showMessage("-----ABSTRACT FACTORY----")
        val bankingTeamProjectFactory: TeamProjectFactory = BankingTeamProjectFactory()
        val bankingDevelopers: List<ru.gof.abstract_factory.items.Developer> =
            bankingTeamProjectFactory.getDevelopers(10).onEach { developer ->
                developer.writingCode()
            }
        val bankingTesters: List<ru.gof.abstract_factory.items.Tester> =
            bankingTeamProjectFactory.getTesters(3).onEach { tester ->
                tester.testingCode()
            }
        val bankingManagers: List<ru.gof.abstract_factory.items.Manager> =
            bankingTeamProjectFactory.getManagers(2).onEach { manager ->
                manager.managingProject()
            }

        val webTeamProjectFactory: TeamProjectFactory = WebTeamProjectFactory()
        val webDevelopers: List<ru.gof.abstract_factory.items.Developer> =
            webTeamProjectFactory.getDevelopers(3).onEach { developer ->
                developer.writingCode()
            }
        val webTesters: List<ru.gof.abstract_factory.items.Tester> =
            webTeamProjectFactory.getTesters(1).onEach { tester ->
                tester.testingCode()
            }
        val webManagers: List<ru.gof.abstract_factory.items.Manager> =
            webTeamProjectFactory.getManagers(1).onEach { manager ->
                manager.managingProject()
            }
        //endregion

        //region Singleton
        showMessage("")
        showMessage("")
        showMessage("-----SINGLETON----")
        val singletonClassJava: SingletonClassJava = SingletonClassJava.getInstance()
        singletonClassJava.testField = "test 1"
        val singletonClassJavaNext: SingletonClassJava = SingletonClassJava.getInstance()
        showMessage(singletonClassJava.toString())
        showMessage(singletonClassJavaNext.toString())
        showMessage("")
        val singletonClass: SingletonClass = SingletonClass.instance
        singletonClass.testField = "test 2"
        val singletonClassNext: SingletonClass = SingletonClass.instance
        showMessage(singletonClass.toString())
        showMessage(singletonClassNext.toString())
        //endregion
    }
}