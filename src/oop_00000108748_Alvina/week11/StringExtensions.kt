package oop_00000108748_Alvina.week11

fun String.addGreeting(): String {
    return "Hello $this"
}

fun String.repeatTimes(n : Int): String {
    return this.repeat(n)
}
