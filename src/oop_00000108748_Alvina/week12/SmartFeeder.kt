package oop_00000108748_Alvina.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed == true) {
        throw DispenserJamException()
    }
    return availableGram - requestedGram
}