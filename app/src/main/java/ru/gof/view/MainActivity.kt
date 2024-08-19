package ru.gof.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gof.abstract_factory.run.runAbstractFactoryDemonstration
import ru.gof.adapter.run.runAdapterDemonstration
import ru.gof.bridge.run.runBridgeDemonstration
import ru.gof.chain_of_responsibility.run.runChainOfResponsibilityDemonstration
import ru.gof.factory_method.run.runFactoryDemonstration
import ru.gof.flyweight.run.runFlyweightDemonstration
import ru.gof.observer.run.runObserverDemonstration
import ru.gof.prototype.run.runPrototypeDemonstration
import ru.gof.proxy.run.runProxyDemonstration
import ru.gof.singleton.run.runSingletonDemonstration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //region Chain of responsibility
        runChainOfResponsibilityDemonstration()
        //endregion

        //region Factory method
        runFactoryDemonstration()
        //endregion

        //region Abstract factory
        runAbstractFactoryDemonstration()
        //endregion

        //region Singleton
        runSingletonDemonstration()
        //endregion

        // region Proxy
        runProxyDemonstration()
        //endregion

        // region Prototype
        runPrototypeDemonstration()
        //endregion

        // region Flyweight
        runFlyweightDemonstration()
        //endregion

        // region Observer
        runObserverDemonstration()
        //endregion

        // region Adapter
        runAdapterDemonstration()
        //endregion

        // region Bridge
        runBridgeDemonstration()
        //endregion
    }
}