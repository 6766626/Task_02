package by.iacademy.zadanie02.task;

public class Task14 {
    public static void task14(){

        int a = 30;
        int b = 50;
        int c = 180-a-b;

        if (c>0) {
            if (a==90||b==90||c==90){
                System.out.println("Треугольник существует и он прямоугольный");
            }
            else {
                System.out.println("Треугольник существует и он НЕ прямоугольный");
            }
        }
        else {
            System.out.println("Треугольник НЕ существует");
        }
    }
}
