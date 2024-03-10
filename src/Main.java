public class Main {
    public static void main(String[] args) {

        // Задача 1
        byte clientOS = 1;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке\n");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке\n");
                break;
            default:
                System.out.println("Для вашей ОС доступна веб-версия по ссылке\n");
        }

        // Задача 2
        byte clientDeviceOS = 1;
        int clientDeviceYear = 2021;

        if (clientDeviceOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке\n");
            }
        } else if (clientDeviceOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке\n");
            }
        } else {
            System.out.println("Для вашей ОС доступна веб-версия по ссылке\n");
        }

        // Задача 3
        int year = 100500;
        String yearInfo = year + " ";
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            isLeapYear = true;
            if (year % 100 == 0) {
                isLeapYear = false;
            }
            if (year % 400 == 0) {
                isLeapYear = true;
            }
        }

        yearInfo += isLeapYear ? "год является високосным\n" : "год не является високосным\n";
        System.out.println(yearInfo);

        // Задача 4
        int deliveryDistance = 1010101;
        int deliveryTime = 1;
        String infoAboutDeliveryTime = "Потребуется дней: ";

        if (deliveryDistance <= 20) {
            infoAboutDeliveryTime += deliveryTime;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            infoAboutDeliveryTime += deliveryTime + 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            infoAboutDeliveryTime += deliveryTime + 2;
        } else if (deliveryDistance > 100) {
            infoAboutDeliveryTime = "Доставки нет";
        }

        System.out.println(infoAboutDeliveryTime + "\n");

        // Задача 5
        int month = 50;
        String seasonInfo = "";

        switch (month) {
            case 1:
            case 2:
            case 12:
                seasonInfo = "Месяц номер " + month + " относится к сезону зима";
                break;
            case 3:
            case 4:
            case 5:
                seasonInfo = "Месяц номер " + month + " относится к сезону весна";
                break;
            case 6:
            case 7:
            case 8:
                seasonInfo = "Месяц номер " + month + " относится к сезону лето";
                break;
            case 9:
            case 10:
            case 11:
                seasonInfo = "Месяц номер " + month + " относится к сезону осень";
                break;
            default:
                seasonInfo = month + " - это некорректный номер месяца";
        }

        System.out.println(seasonInfo);
    }
}