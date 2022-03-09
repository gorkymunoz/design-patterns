package factory.transport

class Truck: Transport {

    override fun deliver(product: String) {
        println("Delivering $product in a truck")
    }
}