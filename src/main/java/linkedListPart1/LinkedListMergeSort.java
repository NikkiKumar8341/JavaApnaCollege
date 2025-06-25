package linkedListPart1;

public class LinkedListMergeSort {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }


    public static void main(String[] args) {

        // Creating nodes
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(8);
        ListNode n4 = new ListNode(4); // Start of cycle
        ListNode n5 = new ListNode(7);
        ListNode n6 = new ListNode(0);
        ListNode n7 = new ListNode(15);
        ListNode n8 = new ListNode(12);// cycle at node 2


        // Linking nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = null;

        LinkedListMergeSort cq=new LinkedListMergeSort();
        cq.merge(n1,n6);





    }

}
