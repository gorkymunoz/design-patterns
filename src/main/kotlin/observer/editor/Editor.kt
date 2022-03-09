package observer.editor

import observer.publisher.Publisher
import java.io.File
import java.io.IOException

class Editor {

    val events: Publisher = Publisher("open", "save")
    private var file: File? = null

    fun openFile(filePath: String) {
        file = File(filePath)
        events.notifyToSubscribers("open", file!!)
    }

    @Throws(IOException::class)
    fun saveFile() {
        file?.let {
            events.notifyToSubscribers("save", it)
        } ?: throw IOException("Please open a file first")
    }
}