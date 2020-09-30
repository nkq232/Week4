package Quan;

import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        Week4 Test1 = new Week4();
        Assert.assertEquals(4, Week4.max2Int(4,0));
    }

    @Test
    public void testMax2Int2(){
        Week4 Test1 = new Week4();
        Assert.assertEquals(-2, Week4.max2Int(-2,-4));
    }

    @Test
    public void testMax2Int3() {
        Week4 Test1 = new Week4();
        Assert.assertEquals(5*2, Week4.max2Int(5*2,6));
    }

    @Test
    public void testMax2Int4() {
        Week4 Test1 = new Week4();
        Assert.assertEquals(12, Week4.max2Int(12,-6*2));
    }

    @Test
    public void testMax2Int5() {
        Week4 Test1 = new Week4();
        Assert.assertEquals(55, Week4.max2Int(5*11,-5*-11));
    }

    @Test
    public void testMinArray1() {
        Week4 Test1 = new Week4();
        int[] arr = new int[10];
        int j = 0;
        for(int i = 0; i < 10; i ++){
            arr[i] = j;
            j += 10;
        }
        Assert.assertEquals(0, Week4.minArray(arr));
    }

    @Test
    public void testMinArray2() {
        Week4 Test1 = new Week4();
        int[] arr = new int[12];
        int j = 20;
        for(int i = 0; i < arr.length; i ++){
            arr[i] = j;
            j += 20;
        }
        Assert.assertEquals(20, Week4.minArray(arr));
    }

    @Test
    public void testMinArray3() {
        Week4 Test1 = new Week4();
        int[] arr = {15, 23, 41, 5, 12, 5, 612, -3, 13, 42};
        Assert.assertEquals(-3, Week4.minArray(arr));
    }

    @Test
    public void testMinArray4() {
        Week4 Test1 = new Week4();
        int[] arr = {0, -0, 3, -100, -3, 6};
        Assert.assertEquals(-100, Week4.minArray(arr));
    }

    @Test
    public void testMinArray5() {
        Week4 Test1 = new Week4();
        int[] arr = {};
        Assert.assertEquals(0, Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1() {
        Week4 Test1 = new Week4();
        double weight, height;
        weight = 68;
        height = 1.75;
        Assert.assertEquals("Bình thường", Week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI2() {
        Week4 Test1 = new Week4();
        double weight, height;
        weight = 58;
        height = 1.8;
        Assert.assertEquals("Thiếu cân", Week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI3() {
        Week4 Test1 = new Week4();
        double weight, height;
        weight = 71;
        height = 1.7;
        Assert.assertEquals("Thừa cân", Week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI4() {
        Week4 Test1 = new Week4();
        double weight, height;
        weight = 80;
        height = 1.7;
        Assert.assertEquals("Béo phì", Week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI5(){
        Week4 Test1 = new Week4();
        double weight, height;
        weight = 0;
        height = 0;
        Assert.assertEquals("Wrong input", Week4.calculateBMI(weight, height));
    }
}