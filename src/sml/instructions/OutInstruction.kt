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
        println(outString)
    }

    override fun toString(): String {

        //doesn't work
        return super.toString() + " the value of " + op1 + " is "
    }
}