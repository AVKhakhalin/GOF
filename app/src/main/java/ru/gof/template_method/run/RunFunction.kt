package ru.gof.template_method.run

import ru.gof.template_method.WebSite
import ru.gof.template_method.WebSiteNews
import ru.gof.template_method.WebSitePersonsInfo
import ru.gof.utils.showMessage

fun runTemplateMethodDemonstration() {
    showMessage("\n\n-----TEMPLATE METHOD----")
    val newsWebSite: WebSite = WebSiteNews().also {
        it.showContent()
    }
    val personInfoWebSite: WebSite = WebSitePersonsInfo().also {
        it.showContent()
    }

}