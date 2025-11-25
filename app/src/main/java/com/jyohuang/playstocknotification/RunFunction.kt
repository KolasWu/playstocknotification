package com.jyohuang.playstocknotification

import android.util.Log

class RunFunction {
    class RunFunction {
        fun main() {
            class Person(val name: String, var age: Int){
                // 將 print("hi") 替換為 Log.d()
                fun Hi() = Log.d("TEST_KOLAS", "Hi from ${name}, age: ${age}")
            }
            // ... (其餘程式碼不變)
            val p = Person(name = "kolas", age = 30)
            p.Hi()
        }
    }
}