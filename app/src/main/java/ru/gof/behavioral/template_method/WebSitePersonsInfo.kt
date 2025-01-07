package ru.gof.behavioral.template_method

import ru.gof.utils.showMessage

class WebSitePersonsInfo: WebSite() {
    override fun showText() {
        showMessage("   Важная личная информация")
    }
}