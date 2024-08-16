package ru.gof.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.gof.abstract_factory.run.runAbstractFactory
import ru.gof.chain_of_responsibility.run.runChainOfResponsibility
import ru.gof.factory_method.run.runFactoryMethod
import ru.gof.flyweight.run.runFlyweightRunner
import ru.gof.observer.run.runObserverRunner
import ru.gof.prototype.run.runPrototypeRunner
import ru.gof.proxy.run.runProxyRunner
import ru.gof.singleton.run.runSingletonRunner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //region Chain of responsibility
        runChainOfResponsibility()
        //endregion

        //region Factory method
        runFactoryMethod()
        //endregion

        //region Abstract factory
        runAbstractFactory()
        //endregion

        //region Singleton
        runSingletonRunner()
        //endregion

        // region Proxy
        runProxyRunner()
        //endregion

        // region Prototype
        runPrototypeRunner()
        //endregion

        // region Flyweight
        runFlyweightRunner()
        //endregion

        // region Observer
        runObserverRunner()
        //endregion
    }
}