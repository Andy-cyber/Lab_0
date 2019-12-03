package test;

import lab0.Variant3;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestVariant3 {

    @org.testng.annotations.Test(dataProvider = "masProvider")
    public void ifTest(double a, double b,double []expected) {
        assertEquals(Variant3.operations_number(a,b), expected);
    }
    @DataProvider
    public Object[][] masProvider() {
        return new Object[][]{{4,2, new double[]{2,0}}};
    }

    @org.testng.annotations.Test(dataProvider = "masProvider2")
    public void ifTest(int []a1, int N, int M, int[][] expected) {
        int [][] k=Variant3.Array(N,M,a1);
        assertTrue(Variant3.IsEqualsTwoArrays(k,expected));
    }
    @DataProvider
    public Object[][] masProvider2() {
        return new Object[][]{{new int[]{4,2,3,4},4,4, new int [][] {{4,2,3,4},{4,2,3,4},{4,2,3,4},{4,2,3,4}}}};
    }
    @org.testng.annotations.Test(dataProvider = "numProvider")
    public void ifTest(int A, int B,Integer []expected) {
        Integer[] c=Variant3.operations(A,B);
        assertEquals(c, expected);
    }
    @DataProvider
    public Object[][] numProvider() {
        return new Object[][]{{2,5, new Integer[]{4,3}}};
    }
    @org.testng.annotations.Test(dataProvider = "Provider")
    public void byteTest(int a,int expected) {
        assertEquals(Variant3.bytes_integer(a), expected);
    }
    @DataProvider
    public Object[][] Provider() {
        return new Object[][]{{2048, 2}, {1024, 1}, {2000, 1}};
    }
    @org.testng.annotations.Test(dataProvider = "ifProvider")
    public void ifTest(int number,int expected) {
        assertEquals(Variant3.number_sign(number), expected);
    }
    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{2, 3}, {-12, -14}, {0, 10}, {23, 24}, {0, 10}, {1, 2}};
    }
  @org.testng.annotations.Test(dataProvider = "switchProvider")
  public void switchTest(int month,String expected) {
      assertEquals(Variant3.seas(month), expected);
  }
    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][]{{8, "Summer"}, {5, "Spring"}};
    }
}