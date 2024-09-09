fun main(args: Array<String>){
    println(myFunction("Rekayasa Perangkat Lunak"))

    val myLambada :(String)->Unit = {s:String-> print(s) }
    val v:String = "Jurusan Teknik Informatika"
    myLambada(v)

    myFun(v,myLambada)
}

fun myFunction(x: String) : String{
    var c:String = "Hey!! Welcome To ---"
    return (c+x)
}

fun myFun(a:String, action: (String)->Unit){
    print("\nHeyyy!!!")
    action(a)
}