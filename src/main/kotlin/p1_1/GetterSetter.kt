package com.rumune.p1_1

class GetterSetter {
    // 가변
    var mutable:String = "mutable"
    // 불변
    val immutable:String = "immutable"
    // setter 생성 안하고 내부에서만 조정 가능하도록
    var email: String? = null
        private set
}

private fun main() {
    val gs = GetterSetter()
    gs.mutable = "can change"
    // gs.immutable = "can't change" => Compile Error!
    // gs.email = "can't change" => Compile Error!
}