package palindrom;

import java.util.Scanner;

public class PalindromSorusu {


    public static void main(String[] args) {

        ;// “anna”, “123321”

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen palindrom giriniz.");
        String palindrom = input.next();
        String bosStr = "";

        for (int i = palindrom.length() - 1; i > -1; i--) {
            char s = palindrom.charAt(i);
            bosStr = bosStr + s;
        }

        if (bosStr.equals(palindrom)) {
            System.out.println("Palindromdur.");
        } else {
            System.out.println("Palindrom değildir.");
        }

        String x = "anna";
        String bos = "";
        int i = x.length() - 1;
        while (i > -1) {
            char t = x.charAt(i);
            bos = bos + t;
            i--;

        }
        if (bos.equals(x)) {
            System.out.println("Palindromdur.");
        } else {
            System.out.println("Palindrom değildir.");
        }

        String y = "anna";
        String bsos = "";
        int f = y.length() - 1;

        do {

            char u = y.charAt(f);
            bsos = bsos + u;

            f--;


        } while (f > -1);

        if (bsos.equals(y)) {
            System.out.println("Palindromdur.");
        } else {
            System.out.println("Palindrom değildir.");
        }

    }


}




