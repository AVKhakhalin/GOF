package ru.gof.behavioral.mediator.run

import ru.gof.behavioral.mediator.AdminUser
import ru.gof.behavioral.mediator.SimpleChat
import ru.gof.behavioral.mediator.SimpleUser
import ru.gof.behavioral.mediator.User
import ru.gof.utils.showMessage

fun runMediatorDemonstration() {
    showMessage("")
    showMessage("")
    showMessage("-----MEDIATOR-----")
    val simpleChat: SimpleChat = SimpleChat()
    val userLena: User = SimpleUser(simpleChat, "Лена")
        .also { simpleChat.addUser(it) }
    val userAlena: User = SimpleUser(simpleChat, "Алёна")
        .also { simpleChat.addUser(it) }
    val userMaksim: User = SimpleUser(simpleChat, "Максим")
        .also { simpleChat.addUser(it) }
    val userNikolay: User = SimpleUser(simpleChat, "Николай")
        .also { simpleChat.addUser(it) }
    simpleChat.addUser(userLena)
    simpleChat.addUser(userAlena)
    simpleChat.addUser(userMaksim)
    simpleChat.addUser(userNikolay)

    userLena.sendMessage("Всем привет! Это Лена.")
    AdminUser(simpleChat, "Андрей")
        .also { simpleChat.setAdminUser(it) }

    userAlena.sendMessage("Здравствуйте! Это Алёна. Ура, начинаем общаться!")
    userMaksim.sendMessage("Всем здравствуйте. Это Максим. Рад с вами пообщаться ;)")
    userNikolay.sendMessage("Всем привет. Меня зовут Николай. Рад общению с вами.")
}