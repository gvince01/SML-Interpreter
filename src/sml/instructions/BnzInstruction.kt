package sml.instructions

import sml.Instruction
import sml.Machine

/**
 *@author gvince01
 *
 */

class BnzInstruction(label: String, val op1: Int, var label2 : String) : Instruction(label, "bnz"){

    override fun execute(m: Machine) {
        val labelInt = (label2[1].toInt() - 48)
        if(op1 != 0) {
            m.prog
        }
    }

    override fun toString(): String{
        return super.toString() + " jumping to " + label2
    }
}