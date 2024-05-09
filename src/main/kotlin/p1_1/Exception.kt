package com.rumune.p1_1

import java.io.IOException

class Exception {
    @Throws(IOException::class) // 자바에서도 사용하려면 Throws 어노테이션을 사용하면 된다.
    fun throwIOException() // 자바처럼 throws Exception 이런거 필요 없다
    {
        throw IOException("Checked Exception")
    }
}

private fun main () {
    val e = Exception()
    e.throwIOException()
}