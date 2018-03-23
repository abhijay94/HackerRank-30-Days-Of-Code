import java.util.*;

class Day12 {

    public static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        public Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }
    }


    public static class Student extends Person {
        private int[] testScores;

        public Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

        public char calculate() {
            char grade;
            int sum = 0;
            for (int score : testScores) {
                sum += score;
            }
            float avg = sum / testScores.length;
            if (avg <= 100 && avg >= 90) {
                grade = 'O';
            } else if (avg < 90 && avg >= 80) {
                grade = 'E';
            } else if (avg < 80 && avg >= 70) {
                grade = 'A';
            } else if (avg < 70 && avg >= 55) {
                grade = 'P';
            } else if (avg < 55 && avg >= 40) {
                grade = 'D';
            } else {
                grade = 'T';
            }
            return grade;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }

}