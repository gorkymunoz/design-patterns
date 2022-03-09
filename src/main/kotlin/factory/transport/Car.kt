package factory.transport

class Car : Transport {

    override fun deliver(product: String) {
        println("delivering $product in a car")
    }
}