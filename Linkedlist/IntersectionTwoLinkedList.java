 class IntersectionTwoLinkedList {
    public static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    static Node intersect(Node l1, Node l2){
        if (l1 == null || l2  == null) return null;
        Node p1 = l1;
        Node p2 = l2;
        while(p1 != p2){
            p1 = p1 == null ? l2 : p1.next;
            p2 = p2 == null ? l1 : p2.next;
            
            // if (p1 == null) p1 = l2;
            // else p1 = p1.next;
            // if(p2 == null) p2 = l1;
            // else p2 = p2.next; 
        }
        return p1;
    }
    static Node addNode(Node head, int val){
        Node newNode = new Node(val);
        if (head == null) head = newNode;
        else{
            Node ptr = head;
            while(ptr.next != null) ptr = ptr.next;
            ptr.next = newNode;
        }
        return head;
    }

    static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head1 = null;
        head1 = addNode(head1, 1);
        head1 = addNode(head1, 2);
        head1 = addNode(head1, 3);
        head1 = addNode(head1, 4);
        Node head2 = null;
        head2 = addNode(head2, 5);
       head2.next = head1.next.next;
       System.out.println("1st List");
       printLinkedList(head1);
        System.out.println("2nd List");
        printLinkedList(head2);
        Node inter = intersect(head1, head2);
        System.out.println(inter.value);
    }
}
