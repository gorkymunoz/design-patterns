package decorator

fun main() {
    val salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000"
    val dataSourceDecorator = EncryptionDecorator(FileDataSource("test.txt"))
    dataSourceDecorator.writeData(salaryRecords)

    val plain = FileDataSource("test.txt")

    println("- Input--------------")
    println(salaryRecords)
    println("- Encoded--------------")
    println(plain.readData())
    println("- Decoded--------------")
    println(dataSourceDecorator.readData())
}