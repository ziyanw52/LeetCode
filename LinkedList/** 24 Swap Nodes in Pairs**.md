** 24 Swap Nodes in Pairs**
---
>Medium

*递归/迭代*

```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode subHead = swapPairs(head.next.next);
        ListNode headNext = head.next;

        headNext.next = head;
        head.next = subHead;
        return headNext;
    }
}

```
---

```java
class Solution {
    public ListNode swapPairs(ListNode head) {

        // 寻找递归终止条件
        // 1、head 指向的结点为 null 
        // 2、head 指向的结点的下一个结点为 null 
        // 在这两种情况下，一个节点或者空节点无论怎么交换操作，都是原来的 head
      if( head == null || head.next == null) {
       return head;
    }
  
        // 不断的通过递归调用，直到无法递归下去，递归的最小粒度是在最后一个节点或者最后两个节点
        // subHead用于存储swapPairs函数的返回值
    ListNode subHead = swapPairs(head.next.next);

        // 对于 head 这个节点来说，它是和它相邻的右边这个节点进行交换操作
        // 所以先要保存这个节点，并且经过上述递归终止条件的判断，head.next 是必然存在的
        ListNode headNext = head.next;

        // head 原来是指向 headNext
        // 交换之后
        // headNext 指向 head
    headNext.next = head;
  
        // headNext 原来是指向 subHead
        // 现在需要让 head 指向 subHead
    head.next = subHead;
  
        // 交换之后，原来的第二位的那个节点 headNext 变成了第一位
        // 把它返回就行
    return headNext;
    }
}
```
---
>注意：head/headNext/subHead这几个结点在交换之后分别指向哪
>---
**时间复杂度 O(n); 空间复杂度 O(n)**
