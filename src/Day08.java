import java.util.HashMap;
import java.util.Scanner;

class Day08 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> contacts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            contacts.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if(contacts.containsKey(s)){
                System.out.println(s + "=" + contacts.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
