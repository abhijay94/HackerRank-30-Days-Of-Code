import java.util.Scanner;

public class Day04 {

    private static class Person {
        private int age;

        private Person(int initialAge) {
            if (initialAge >= 0) {
                this.age = initialAge;
            } else {
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
        }

        private void amIOld() {
            String print_data = "You are old.";
            if (this.age < 13) {
                print_data = "You are young.";
            } else if (this.age < 18) {
                print_data = "You are a teenager.";
            }
            System.out.println(print_data);
        }

        private void yearPasses() {
            this.age++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}