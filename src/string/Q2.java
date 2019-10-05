package string;

import java.util.Scanner;

public class Q2 {
    private String string;

    public Q2(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String substring(int index) {
        return getString().substring(index);

    }
}

class A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine().trim();
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        Q2 obj = new Q2(string);
        System.out.println(obj.substring(index));
        scanner.close();
    }
}
