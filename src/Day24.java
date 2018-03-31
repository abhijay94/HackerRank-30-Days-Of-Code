import java.util.Scanner;

class LListNode {
    int data;
    LListNode next;

    LListNode(int d) {
        data = d;
        next = null;
    }

}

class Day24 {

    public static LListNode removeDuplicates(LListNode head) {
        // Empty list case:
        if (head == null) {
            return head;
        }
        LListNode current = head;
        while (current.next != null)
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        return head;
    }

    public static LListNode insert(LListNode head, int data) {
        LListNode p = new LListNode(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            LListNode start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(LListNode head) {
        LListNode start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LListNode head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}