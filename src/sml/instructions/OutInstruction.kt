package sml.instructions

import sml.Instruction
import sml.Machine
import kotlin.coroutines.experimental.buildIterator

/**
 *@author gvince01
 *
 */

class OutInstruction(label: String, val op1 : Int) : Instruction(label, "out"){

    override fun execute(m: Machine) {
        val outString = m.registers.getRegister(op1)
    }

    override fun toString(): String {
        return super.toString() + " the value of register " + op1 + " is need to get working"
    }
}