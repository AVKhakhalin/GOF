package ru.gof.template_method

import ru.gof.utils.showMessage

class WebSiteNews: WebSite() {
    override fun showText() {
        showMessage("   Очень интересная и актуальная новость")
    }
}