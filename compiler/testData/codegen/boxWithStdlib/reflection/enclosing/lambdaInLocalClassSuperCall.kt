open class C(val a: Any)

fun box(): String {
    class L : C({}) {
    }
    val l = L()

    val javaClass = l.a.javaClass
    val enclosingMethod = javaClass.getEnclosingConstructor()!!.getName()
    if (!enclosingMethod.startsWith("LambdaInLocalClassSuperCall\$") || !enclosingMethod.endsWith("\$box\$L")) return "ctor: $enclosingMethod"

    val enclosingClass = javaClass.getEnclosingClass()!!.getName()
    if (!enclosingClass.startsWith("LambdaInLocalClassSuperCall\$") || !enclosingClass.endsWith("\$box\$L")) return "enclosing class: $enclosingClass"

    if (enclosingMethod != enclosingClass) return "$enclosingClass != $enclosingMethod"

    val declaringClass = javaClass.getDeclaringClass()
    if (declaringClass != null) return "anonymous function has a declaring class: $declaringClass"

    return "OK"
}
