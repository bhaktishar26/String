package string;

import java.util.Scanner;

public class Q3 {
    private String string;

    public Q3(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String replaceVowels() {
        for (int i = 0; i < getString().length(); i++) {
            if (getString().charAt(i) == 'a' || getString().charAt(i) == 'e' || getString().charAt(i) == 'i' || getString().charAt(i) == 'o' || getString().charAt(i) == 'u') {
                string = getString().replace(getString().charAt(i), '*');
            }
        }
        return string;
    }

}

class A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        Q3 obj = new Q3(string);
        System.out.println(obj.replaceVowels());
        scanner.close();
    }

}
