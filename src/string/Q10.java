package string;

import java.util.Scanner;

public class Q10 {
    private String string;
    private char ch;

    public Q10(String string, char ch) {
        this.string = string;
        this.ch = ch;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public int index() {
        return getString().indexOf(getCh());
    }

}


class A10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character:");
        char ch = scanner.nextLine().charAt(0);
        System.out.println("Enter String:");
        String string = scanner.nextLine();
        Q10 obj = new Q10(string, ch);

    }
}