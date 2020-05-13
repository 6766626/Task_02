package by.iacademy.zadanie02.task;

public class Task35 {
    public static void task35(){
        int a = 341;

        if(a>=1||a<=365) {

            if (a <= 31) {
                System.out.println(a + " Января");
            }
            a = a - 31;
            if (a <= 28) {
                System.out.println(a + " Февраля");
            }
            a = a - 28;
            if (a <= 31) {
                System.out.println(a + " Марта");
            }
            a = a - 31;
            if (a <= 30) {
                System.out.println(a + " Апрель");
            }
            a = a - 30;
            if (a <= 31) {
                System.out.println(a + " Мая");
            }
            a = a - 31;
            if (a <= 30) {
                System.out.println(a + " Июня");
            }
            a = a - 30;
            if (a <= 31) {
                System.out.println(a + " Июля");
            }
            a = a - 31;
            if (a <= 31) {
                System.out.println(a + " Августа");
            }
            a = a - 31;
            if (a <= 30) {
                System.out.println(a + " Сентября");
            }
            a = a - 30;
            if (a <= 31) {
                System.out.println(a + " Октября");
            }
            a = a - 31;
            if (a <= 30) {
                System.out.println(a + " Ноябрь");
            }
            a = a - 30;
            if (a <= 31) {
                System.out.println(a + " Декабрь");
            }
        }
        else {
            System.out.println("Нужно было вводить число от 1 до 365, а сейчас все! Я обиделась и пошла делать другую задачу");
        }



    }
}
