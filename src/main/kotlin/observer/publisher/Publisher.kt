package observer.publisher

import observer.listeners.EventListener
import java.io.File

class Publisher(vararg operations: String) {

    val listeners = HashMap<String, MutableList<EventListener>>()

    init {
        for (operation in operations) {
            listeners[operation] = mutableListOf()
        }
    }

    fun addListener(eventType: String, event: EventListener) {
        val users: MutableList<EventListener>? = listeners[eventType]
        users?.add(event)
    }

    fun removeListener(eventType: String, event: EventListener) {
        val users: MutableList<EventListener>? = listeners[eventType]
        users?.remove(event)
    }

    fun notifyToSubscribers(eventType: String, file: File) {
        val users: MutableList<EventListener>? = listeners[eventType]
        users?.let {
            for (listener in it) {
                listener.update(eventType, file)
            }
        }
    }

}