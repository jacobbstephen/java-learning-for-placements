public class PallindromeLinkedList {
    static class Node{
        int val;
        Node next;
        public Node( int val){
            this.val = val;
            this.next = null;
        }
    }

    static Node addNode(Node head, int val){
        Node newNode = new Node(val);
        if (head == null) head = newNode;
        else{
            Node ptr = head;
            while(ptr.next != null) ptr = ptr.next;
            ptr.next =  newNode;
        }
        return head;
    }
    
    static boolean ispallindrome( Node head){
        Node s = head, f = head;
        // find the middle pointer(s)
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        // reverse the 2nd half
        Node prev = null;
        Node next;
        while (s !=  null){
            next = s.next;
            s.next = prev;
            prev = s;
            s = next;
        }
        s = prev;
        System.out.println(s.val);
        // Compare 1st half with 2nd half
        f = head;
        while(s != null && f != null){
            if (f.val != s.val) return false;   
            f = f.next;
            s = s.next;
        }
        return true;
    }

    static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        head = addNode(head, 1);
        head = addNode(head, 2);
        head = addNode(head, 2);
        head = addNode(head, 1);
        // Node ptr1 = head;
        boolean status = ispallindrome(head);
        // printLinkedList(ptr1);
        System.out.println(status);
    }
}
