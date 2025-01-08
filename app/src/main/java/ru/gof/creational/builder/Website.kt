package ru.gof.creational.builder

class Website {
    private var name: String = ""
    private var price: Float = 0f
    private var cms: Cms = Cms.ALIFRESCO

    fun setName(name: String) {
        this.name = name
    }

    fun setCms(cms: Cms) {
        this.cms = cms
    }

    fun setPrice(price: Float) {
        this.price = price
    }

    override fun toString(): String {
        return "Сайт ${this.javaClass.simpleName}: " +
               "название = $name, стоимость = $price, система управления сайтом = $cms"
    }
}