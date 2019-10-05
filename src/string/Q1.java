package string;

import java.util.Scanner;

public class Q1 {
    private String string;

    public Q1(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String indexOfChars() {
        StringBuilder sb = new StringBuilder();
        sb.append("index: ");
        for (int i = 0; i < getString().length(); i++) {
            sb.append(i + "\t");
        }
        sb.append("\nchars: ");
        for (int i = 0; i < getString().length(); i++) {
            sb.append(string.charAt(i) + "\t");
        }
        return sb.toString();
    }
}


class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = scanner.nextLine().trim();
        Q1 obj = new Q1(string);
        System.out.println(obj.indexOfChars());
        scanner.close();
    }

}





