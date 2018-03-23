import java.util.Arrays;
import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binaryArr [] = Integer.toBinaryString(n).split("0");
        Arrays.sort(binaryArr);
        System.out.println(binaryArr[binaryArr.length-1].toCharArray().length);
    }
}