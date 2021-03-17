package com.example.practic7

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
        assertEquals(-10, Add.minorOne(1,2,3,4))
        assertEquals(2034307029, Add.minorOne(11111,1234,123123,123123))
        assertEquals(10, Add.minorTwo(1,2,3,4))
        assertEquals(2023176908, Add.minorTwo(123123,123123,1111,2323))
        assertEquals(2, Add.minorThree(1,2,3,4))
        assertEquals(73048111, Add.minorThree(63463,212363,364,67))
        assertEquals(10, Add.minorFourth(1,2,3,4))
        assertEquals(-10, Add.minorFive(1,2,3,4))
        assertEquals(5, Add.minorSix(1,2,3,4))
        assertEquals(5, Add.minorSeven(1,2,3,4))
        assertEquals(2, Add.minorEight(1,2,3,4))
        assertEquals(-10, Add.minorNine(1,2,3,4))
        assertEquals(30, Add.calculateDeterminant(1,2,3,4,5,6,7,8,9))
        assertEquals(33, Add.calculateDeterminant(0,2,3,4,5,6,7,8,9))
        assertEquals(215, Add.calculateDeterminant(0,2,3,4,3,6,7,8,4))

    }
}