import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.4, -2.5, 6.2, 4.6, 7.4, -1.8, 5.3, -8.1, 7.4, -5.9, 7.5, 4.1, -6.1, 9.9};
        double average = 0.0;
        int count = 0;
        int index = 0;
        for (double num : numbers) {
            index++;
            if (num < 0) {
                for (int j = index++; j < numbers.length; j++) {
                    if (numbers[j] > 0) {
                        average += numbers[j];
                        count++;
                        System.out.println("Положительные чифри после первого отрицательного " + numbers[j]);
                    }
                }
                break;
            }
        }
        System.out.println();
        System.out.println("Среднее арифметическое " + average + " / " + count + " = " + average / count);



//        ДЗ на сообразительность:
        int[] arr = {8, -2, -4, 2, 3, 6};
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int n = arr[i];
                arr[i] = arr[min];
                arr[min] = n;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}