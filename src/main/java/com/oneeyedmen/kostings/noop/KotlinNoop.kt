package com.oneeyedmen.kostings.noop

import org.openjdk.jmh.annotations.Benchmark

open class KotlinNoop {

    @Benchmark
    fun noop() {
    }

    @Benchmark
    fun just_return() = 42
}
