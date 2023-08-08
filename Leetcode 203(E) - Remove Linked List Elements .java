// 如果在linked list里想要remove and delete node，可以设置虚拟头结点 dummy

class Solution {
    public ListNode removeElements(ListNode head, int val) {
    
        // 边界情况，如果链表为空，那么没有元素可以删除，直接返回空
        if (head == null) return null;

        // 一开始设置一个虚拟节点，它的值为 -1，它的值可以设置为任何的数，因为我们根本不需要使用它的值
        // 设置虚拟节点的目的是为了让原链表中所有节点就都可以按照统一的方式进行移除
        // 因为如果不设置虚拟节点，如果删除的元素是原链表中的头节点，那么需要额外的做一些判断，比较繁琐
        ListNode dummy = new ListNode(-1);

        // 虚拟头节点的下一节点指向 head 节点
        // 如果原链表是  1 -->  2 -->  3
        // 那么加上虚拟头节点就是  -1 -->  1 -->  2 -->  3
        dummy.next = head;

        // 设置一个指针，指向此时的虚拟节点
        // pre: -1 -->  1 -->  2 -->  3
        ListNode pre = dummy;

        // 设置一个指针，指向原链表 head
        ListNode cur = head;

        // 让 cur 不断的向后移动，直到移动到链表的最尾部，指向 null 的那个位置
        // 此时 pre 还在指向 dummy
        // 也就是说一开始 pre 落后 cur 一个节点
        

            // 移动的过程中，如果发现当前的节点值和目标值一样
            // 我们就让指针 pre 所指向的节点的下一节点跳过这个值
            
                // 让指针 pre 所指向的节点的下一节点跳过这个值
            
                // 否则的话，pre 跟上 cur 的位置
        while (cur != null){
            if (cur.val == val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }        
           
            // 判断完当前的节点情况后，让 cur 向后移动 (这里很重要，不然就会导致infinite loop！！)
            cur = cur.next;
        }   
       

        // 最后返回 dummy 节点的下一节点
        // 因为这个时候 dummy 指向的是一个我们设置的节点，它的下一节点才是原链表中的节点
        // 不直接return head 是因为head 可能= val，会被remove
        return dummy.next;
   }

}
