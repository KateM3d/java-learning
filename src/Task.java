public class Task {
    // Решите задачу с помощью программы. Известны катеты прямоугольного треугольника: основание = 5, боковая сторона = 8,
    // найдите его площадь и периметр и выведите на экран.
    // Подсказка: понадобятся формулы для периметра и площади прямоугольного треугольника.
    // Периметр больше 15? Площадь меньше 30? Выясните это в программе и выведите результат на экран.

    public static void main(String[] args) {
        int base = 5;
        int side = 8;
        int area = (base * side) / 2;
        double perimeter = base + side + Math.sqrt(Math.pow(base, 2) + Math.pow(side, 2));


        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
        System.out.println(perimeter > 15);
        System.out.println(area < 30);
    }
}
