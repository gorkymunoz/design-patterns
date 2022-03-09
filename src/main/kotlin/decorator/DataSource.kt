package decorator

interface DataSource {

    fun writeData(data: String)

    fun readData() : String
}