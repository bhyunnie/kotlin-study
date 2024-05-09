package com.rumune.p1_1

class JvmStatic {
    companion object {
        @kotlin.jvm.JvmStatic // 이 어노테이션 쓰면 자바에서도 바로 쓸 수 있음
        fun staticFun():String {
            return "This is Static Method"
        }
    }
}

object JvmObject { // 싱글턴 객체
    // 상수
    // 런타임, 해당 상수를 가지고 있는 인스턴스를 통해서 값을 조회
    val name = "FieldObject"
    // 상수
    // 컴파일, 컴파일 시점에 이미 값이 정해지기에 값으로써 리터럴 형태로 저장되어 오버헤드가 적음
    const val constant = "constant"
}

private fun main() {
    // 자바에서는 JvmStatic.Companion.staticFun() 으로 사용해야함
    // 혹은 : JvmStatic.INSTANCE.staticFun()
    val msg = JvmStatic.staticFun()
    println(msg)
    val name = JvmObject.name
    val c = JvmObject.constant
}