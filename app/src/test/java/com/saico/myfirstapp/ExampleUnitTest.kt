package com.saico.myfirstapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        getTotalPriceCartShop()
    }



    fun getTotalPriceCartShop() {
        val products: ArrayList<Product> = getProducts()
        var totalPrice: Double = 0.0
        products.forEach {
            totalPrice += it.price
        }
        print("El precio total de los productos es : $totalPrice")
    }

    private fun getProducts(): ArrayList<Product> {
        val productBanana = Product(1,"banana", 4.0 , 2)
        val productApple = Product(2, "apple", 2.0 , 5)
        val products: ArrayList<Product> = ArrayList()
        products.add(productBanana)
        products.add(productApple)
        return products
    }
}