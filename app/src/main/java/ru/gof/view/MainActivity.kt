package ru.gof.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gof.behavioral.chain_of_responsibility.run.runChainOfResponsibilityDemonstration
import ru.gof.behavioral.command.run.runCommandDemonstration
import ru.gof.behavioral.interpreter.run.runInterpreterDemonstration
import ru.gof.behavioral.iterator.run.runIteratorDemonstration
import ru.gof.behavioral.mediator.run.runMediatorDemonstration
import ru.gof.behavioral.memento.run.runMementoDemonstration
import ru.gof.behavioral.observer.run.runObserverDemonstration
import ru.gof.behavioral.state.run.runStateDemonstration
import ru.gof.behavioral.strategy.run.runStrategyDemonstration
import ru.gof.behavioral.template_method.run.runTemplateMethodDemonstration
import ru.gof.behavioral.visitor.run.runVisitorDemonstration
import ru.gof.creational.abstract_factory.run.runAbstractFactoryDemonstration
import ru.gof.creational.builder.run.runBuilderDemonstration
import ru.gof.creational.factory_method.run.runFactoryDemonstration
import ru.gof.creational.prototype.run.runPrototypeDemonstration
import ru.gof.creational.singleton.run.runSingletonDemonstration
import ru.gof.structural.bridge.run.runBridgeDemonstration
import ru.gof.structural.composite.run.runCompositeDemonstration
import ru.gof.structural.decorator.run.runDecoratorDemonstration
import ru.gof.structural.facade.run.runFacadeDemonstration
import ru.gof.structural.flyweight.run.runFlyweightDemonstration
import ru.gof.structural.proxy.run.runProxyDemonstration

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
        ru.gof.structural.adapter.run.runAdapterDemonstration()
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