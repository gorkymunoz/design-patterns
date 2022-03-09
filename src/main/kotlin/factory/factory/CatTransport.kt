package factory.factory

import factory.transport.Transport
import factory.transport.Truck

class CatTransport : TransportFactory() {

    override fun prepareShipment(): Transport = Truck()
}