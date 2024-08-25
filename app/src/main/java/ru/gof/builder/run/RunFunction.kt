package ru.gof.builder.run

import ru.gof.builder.not_gof_realization.BankAccountInnerClass
import ru.gof.builder.not_gof_realization.BankAccountCompanionObject
import ru.gof.utils.showMessage

fun runBuilderDemonstration() {
    showMessage("\n\n-----BUILDER----")
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