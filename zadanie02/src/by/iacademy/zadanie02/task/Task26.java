package by.iacademy.zadanie02.task;

public class Task26 {
    public static void task26(){
        int a = 14;
        int b = 2;
        int c = 9;
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;

        if (a>b&&a>c) {
            a1 = 2;
        }
        if (b>a&&b>c) {
            b1 = 2;
        }
        if (c>a&&c>b) {
            c1 = 2;
        }
        if (a<b&&a<c) {
            a1 = 1;
        }
        if (b<a&&b<c){
            b1 = 1;
        }
        if (c<a&&c<b){
            c1 = 1;
        }

        if((a1+b1)==3) {
            System.out.println(a+b+" a+b");
        }
        if((a1+c1) ==3) {
            System.out.println(a+c+" a+c");
        }
        if((b1+c1) ==3) {
            System.out.println(b+c+" b+c");
        }
    }
}
