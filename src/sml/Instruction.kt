package sml

/**
 * Constructor: an instruction with label l and opcode op
 * (op must be an operation of the language)
 *  = the representation "label: opcode" of this sml.Instruction
 */
abstract class Instruction(protected var label: String, protected var opcode: String) {

    override fun toString(): String {
        return label + ": " + opcode
    }

    /**
     * Execute this instruction on machine m.
     */
    abstract fun execute(m: Machine)
}

class AddInstruction(label: String, val result: Int, val op1: Int, val op2: Int) : Instruction(label, "add") {

    override fun execute(m: Machine) {
        val value1 = m.registers.getRegister(op1)
        val value2 = m.registers.getRegister(op2)
        m.registers.setRegister(result, value1 + value2)
    }

    override fun toString(): String {
        return super.toString() + " " + op1 + " + " + op2 + " to " + result
    }
}

class SubInstruction(label: String, val result: Int, val op1: Int, val op2: Int) : Instruction(label, "sub"){

    override fun execute(m: Machine) {
        val value1 = m.registers.getRegister(op1)
        val value2 = m.registers.getRegister(op2)
        m.registers.setRegister(result, value1 - value2)
    }

    override fun toString(): String{
        return super.toString() + " " + op1 + " - " + op2 + " to " + result
    }
}