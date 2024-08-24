package ru.gof.builder.not_gof_realization

class BankAccount private constructor(
    private val name: String,
    private val accountNumber: String,
    private val email: String,
    private val newsletter: Boolean,
) {
    companion object {
        class BankAccountBuilder(private var name: String, private var accountNumber: String) {
            private var email: String = ""
            private var newsletter: Boolean = true

            fun withEmail(email: String): BankAccountBuilder {
                this.email = email
                return this
            }

            fun wantNewsletter(newsletter: Boolean): BankAccountBuilder {
                this.newsletter = newsletter
                return this
            }

            fun build(): BankAccount {
                return BankAccount(name, accountNumber, email, newsletter)
            }
        }
    }

    override fun toString(): String {
        return "Содержимое класса ${this.javaClass.simpleName}: " +
               "$name, $accountNumber, $email, $newsletter"
    }
}