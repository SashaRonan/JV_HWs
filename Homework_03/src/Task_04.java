public class Task_04 {


    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 5, 1};
        System.out.println(Math.round(calcAverage(arr)));

    }

    public static double calcAverage (Integer[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
