import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    ListNode(int d) {
        data = d;
        next = null;
    }
}

class Day15 {
    public static ListNode insert(ListNode head, int data) {
        if (head == null) {
            head = new ListNode(data);
        } else {
            ListNode temp = new ListNode(data);
            ListNode iter = head;
            while (iter.next != null) {
                iter = iter.next;
            }
            iter.next = temp;
        }
        return head;
    }

    public static void display(ListNode head) {
        ListNode start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ListNode head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}