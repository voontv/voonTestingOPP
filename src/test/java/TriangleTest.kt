import org.junit.Test

import org.junit.Assert.*

class TriangleTest {
    @Test
    fun test_Triangle() {
        val triangle = Triangle(1, 2, 4, 6, 8, 10)
        assertEquals(triangle.getType(), "NORMAL")
    }

    @Test
    fun test_isSquare() {
        val triangle = Triangle(2, 0, 4, 3, 2, -1)
        assertTrue(triangle.isSquare())
    }

    @Test
    fun test_isIsosceles() {
        val triangle = Triangle(-1, 1, 2, 1, 3, 0)
        assertTrue(triangle.isIsosceles())
    }

    @Test
    fun test_getType() {
        var triangle = Triangle(-1, 1, 2, 1, 3, 0)
        assertEquals(triangle.getType(), "ISOSCELES")
        triangle = Triangle(2, 0, 67, 3, 2, -1)
        assertEquals(triangle.getType(), "NORMAL")
        triangle = Triangle(2, 0, 4, 3, 2, -1)
        assertEquals(triangle.getType(), "SQUARE")
        triangle = Triangle(-1, 1, 1, 1, 3, -1)
        assertEquals(triangle.getType(), "SQUARE_ISOSCELES")
    }

    @Test
    fun test_getCircumferenceTriangle() {
        val triangle = Triangle(2, 4, 5, -1, -4, 7)
        assertEquals(triangle.getPerimeter(), 23.19481603796878, 0.001)
    }

    @Test
    fun test_getAreaTriangle() {
        val triangle = Triangle(2, 4, 5, -1, -4, 7)
        assertEquals(triangle.getArea(), 12.5, 0.001)

    }
}
