import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        double satu = reader.nextDouble();
        double dua = reader.nextDouble();

        System.out.print("pilih operator yang tersedia(+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result = 0.0;

        switch (operator) {
        case '+':
            result = satu + dua;
            break;

        case '-':
            result = satu - dua;
            break;

        case '*':
            result = satu * dua;
            break;

        case '/':
            result = satu / dua;
            break;

        // operator doesn't match any case constant (+, -, *, /)
        default:
            System.out.printf("Error! operator is not correct");
            return;
        }

        System.out.println(satu + " " + operator + " " + dua + " = " + result);
    }
}