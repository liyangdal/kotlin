//NO_CHECK_LAMBDA_INLINING

import test.*

fun test1() : String {
    return a {
        test {
            return@a "OK"
        }
    }
}

fun test2() : String {
    return test z@ {
        return@z "OK"
    }
}

fun test3() : String {
    return a z@ {
        test {
            return@z "OK"
        }
    }
}



fun box() : String {
    if (test1() != "OK") return "fail ${test1()}"

    if (test2() != "OK") return "fail: ${test2()}"

    if (test3() != "OK") return "fail: ${test3()}"

    return "OK"
}