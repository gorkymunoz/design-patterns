package factory.factory

import factory.transport.Bicycle
import factory.transport.Transport

class GiantTransport : TransportFactory() {

    override fun prepareShipment(): Transport = Bicycle()
}