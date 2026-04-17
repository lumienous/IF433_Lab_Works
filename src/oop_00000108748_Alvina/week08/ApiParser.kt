package oop_00000108748_Alvina.week08

class ApiParser {
    fun parseProduct (rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"]) {
            "API Invalid: Missing Name"
        }

        val type = rawJson["type"].toString()
        if (type == "ELECTRONIC"){
            val warranty = rawJson["warranty"] as? Int? ?: 12
            return Product.Electronic(id.toString(), name.toString(), warranty)
        } else if (type == "CLOTHING"){
            val size =  rawJson["size"] as? String ?: "All Size"
            return Product.Clothing(id.toString(), name.toString(), size)
        } else {
            println("Unknown product: $type")
            return null
        }
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }

        val res = JavaPaymentService.processPayment(id)!!
        println(res)
    }
}