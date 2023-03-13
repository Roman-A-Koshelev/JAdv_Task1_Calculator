import java.util.Scanner;

public class Main {
    /**
     * Метод выполняет операции калькулятора (сложение, вычитание, деление или
     * умножение) над дробными числами.
     * @param a Первое дробное число
     * @param b Второе дробное число
     * @param op Операция выполняемая над дробными числами.
     */
    private static void calc(double a, double b, String op) {
        if (1 != op.length()) {
            System.err.println("Операция \"" + op + "\" не поддерживается!");
            return;
        }

        double res;
        switch(op.charAt(0)) {
            case '+':
                res = a + b;
                break;

            case '-':
                res = a - b;
                break;

            case '*':
                res = a * b;
                break;

            case '/':
                if (0 == b) {
                    System.err.println("Делитель не должен быть равен нулю!");
                    return;
                }
                res = a / b;
                break;

            default:
                System.err.println("Операция \"" + op + "\" не поддерживается!");
                return ;
        }

        System.out.printf("Результат операции = %.4f", res);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Необходимо ввести два дробных числа и знак операции (‘+’, ‘-’, ‘*’ или ‘/’).");

        System.out.print("Введите первое число:   ");
        double a = in.nextDouble();

        System.out.print("Введите второе число:   ");
        double b = in.nextDouble();

        System.out.print("Введите знак операции:  ");
        String op = in.next();

        calc(a, b, op);
    }
}