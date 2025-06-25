package linkedListPart1;

public class CycleQusetionPractice {

    public static void main(String[] args) {
        // Creating nodes
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4); // Start of cycle
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);// cycle at node 2


        // Linking nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n4; // Cycle here



        CycleQuestions cq=new CycleQuestions();
        System.out.println("Has Cycle: " + cq.hasACycle(n1));

        System.out.println("length of cycle: "+cq.lengthOfCycle(n1));

        System.out.println("middle node of LinkedList: "+cq.middleNode(n1));


        ListNode n9 = new ListNode(1);
        ListNode n10 = new ListNode(2);
        ListNode n11 = new ListNode(3);
        ListNode n12 = new ListNode(4); // Start of cycle
        ListNode n13 = new ListNode(5);
        ListNode n14 = new ListNode(6);
        ListNode n15 = new ListNode(7);
        ListNode n16 = new ListNode(8);// cycle at node 2

        n9.next=n10;
        n10.next=n11;
        n11.next=n12;
        n13.next=n14;
        n14.next=n15;
        n15.next=null;

        CycleQuestions cq1=new CycleQuestions();


        https://leetcode.com/problems/reverse-linked-list-ii/
        System.out.println("reverse the linked list 11"+cq1.reverseBetween(n9,4,6));


    }
}
