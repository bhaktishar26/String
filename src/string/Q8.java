package string;

import java.util.Scanner;

public class Q8 {
    int sum = 0;
    private String string;

    public Q8(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int upperWeight() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getString().length(); i++) {
            char c = getString().charAt(i);
            int ascii = c;
            if (ascii >= 65 && ascii <= 96) {
                sum = sum + ascii;
            }

        }
        return sum;
    }


}

class A8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        Q8 obj = new Q8(string);
        System.out.println(obj.upperWeight());
        scanner.close();
    }
}
