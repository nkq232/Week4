package Quan;

public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b) return a;
        return b;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        if (arr.length == 0) return 0;
        int min = 9999;
         for(int i = 0; i < arr.length; i++) {
             if (arr[i] < min) {
                 min = arr[i];
             }
         }
         return min;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI;
        if(weight == 0 || height == 0) {
            return "Wrong input";
        }
        BMI = weight * 1.00 / (height * height * 1.00);
        if (BMI < 18.5) return "Thiếu cân";
        else if (BMI >= 18.5 && BMI <= 22.9) return "Bình thường";
        else if (BMI >= 23 && BMI <= 24.9) return "Thừa cân";
        return "Béo phì";
    }
}