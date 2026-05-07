package oop_00000108748_Alvina.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T> {
        return items
    }
}