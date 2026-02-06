/*
Problem: Merge Two Sorted Lists
Platform: LeetCode
Question URL: https://leetcode.com/problems/merge-two-sorted-lists/
Difficulty: Easy

Approach:
Use recursion:
Compare heads of both lists,
attach smaller node and recursively merge rest.

Time Complexity: O(n + m)
Space Complexity: O(n + m) (recursive stack)
*/

public class MergeTwoSortedLists {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // First list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1,
                new ListNode(3,
                        new ListNode(5)));

        // Second list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2,
                new ListNode(4,
                        new ListNode(6)));

        ListNode merged = mergeTwoLists(list1, list2);

        printList(merged);
    }
}
