package com.jxday.testDetail;

import java.util.Objects;

/**
 * 〈leetcode 2 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。〉
 *
 * @author cty
 * @ClassName test20210203
 * @create 2/3/21 9:49 AM
 * @Version 1.0.0
 */
public class test20210203 {

    public static void main(String[] args) {
        
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode();
            ListNode now = head;
            while (true){
                now.val = getVal(l1) + getVal(l2);
                if (now.val > 9){
                    now.val = now.val - 10;
                    if (Objects.isNull(l1)){
                        if (Objects.isNull(l2.next)){
                            l2.next = new ListNode(1);
                        }else {
                            l2.next.val = l2.next.val + 1;
                        }
                    }else {
                        if (Objects.isNull(l1.next)){
                            l1.next = new ListNode(1);
                        }else {
                            l1.next.val = l1.next.val + 1;
                        }
                    }
                }
                if (l1 == null && l2 != null && l2.next == null){
                    break;
                }
                if (l2 == null && l1 != null && l1.next == null){
                    break;
                }
                if (l2 != null && l1 != null && l1.next == null && l2.next == null){
                    break;
                }
                l1 = Objects.isNull(l1) ? l1 :l1.next;
                l2 = Objects.isNull(l2) ? l2 :l2.next;
                now.next = new ListNode();
                now = now.next;
            }
            return head;
        }

        private int getVal(ListNode node) {
            if (Objects.isNull(node)){
                return 0;
            }else {
                return node.val;                
            }
        }
    }
}
