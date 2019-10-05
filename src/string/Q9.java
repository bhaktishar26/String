package string;

import java.util.Scanner;

public class Q9 {
    int sum1 = 0;
    int sum2 = 0;
    int sum;
    private String string;

    public Q9(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int absoluteWeight() {
        for (int i = 0; i < getString().length(); i++) {
            char c = getString().charAt(i);
            int ascii = c;
            if (ascii >= 65 && ascii <= 96) {
                sum1 = sum1 + ascii;
            } else if (ascii >= 97 && ascii <= 123) {
                sum2 = sum2 + ascii;
            } else {
                break;
            }
        }
        if (sum1 - sum2 > 0) {
            sum = sum1 - sum2;
        } else
            sum = sum2 - sum1;
        return sum;
    }
}

class A9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        Q9 obj = new Q9(string);
        System.out.println(obj.absoluteWeight());
        scanner.close();

    }
}
