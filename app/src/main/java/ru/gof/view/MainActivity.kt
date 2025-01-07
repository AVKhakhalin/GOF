package ru.gof.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gof.abstract_factory.run.runAbstractFactoryDemonstration
import ru.gof.adapter.run.runAdapterDemonstration
import ru.gof.bridge.run.runBridgeDemonstration
import ru.gof.builder.run.runBuilderDemonstration
import ru.gof.chain_of_responsibility.run.runChainOfResponsibilityDemonstration
import ru.gof.command.run.runCommandDemonstration
import ru.gof.composite.run.runCompositeDemonstration
import ru.gof.decorator.run.runDecoratorDemonstration
import ru.gof.facade.run.runFacadeDemonstration
import ru.gof.factory_method.run.runFactoryDemonstration
import ru.gof.flyweight.run.runFlyweightDemonstration
import ru.gof.interpreter.run.runInterpreterDemonstration
import ru.gof.iterator.run.runIteratorDemonstration
import ru.gof.mediator.run.runMediatorDemonstration
import ru.gof.memento.run.runMementoDemonstration
import ru.gof.observer.run.runObserverDemonstration
import ru.gof.prototype.run.runPrototypeDemonstration
import ru.gof.proxy.run.runProxyDemonstration
import ru.gof.singleton.run.runSingletonDemonstration
import ru.gof.state.run.runStateDemonstration
import ru.gof.strategy.run.runStrategyDemonstration
import ru.gof.template_method.run.runTemplateMethodDemonstration
import ru.gof.visitor.run.runVisitorDemonstration

class MainActivity: AppCompatActivity() {
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

        //region Proxy
        runProxyDemonstration()
        //endregion

        //region Prototype
        runPrototypeDemonstration()
        //endregion

        //region Flyweight
        runFlyweightDemonstration()
        //endregion

        //region Observer
        runObserverDemonstration()
        //endregion

        //region Adapter
        runAdapterDemonstration()
        //endregion

        //region Bridge
        runBridgeDemonstration()
        //endregion

        //region Composite
        runCompositeDemonstration()
        //endregion

        //region Interpreter
        runInterpreterDemonstration()
        //endregion

        //region Decorator
        runDecoratorDemonstration()
        //endregion

        //region Visitor
        runVisitorDemonstration()
        //endregion

        //region Template Method
        runTemplateMethodDemonstration()
        //endregion

        //region Builder
        runBuilderDemonstration()
        //endregion

        //region Facade
        runFacadeDemonstration()
        //endregion

        //region Command
        runCommandDemonstration()
        //endregion

        // region Iterator
        runIteratorDemonstration()
        //endregion

        // region Memento
        runMementoDemonstration()
        //endregion

        // region State
        runStateDemonstration()
        //endregion

        // region Strategy
        runStrategyDemonstration()
        //endregion

        // region Mediator
        runMediatorDemonstration()
        //endregion
    }
}