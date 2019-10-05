package string;

import java.util.Scanner;

public class Q7 {
    int sum = 0;
    private String string;

    public Q7(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int totalWeight() {
        for (int i = 0; i < getString().length(); i++) {
            char c = getString().charAt(i);
            int ascii = c;
            sum = sum + ascii;

        }
        return sum;

    }

}

class A7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        Q7 obj = new Q7(string);
        System.out.println(obj.totalWeight());
        scanner.close();

    }
}
