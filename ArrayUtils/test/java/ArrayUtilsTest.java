package com.gmail.zavsek_o2;



public class ArrayUtilsTest {
    @Test
    public void testCalculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        double expectedAverage = 3.0;

        double actualAverage = ArrayUtils.calculateAverage(array);

        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void testCalculateAverage_NullArray() {
        int[] array = null;
        double expectedAverage = 0.0;

        double actualAverage = ArrayUtils.calculateAverage(array);

        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void testCalculateAverage_EmptyArray() {
        int[] array = {};
        double expectedAverage = 0.0;

        double actualAverage = ArrayUtils.calculateAverage(array);

        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void testIsSquareMatrix_WhenSquareMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        boolean isSquare = ArrayUtils.isSquareMatrix(matrix);

        Assert.assertTrue(isSquare);
    }

    @Test
    public void testIsSquareMatrix_WhenNotSquareMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        boolean isSquare = ArrayUtils.isSquareMatrix(matrix);

        Assert.assertFalse(isSquare);
    }

    @Test
    public void testIsSquareMatrix_NullMatrix() {
        int[][] matrix = null;

        boolean isSquare = ArrayUtils.isSquareMatrix(matrix);

        Assert.assertFalse(isSquare);
    }

    @Test
    public void testIsSquareMatrix_EmptyMatrix() {
        int[][] matrix = {};

        boolean isSquare = ArrayUtils.isSquareMatrix(matrix);

        Assert.assertFalse(isSquare);
    }

    @Test
    public void testIsSquareMatrix_MatrixWithNullRow() {
        int[][] matrix = {
                {1, 2, 3},
                null,
                {4, 5, 6}
        };

        boolean isSquare = ArrayUtils.isSquareMatrix(matrix);

        Assert.assertFalse(isSquare);
    }
}

