package ru.gof.creational.builder.run

import ru.gof.creational.builder.Director
import ru.gof.creational.builder.EnterpriseWebsiteBuilder
import ru.gof.creational.builder.VisitCardWebsiteBuilder
import ru.gof.creational.builder.Website
import ru.gof.creational.builder.not_gof_realization.BankAccountCompanionObject
import ru.gof.creational.builder.not_gof_realization.BankAccountInnerClass
import ru.gof.utils.showMessage

fun runBuilderDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----BUILDER-----")
    showMessage("       GOF REALISATION:")
    val director: Director = Director()
    director.setBuilder(VisitCardWebsiteBuilder())
    val visitCardWebsite: Website = director.buildWebsite()
    showMessage(visitCardWebsite.toString())
    director.setBuilder(EnterpriseWebsiteBuilder())
    val enterpriseWebsite: Website = director.buildWebsite()
    showMessage(enterpriseWebsite.toString())

    showMessage("")
    showMessage("       NOT GOF REALISATION:")
    val newAccount: BankAccountCompanionObject =
        BankAccountCompanionObject.Companion.BankAccountCompanionObjectBuilder(
            "Иван", "22738022275")
            .withEmail("ivan@example.com")
            .wantNewsletter(true)
            .build()
    showMessage(newAccount.toString())

    val person: BankAccountInnerClass =
        BankAccountInnerClass.BankAccountInnerClassBuilder()
            .withName("Алиса")
            .withAccountNumber("23728692905")
            .withNewsletter(false)
            .build()
    showMessage(person.toString())
}