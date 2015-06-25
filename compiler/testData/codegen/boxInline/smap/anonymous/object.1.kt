import builders.*
import kotlin.InlineOption.*

fun test(): String {
    var res = "Fail"

    call {
        res = "OK"
    }

    return res
}


fun box(): String {
    return test()
}
//NO_CHECK_LAMBDA_INLINING
//SMAP
//object.1.kt
//Kotlin
//*S Kotlin
//*F
//+ 1 object.1.kt
//object_1
//+ 2 object.2.kt
//builders/object_2
//*L
//1#1,45:1
//4#2,5:46
//*E
//
//SMAP
//object.2.kt
//Kotlin
//*S Kotlin
//*F
//+ 1 object.2.kt
//builders/object_2$call$1
//+ 2 object.1.kt
//object_1
//*L
//1#1,21:1
//8#2:22
//*E