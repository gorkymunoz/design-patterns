package observer.listeners

import java.io.File

class LogOpenListener(private val fileName: String) : EventListener {

    private val log: File = File(fileName)

    override fun update(eventType: String, file: File) {
        println("Save to log $log: Someone has performed $eventType operation with file ${file.name}")
    }
}