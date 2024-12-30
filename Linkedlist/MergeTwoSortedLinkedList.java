class  MergeTwoSortedLinkedList{
    public static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    static void printLinkedList(Node head){
        while(head != null){
            System.out.println(head.value + " ");
            head = head.next;
        }
    }
    static Node mergeLinkedList(Node l1, Node l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.value > l2.value) {
            Node temp = l1;
            l1 = l2;
            l2 = temp;
        }
        Node  ans = l1;
        while(l1!= null && l2 != null){
            Node temp = l1;
            while(l1 != null && l1.value <= l2.value){
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l2;
            Node t = l1;
            l1 = l2;
            l2 = t;
        }
        return ans;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        Node mergedHead = mergeLinkedList(head1, head2);
        printLinkedList(mergedHead);
    }
}