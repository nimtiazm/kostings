package com.oneeyedmen.kostings.primitives

open class KotlinPrimitives_Niave {

    fun sum_nullable(): Int {
        /* Despite the types, the compiler doesn't box here
         */
        val i1: Int? = 41
        val i2 = 1
        return i1!! + i2
    }

    fun sum_nullable_2(): Int {
        /* Nor here
         */
        val i0: Int? = 42
        val i1 = i0
        val i2 = 1
        return i1!! + i2
    }
}

