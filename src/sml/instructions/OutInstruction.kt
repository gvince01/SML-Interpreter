package sml.instructions

import sml.Instruction
import sml.Machine
import kotlin.coroutines.experimental.buildIterator

/**
 *@author gvince01
 *
 */

class OutInstruction(label: String, val op1 : Int) : Instruction(label, "out") {

    override fun execute(m: Machine) {
        var outString = m.registers.getRegister(op1)
        println(outString)
    }

    override fun toString(): String {
        return super.toString() + " printing the value in " + op1
    }
}
