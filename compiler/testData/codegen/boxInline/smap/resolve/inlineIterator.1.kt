import zzz.*

fun box(): String {
    var p = 0
    for (i in A(5)) {
        p += i
    }

    return if (p == 15) "OK" else "fail: $p"
}

//SMAP
//inlineIterator.1.kt
//Kotlin
//*S Kotlin
//*F
//+ 1 inlineIterator.1.kt
//inlineIterator_1
//+ 2 inlineIterator.2.kt
//zzz/inlineIterator_2
//*L
//1#1,24:1
//5#2:25
//*E