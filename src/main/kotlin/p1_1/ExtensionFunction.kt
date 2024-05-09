package com.rumune.p1_1

class ExtensionFunction {

}

// ExtensionFunctionKt 라는 클래스로 생성 된다.
// 확장함수를 자바에서 사용하려면 ExtensionFunctionKt.first("ABCD") 이런식으로 사용해야한다. 첫번째 인자에 this로 쓸게 들어가야함
fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char:Char): String {
    return char + this.substring(0)
}

fun main() {
    println("ABCD".first())
    println("ABCD".addFirst('Z'))
}