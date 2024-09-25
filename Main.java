import java.util.Scanner;

public class Main {

    private static final double kg_Libs = 2.20462;
    private static final double libs_Kg = 0.453592;

    private static final double rub_Dollars = 100;
    private static final double dollars_Rub = 0.01;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберитеконвертации:");
        System.out.println("1. Конвертер весов");
        System.out.println("2. Конвертер валют");
        System.out.println("2. Конвертер температуры");
        int choice = scanner.nextInt();
        if(choice == 1){
            convertorVesov();
        }
        else if(choice == 2){
            convertorValu();
        }
        else if(choice == 3){
            convertorTemp();
        }
    }


    // конвертор весов
    public static void convertorVesov(){
        Scanner scanner = new Scanner(System.in);

        // Выбор направления конвертации
        System.out.println("Выберите тип конвертации:");
        System.out.println("1. Килограммы в фунты");
        System.out.println("2. Фунты в килограммы");
        int choice = scanner.nextInt();

        // Обработка выбора пользователя
        if (choice == 1) {
            System.out.print("Введите вес в килограммах: ");
            double kg = scanner.nextDouble();
            double pounds = kgToLbs(kg);
            System.out.println(kg + " кг = " + pounds + " фунтов");
        } else if (choice == 2) {
            System.out.print("Введите вес в фунтах: ");
            double lbs = scanner.nextDouble();
            double kilograms = lbsToKg(lbs);
            System.out.println(lbs + " фунтов = " + kilograms + " кг");
        } else {
            System.out.println("Неверный выбор.");
        }

        scanner.close();

    }

    public static double kgToLbs(double kg) {
        return kg * kg_Libs;
    }

    public static double lbsToKg(double lbs) {
        return lbs * libs_Kg;
    }


    // конвертор валют

    public static void convertorValu(){
        Scanner scanner = new Scanner(System.in);

        // Выбор направления конвертации
        System.out.println("Выберите тип конвертации:");
        System.out.println("1. доллары в рубли");
        System.out.println("2. рубли в доллары ");
        int choice = scanner.nextInt();

        // Обработка выбора пользователя
        if (choice == 1) {
            System.out.print("Введите количество в долларах: ");
            double rub = scanner.nextDouble();
            double rubls = rub_Dollar(rub);
            System.out.println(rub + " долларов = " + rubls + " рублей");
        } else if (choice == 2) {
            System.out.print("Введите вес в долларах: ");
            double dollar = scanner.nextDouble();
            double dollars = dollar_Rub(dollar);
            System.out.println(dollar + " рублей = " + dollars + " доллары");
        } else {
            System.out.println("Неверный выбор.");
        }

        scanner.close();

    }

    public static double rub_Dollar(double rub) {
        return rub * rub_Dollars;
    }

    public static double dollar_Rub(double dollar) {
        return dollar * dollars_Rub;
    }

    // конвертор температуры

    public static void convertorTemp(){
        Scanner scanner = new Scanner(System.in);

        // выбор направления конвертации
        System.out.println("Выберите тип конвертации:");
        System.out.println("1. Цельсий в Фаренгейт");
        System.out.println("2. Фаренгейт в Цельсий");
        int choice = scanner.nextInt();

        // обработка выбора пользователя
        if (choice == 1) {
            System.out.print("Введите температуру в градусах Цельсия: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
        } else if (choice == 2) {
            System.out.print("Введите температуру в градусах Фаренгейта: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " °F = " + celsius + " °C");
        } else {
            System.out.println("Неверный выбор.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


}

