package sml.instructions

import sml.Instruction
import sml.Machine

/**
 *@author gvince01
 *
 */

class OutInstruction(label: String, val op1 : Int) : Instruction(label, "out"){

    override fun execute(m: Machine) {
        var outString = m.registers.getRegister(op1)
    }

    override fun toString(): String {
        return super.toString() + " the value of " + op1 + " is "
    }
}