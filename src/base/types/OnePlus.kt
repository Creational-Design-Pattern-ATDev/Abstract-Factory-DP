package base.types

import base.Device
import base.Printer

class OnePlus(override var ram: Double, override var processorType: String) : Device {

    override fun configure() {
        Printer.printLn(ram, processorType)
    }

    override fun toString(): String {
        return "OnePlus  $ram,  $processorType"
    }

}