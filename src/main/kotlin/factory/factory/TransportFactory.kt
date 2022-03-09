package factory.factory

import factory.transport.Transport

abstract class TransportFactory {

    fun sendProduct(product: String) {
        val transport = prepareShipment()
        transport.deliver(product)
    }

    abstract fun prepareShipment(): Transport
}