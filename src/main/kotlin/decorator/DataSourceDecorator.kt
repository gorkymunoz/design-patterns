package decorator

open class DataSourceDecorator(private val wrapped: DataSource) : DataSource {


    override fun writeData(data: String) {
        wrapped.writeData(data)
    }

    override fun readData() = wrapped.readData()
}