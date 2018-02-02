package sml.instructions

import sml.Instruction
import sml.Machine

/**
 *@author gvince01
 *
 */

class BnzInstruction(label: String, val op1: Int, val label2 : String) : Instruction(label, "bnz"){

    override fun execute(m: Machine) {
        val labelInt = (label2[1].toInt() - 48)
        if(op1 != 0) {
            m.pc = labelInt
            m.prog[m.pc].execute(m)
        }
    }

    override fun toString(): String{
        return super.toString() + " jumping to " + label2
    }
}