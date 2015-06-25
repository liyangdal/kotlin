class C {
    @kotlin.jvm.publicField private val foo: String = "OK"
}

fun box(): String {
    return Test.invokeMethodWithPublicField()
}
