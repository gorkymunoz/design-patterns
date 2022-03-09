package decorator

import java.util.Base64

class EncryptionDecorator(source: DataSource) : DataSourceDecorator(source) {

    override fun writeData(data: String) {
        super.writeData(encode(data))
    }

    override fun readData(): String {
        return decode(super.readData())
    }

    private fun encode(data: String): String {
        val result: ByteArray = data.toByteArray()
        for (i in result.indices) {
            val current = result[i]
            result[i] = (current + 1).toByte()
        }
        return Base64.getEncoder().encodeToString(result)
    }

    private fun decode(data: String): String {
        val result = Base64.getDecoder().decode(data)
        for (i in result.indices) {
            val current = result[i]
            result[i] = (current - 1).toByte()
        }
        return String(result)
    }
}