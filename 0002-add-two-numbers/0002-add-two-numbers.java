/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         return add(l1, l2, 0);
    }

    public ListNode add(ListNode l1, ListNode l2 , int carry){
        if(l1==null && l2==null && carry == 0){
            return null;
        }

        int v1=0;
        if(l1!=null){
            v1=l1.val;
        }

        int v2=0;
        if(l2!=null){
            v2=l2.val;
        }

        int sum = v1+v2+carry;

        ListNode node = new ListNode(sum%10);
        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;
        int nextCarry = sum / 10;

        node.next = add(next1, next2, nextCarry);
        return node;
    }
}