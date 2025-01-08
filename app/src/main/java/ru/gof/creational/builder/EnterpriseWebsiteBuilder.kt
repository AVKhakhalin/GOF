package ru.gof.creational.builder

class EnterpriseWebsiteBuilder: WebsiteBuilder() {
    override fun buildName() {
        website.setName("Корпоративный сайт")
    }

    override fun buildCms() {
        website.setCms(Cms.ALIFRESCO)
    }

    override fun buildPrice() {
        website.setPrice(10000F)
    }
}