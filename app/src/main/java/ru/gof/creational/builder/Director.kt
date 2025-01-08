package ru.gof.creational.builder

class Director {
    private lateinit var builder: WebsiteBuilder

    fun setBuilder(newBuilder: WebsiteBuilder) {
        this.builder = newBuilder
    }

    fun buildWebsite(): Website {
        builder.createWebsite()
        builder.buildName()
        builder.buildCms()
        builder.buildPrice()

        return builder.getCreatedWebsite()
    }
}