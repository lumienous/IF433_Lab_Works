package oop_00000108748_Alvina.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed == true) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasiil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    try{
        dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch(e: DispenserJamException) {
        println("Caught dispenser! ${e.message}")
    } catch(e: FoodEmptyException) {
        println("Caught empty! ${e.message}")
    } catch (e : Exception) {
        println("Caught exception! ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.\n")
    }

    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    } .onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr.")
    } .onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("Berikan chicken jerky secara manual")
    }
}