package ru.gof.builder.run

import ru.gof.builder.not_gof_realization.BankAccount
import ru.gof.utils.showMessage

fun runBuilderDemonstration() {
    showMessage("\n\n-----BUILDER----")
    val newAccount: BankAccount =
        BankAccount.Companion.BankAccountBuilder("Jon", "22738022275")
            .withEmail("jon@example.com")
            .wantNewsletter(true)
            .build()

    showMessage(newAccount.toString())
}