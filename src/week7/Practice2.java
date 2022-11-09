package week7;

public class Practice2 {
    //Замените каждый элемент, являющийся нечетным числом,
    // целочисленного массива на число 0 и выведете его на экран.
    // Нечетные элементы добавьте в новый ArrayList и также выведете его содержимое на экран.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int el : numbers) {
            if (el % 2 != 0) {
                el = 0;
            }
            System.out.println(el);
        }
    }
}
