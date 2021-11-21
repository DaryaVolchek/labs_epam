import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String inputName = inputStream.nextLine();
        System.out.println("Приветствую,  " + inputName + "!\n");

        System.out.println("Аргументы командной строки в обратном порядке:");
        for (int i = args.length - 1; i >= 0; i--)
            System.out.printf("Argument %d: %s; ", i, args[i]);

        System.out.println("\n\nСколько чисел вывести?");
        int inputQuantityOfNumbers = inputStream.nextInt();
        System.out.println("\nВывод " + inputQuantityOfNumbers + " чисел в строку:");
        for (int i = 0; i < inputQuantityOfNumbers; i++){
            int randomNumber = (int)(Math.random()*((100 - 10) + 1)) + 10;
            System.out.print(randomNumber + " ");
        }
        System.out.println("\n\nВывод " + inputQuantityOfNumbers + " чисел в столбец:");
        for (int i = 0; i < inputQuantityOfNumbers; i++){
            int randomNumber = (int)(Math.random()*((100 - 10) + 1)) + 10;
            System.out.println(randomNumber);
        }

        System.out.print("\nВведите первое число: ");
        int firstNumber = inputStream.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = inputStream.nextInt();
        System.out.println("Сумма = " + (firstNumber + secondNumber));
        System.out.println("Произведение = " + firstNumber * secondNumber);

        System.out.print("\nВведите число от 1 до 12: ");
        int inputNumberOfMonth = inputStream.nextInt();
        System.out.println(getMonth(inputNumberOfMonth));
    }

    public static String getMonth(int numberOfMonth){
        String[] months = {"", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        if(numberOfMonth > 0 && numberOfMonth < months.length)
            return "Соответствующий месяц: " + months[numberOfMonth];
        return "число должно быть в пределах от 1 до 12";
    }
}
