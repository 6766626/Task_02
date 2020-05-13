package by.iacademy.zadanie02.task;

import java.util.Scanner;

public class Task34 {
    public static void task34(){

        double summa = 5.15;
        double money;


        Scanner clientrub = new Scanner(System.in);
        System.out.println("С Вас 5рублей 15 копеек. Дайте мне денег сперва рубли:");
        double rub = clientrub.nextInt();

        Scanner clientcoin = new Scanner(System.in);
        System.out.println("Теперь копейки:");
        double coin = clientcoin.nextInt();
        if (coin>=100) {
            do {
                coin = coin - 100;
                rub = rub + 1;
            } while (coin <= 99);
        }


        money = (rub*100+ coin)/100;


        if (money<summa){
            System.out.println("С Вас еще "+(summa-money));
        }
        else if (money == summa){
            System.out.println("Спасибо, что без сдачи! Свободная касса!");
        }
        else{
            System.out.println("Спасибо, Ваша сдача:"+(money-summa));
        }
    }
}
