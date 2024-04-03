import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input");
        String input = scan.nextLine();
        System.out.println("output");
        String result = calc(input);
        System.out.println(result);


    }
    public static String calc(String input){
        if (!input.matches("\\d+ [+-/*] \\d+")) {

            throw new IllegalArgumentException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)\n");
        }
        String[] parts = input.split(" ");
        if (parts.length == 1 || parts.length == 2) {
            throw new IllegalArgumentException("throws Exception //т.к. строка не является математической операцией\n");
        }
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);


        if ( num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new IllegalArgumentException("Допустимы только целые числа от 1 до 10\n");
        }

        int result = 0;

        switch (parts[1]) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("throws Exception //т.к. строка не является математической операцией \n");
        }

        return String.valueOf(result);


    }
}