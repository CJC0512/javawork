package programers_selfstudy;

import java.util.Scanner;

public class selfstudy_practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int len = a.length();

        String result = "";

        for (int i=0; i < len; i++){
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
                result += (char)(a.charAt(i) + 32);
            }
            else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                result += (char)(a.charAt(i) - 32);
            }
            else{
                continue;
            }
        }
        System.out.print(result);
    }
}
