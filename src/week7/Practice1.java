package week7;

public class Practice1 {
    public static void main(String[] args) {
        //Создайте массив из целых чисел, выведете его на экран и посчитайте для него среднее арифметическое. (Среднее
        //арифметическое равно сумме элементов, разделенной на их количество.)

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int el : numbers) {
            System.out.println(el);
            sum = sum + el;
        }
        System.out.println(sum / numbers.length);
    }
}
