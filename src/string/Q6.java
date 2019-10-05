package string;

import java.util.Scanner;

public class Q6 {
    private String string;

    public Q6(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String stringToUppercase() {
        return getString().toUpperCase();

    }
}

class A6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        Q6 obj = new Q6(string);
        System.out.println(obj.stringToUppercase());
        scanner.close();
    }
}
