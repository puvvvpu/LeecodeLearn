package Leecode;

import Leecode.auxiliary.ListNode;

/**
 * @Author: 龚浦
 * @Date: 2019/4/15 1:00
 * @Version 1.0
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode defaultNode = new ListNode(0);
        ListNode x=l1,y=l2,current=defaultNode;
        int nextnum = 0;
        while (x!=null || y!=null){
            int num1 = x!=null?x.val : 0;
            int num2 = y!=null?y.val : 0;
            int sum = num1 + num2 + nextnum;
            nextnum = sum/10;
            sum = sum%10;
            current.val = sum;
            if(x!=null){
                x=x.next;
            }
            if(y!=null){
                y=y.next;
            }
            if(x!=null||y!=null){
                current.next = new ListNode(0);
                current = current.next;
            }
        }
        if(nextnum>0){
            current.next = new ListNode(nextnum);
        }

        return defaultNode;
    }

}
