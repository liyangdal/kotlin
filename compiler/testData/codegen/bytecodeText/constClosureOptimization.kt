fun test() {

    fun local(){
        {
            //static instance access
            local()
        }()
    }

    //static instance access
    {
        //static instance access
        local()
    }()

    //static instance access
    (::local)()
}

// 3 GETSTATIC constClosureOptimization\$test\$1\.INSTANCE\$
// 1 GETSTATIC constClosureOptimization\$test\$2\.INSTANCE\$
// 1 GETSTATIC constClosureOptimization\$test\$3\.INSTANCE\$
