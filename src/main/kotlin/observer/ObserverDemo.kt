package observer

import observer.editor.Editor
import observer.listeners.EmailNotificationListener
import observer.listeners.LogOpenListener

fun main() {
    val editor = Editor()
    editor.events.addListener("open", LogOpenListener("/file.txt"))
    editor.events.addListener("save", EmailNotificationListener("gorky@hotmail.com"))

    try {
        editor.openFile("test.txt")
        editor.saveFile()
    } catch (e: Exception) {
        e.printStackTrace()
    }

}