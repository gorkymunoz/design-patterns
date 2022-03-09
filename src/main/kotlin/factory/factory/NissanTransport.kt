package factory.factory

import factory.transport.Car
import factory.transport.Transport

class NissanTransport : TransportFactory() {

    override fun prepareShipment(): Transport = Car()
}