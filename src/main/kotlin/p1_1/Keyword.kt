package com.rumune.p1_1

enum class Keyword {
    kr, jp, us, `do`, `in`
}

private fun main() {
    // back-tick 으로 예약어 이스케이핑 가능하다.
    val dominica = Keyword.`do`
    val india = Keyword.`in`
}
