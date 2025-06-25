package linkedListPart1;

import java.util.List;

public class CycleQuestions {


    //https://leetcode.com/problems/linked-list-cycle/description/

    public boolean hasACycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    //find the cycle length
    public int lengthOfCycle(ListNode head){

        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;

            slow=slow.next;

            while (fast==slow){

                ListNode temp=slow;
                int length=0;

                do {
                    temp=temp.next;
                    length++;
                }while (temp!=slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        int length=0;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if (fast==slow){
                length=lengthOfCycle(slow);
                break;
            }

        }

        if(length==0){
            return null;
        }

        ListNode f=head;
        ListNode s=head;

        //find the start node
        while (length>0){
            s=s.next;
            length--;
        }

        //moving both forward & they will meet at cycle start

        while (f!=s){
            f=f.next;
            s=s.next;
        }

        return s;




    }

    public ListNode middleNode(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

//    https://leetcode.com/problems/reverse-linked-list-ii/

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left==right){
            return head;
        }


        ListNode current=head;
        ListNode prev=null;

        for(int i=0;current!=null && i<left-1;i++){
            prev=current;
            current=current.next;
        }

        ListNode last=prev;
        ListNode newEnd=current;

        ListNode next=current.next;

        for(int i=0;current!=null && i<right-left+1;i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }

        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }

        newEnd.next=current;
        return head;

    }


    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;

        while (current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }


    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null){
            return true;
        }

        ListNode mid=middleNode(head);
        ListNode secondHead=reverse(mid);
        ListNode reverseHead=secondHead;

        boolean isPalin = true;

        //comapare half halves
        while(head!=null && secondHead!=null){
            if(head.val!=secondHead.val){
                isPalin=false;
                break;
            }

            head=head.next;
            secondHead=secondHead.next;
        }

        reverse(reverseHead);


        return isPalin;

    }

}





class ListNode{
    int val;
    ListNode next;

    public ListNode(){

    }

    public ListNode(int val){
        this.val=val;
    }

    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
