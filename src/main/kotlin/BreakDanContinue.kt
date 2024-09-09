fun main(arga: Array<String>){
    var x = Int
    println("Exampel of Break and Continue in For-Loop")
    for (x in 1..10){
        if (x == 7) break
        if (x == 3) continue
        print("$x ")
    }
    print('\n')
}