package oop_00000108748_Alvina.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun <T: Any> search(a: T) {
        for (item in items) {
            if (item == a) {
                println("Item is already added.")
                return
            }
        }
        println("Item not found.")
    }
}