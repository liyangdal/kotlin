// "Replace with 'newFun(p, p)'" "true"

@deprecated("", ReplaceWith("newFun(p, p)"))
fun oldFun(p: String) {
    newFun(p, p)
}

fun newFun(p1: String, p2: String){}

fun foo(p: Int) {
    <caret>oldFun("p=$p")
}
