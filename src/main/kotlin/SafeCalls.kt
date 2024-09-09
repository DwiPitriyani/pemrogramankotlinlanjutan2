fun main(args: Array<String>){
    //safe colling
    //?.let
    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }

    //the ?. chaining
    //student?.teacher?.supervisor?.name = "Seymour Skinner"
}