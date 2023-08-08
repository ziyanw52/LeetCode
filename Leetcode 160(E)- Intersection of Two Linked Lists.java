// Leetcode 160(E): Intersection of Two Linked Lists
// 双指针的典型应用
// 设置两个指针，然后用while循环，不断将指针向后移动，判断指针移动的结点是否相等

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    // 边界判断
        if (headA == null || headB == null){
            return null;
        }
        
        // 设置一个指针 pointA，指向链表 A 的头节点
        ListNode pointA = headA;
        
        // 设置一个指针 pointB，指向链表 B 的头节点
        ListNode pointB = headB;

        // 指针 pointA 和 指针 pointB 不断向后遍历，直到找到相交点
        // 不用担心会跳不出这个循环，实际上在链表 headA 长度和链表 headB 长度的之和减一
        // pointA 和 pointB 都会同时指向 null
        // 比如 headA 的长度是 7，headB 的长度是 11，这两个链表不相交
        // 那么 pointA 移动了 7 + 11 - 1 次之后，会指向 null
        // pointB 移动了 7 + 11 - 1  次之后，也指向 null
        // 这个时候就跳出了循环
        while(pointA != pointB){

            // 指针 pointA 一开始在链表 A 上遍历，当走到链表 A 的尾部即 null 时，跳转到链表 B 上 
            if(pointA == null){
                // 指针 pointA 跳转到链表 B 上
                pointA = headB;  
            }else{
                // 否则的话 pointA 不断的向后移动
                pointA = pointA.next;
            } 
                       

             // 指针 pointB 一开始在链表 B 上遍历，当走到链表 B 的尾部即 null 时，跳转到链表 A 上 
            
                // 指针 pointA 跳转到链表 B 上  
             
                // 否则的话 pointB 不断的向后移动
            if(pointB == null){
                pointB = headA;
            }else{
                ponitB = pointB.next;
            }
        }
        // 1、此时，pointA 和 pointB 指向那个相交的节点，返回任意一个均可
        // 2、此时，headA 和 headB 不相交，那么 pointA 和 pointB 均为 null，也返回任意一个均可
        
        return pointA;
    }
}