fun test1() {}

fun test2() {
    test1()
}

// 2 INVOKESTATIC _DefaultPackage.+\.test1 \(\)V
// 1 INVOKESTATIC _DefaultPackage.+\.test2 \(\)V
