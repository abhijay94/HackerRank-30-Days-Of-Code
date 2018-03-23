import java.util.Scanner;

public class Day06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            String input = sc.next();
            String odd = "";
            String even = "";

            char[] input_arr = input.toCharArray();
            for (int i = 0; i < input_arr.length; i++) {
                if (i % 2 == 0) {
                    odd = odd + input_arr[i];
                } else {
                    even = even + input_arr[i];
                }
            }
            System.out.println(odd + " " + even);
            n--;
        }
        sc.close();
    }
}