package Leecode.auxiliary;

/**
 * @Author: 龚浦
 * @Date: 2019/4/15 1:02
 * @Version 1.0
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }
    public ListNode(int x,ListNode next) {
        val = x;
        this.next = next;
    }
}
