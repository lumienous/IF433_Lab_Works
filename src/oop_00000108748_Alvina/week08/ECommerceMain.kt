package oop_00000108748_Alvina.week08

fun main(){
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val api = ApiParser()

    for (raw in rawApiData){
        try{
            api.parseProduct(raw)?.let{ product-> api.checkout(product) }
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }

    // Output
    // TRX-E01-SUCCESS
    // TRX-C01-SUCCESS
    // TRX-E02-SUCCESS
    // API Invalid: Missing ID
}