package ru.gof.creational.builder

abstract class WebsiteBuilder {
    protected lateinit var website: Website

    fun createWebsite() {
        website = Website()
    }

    abstract fun buildName()
    abstract fun buildCms()
    abstract fun buildPrice()

    fun getCreatedWebsite(): Website = website
}