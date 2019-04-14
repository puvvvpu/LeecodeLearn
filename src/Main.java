import Leecode.AddTwoNumbers;
import Leecode.TwoSum;
import Leecode.auxiliary.ListNode;

public class Main {

    public static void main(String[] args) {
        //twoSum
//        int nums[] = new int[]{2,11,15,7};
//        int target = 9;
//        TwoSum twoSum = new TwoSum();
//        int[] num = twoSum.twoSum2(nums,target);

        //AddTwoNumbers
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(l1,l2);

        System.out.println();

    }
}
