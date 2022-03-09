package decorator

import java.io.File
import java.io.FileOutputStream
import java.io.FileReader

class FileDataSource(private val name: String) : DataSource {


    override fun writeData(data: String) {
        val file = File(name)
        val fos = FileOutputStream(file)
        fos.write(data.encodeToByteArray(), 0, data.length)
    }

    override fun readData(): String {
        val file = File(name)
        val reader = FileReader(file)
        val buffer = CharArray(file.length().toInt())
        reader.read(buffer)
        return String(buffer)
    }
}