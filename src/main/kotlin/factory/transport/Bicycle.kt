package factory.transport

class Bicycle : Transport {
    override fun deliver(product: String) {
        println("delivering $product in a bicycle")
    }
}