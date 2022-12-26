import java.time.LocalDate;

public class Main {
    public static void calculateAndPrintLeapOrNot(int yearr) {
        String answer = "не високосный год";
        if (yearr%4==0 && yearr%100!=0 || yearr%100==0 && yearr%400==0) answer = "високосный год";
        System.out.println(answer);
    }
    public static void needClientApp(int name, int releaseYear){
        int currentYear = LocalDate.now().getYear();
        if (releaseYear<currentYear){
            System.out.print("Установите облегченную версию приложения");
        } else {
            System.out.print("Установите обычную версию приложения");
        }
        if (name==0) {
            System.out.println(" для iOS по ссылке");
        } else {
            System.out.println(" для Android по ссылке");
        }
    }
    public static int getDays (int distance) {
        int deliveryDays = 0;
        if (distance<=20) {
            deliveryDays=deliveryDays+1;
        }
        else if (distance>20&&distance<=60){
            deliveryDays=deliveryDays+2;
        }
        else {
            deliveryDays=deliveryDays+3;
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        System.out.println("task1");
        int year = 2027;
        System.out.print("Номер года - ");
        calculateAndPrintLeapOrNot(year);

        System.out.println("task2");
        int nameOs = 1;
        int yearOfRelease = 1999;
        needClientApp(nameOs, yearOfRelease);

        System.out.println("task3");
        int deliveryDistance = 38;
        System.out.println("Потребуется дней: " + getDays(deliveryDistance));

    }
}


