public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int zarplata = 15000;
        int month = 1;
        int summaNakoplenia = 0;
        while (summaNakoplenia<= 2459000) {
            month = month+1;
            summaNakoplenia = month * zarplata;
            System.out.println("Месяц "+month+", сумма накоплений равна "+summaNakoplenia+" рублей. ");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i =0;
        int x = 11;
        while (i<10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        while (x>=2) {
            x--;
            System.out.print(x + " ");
        }
        System.out.println();

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int cityY = 12000000;
        int born = 17;
        int day = 8;
        int year = 0;
        int peaple = 0;
        int koff = born - day;
        while (year<10){
            year++;
            peaple = (cityY * koff)/1000;
            cityY = cityY + peaple;
            System.out.println("Год "+year+", численность населения составляет "+cityY);
        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int vklad = 15000;
        int month = 0;
        int procenti=0;
        while (vklad<12000000){
            month++;
            procenti=(vklad/100)*7;
            vklad=procenti+vklad;
            System.out.println("Месяц "+month+",сумма накоплений равна "+vklad);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int vklad = 15000;
        int month = 0;
        int procenti=0;
        while (vklad<12000000){
            month++;
            procenti=(vklad/100)*7;
            vklad=procenti+vklad;
            if (month%6==0){
                System.out.println("Месяц "+month+",сумма накоплений равна "+vklad);}

    }}
    public static void task6 () {
        System.out.println("Задача 6");
        int vklad = 15000;
        int month = 0;
        int procenti=0;
        while (month<108) {
            month++;
            procenti = (vklad / 100) * 7;
            vklad = procenti + vklad;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ",сумма накоплений равна " + vklad);
            }
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");

    }
    public static void task8 () {
        System.out.println("Задача 8");

    }
}