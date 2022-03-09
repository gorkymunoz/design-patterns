package factory

import factory.factory.CatTransport
import factory.factory.GiantTransport
import factory.factory.NissanTransport
import factory.factory.TransportFactory
import kotlin.random.Random

fun main() {
    val transport: TransportFactory = configure()
    transport.sendProduct("keys")

}

fun configure(): TransportFactory {
    val rand = Random.nextInt(1, 10)
    println(rand)
    return when (rand) {
        in 8..10 -> GiantTransport()
        in 1 until 5 -> CatTransport()
        else -> NissanTransport()
    }
}
