package ru.gof.builder.not_gof_realization

class BankAccountInnerClass private constructor(
    private var name: String,
    private var accountNumber: String,
    private var email: String,
    private var newsletter: Boolean,
) {
    private constructor(builder: BankAccountInnerClassBuilder): this(
        builder.name ?: "",
        builder.accountNumber ?: "",
        builder.email ?: "",
        builder.newsletter,
    )

    // Класс строитель
    class BankAccountInnerClassBuilder {
        // Properties
        var name: String? = null
            private set
        var accountNumber: String? = null
            private set
        var email: String? = null
            private set
        var newsletter: Boolean = true

        // Set methods
        fun withName(name: String) = this.apply {
            this.name = name
        }
        fun withAccountNumber(age: String) = this.apply {
            this.accountNumber = age
        }
        fun withEmail(email: String) = this.apply {
            this.email = email
        }
        fun withNewsletter(newsletter: Boolean) = this.apply {
            this.newsletter = newsletter
        }

        fun build() = BankAccountInnerClass(this)
    }

    override fun toString(): String {
        return "Содержимое класса ${this.javaClass.simpleName}: " +
               "$name, $accountNumber, $email, $newsletter"
    }
}