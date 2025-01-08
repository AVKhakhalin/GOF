package ru.gof.creational.builder

class VisitCardWebsiteBuilder: WebsiteBuilder() {
    override fun buildName() {
        website.setName("Визитная карточка")
    }

    override fun buildCms() {
        website.setCms(Cms.WORDPRESS)
    }

    override fun buildPrice() {
        website.setPrice(500F)
    }
}