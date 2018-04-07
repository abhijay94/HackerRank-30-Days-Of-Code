import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int max = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int bitwiseAnd = i & j;
                    if (bitwiseAnd > max && bitwiseAnd < k) {
                        max = i & j;
                    }
                }
            }
            System.out.println(max);
        }
    }
}