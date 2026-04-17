package oop_00000108748_Alvina.week08

class ApiParser {
    fun parseProduct (rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"]) {
            "API Invalid: Missing Name"
        }

        val type = rawJson["type"] as? String
        if (type == "ELECTRONIC"){
            val warranty = rawJson["warranty"] as? Int? ?: 12
            return Product.Electronic(id.toString(), name.toString(), warranty)
        } else if (type == "CLOTHING"){
            val size =  rawJson["size"] as? String ?: "All Size"
            return Product.Clothing(id.toString(), name.toString(), size)
        } else {
            return null
        }
    }
}