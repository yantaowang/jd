package com.wyt.wytlab.leetcode.list;

public class MyLinkedList {
    private ListNode head;

    public ListNode getHead() {
        return head;
    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (head == null) {
            return -1;
        }
        ListNode cur = head;
        int t_index = 0;
        while (cur != null) {
            if (t_index == index) {
                return cur.val;
            }
            cur = cur.next;
            t_index++;
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        if(head == null) {
            head = node;
        } else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        if (index <= 0) {
            if (head == null) {
                head = node;
            } else {
                node.next = head;
                head = node;
            }
            return;
        }
        ListNode cur = head;
        int curIndex = 0;
        while (cur != null) {
            if(curIndex == index-1) {
                node.next = cur.next;
                cur.next = node;
                break;
            }
            cur = cur.next;
            curIndex++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }
        if(index ==0) {
            head = head.next;
            return;
        }
        int cur = 0;
        ListNode temp = head;
        while (temp.next != null) {
            if (cur == index-1) {
                temp.next = temp.next.next;
                break;
            }
            cur++;
            temp = temp.next;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null) {
            return false;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur!=null && cur.next != null) {
            if(cur == pre) {
                return true;
            }
            if(cur.next == pre) {
                return true;
            }
            pre = pre.next;
            cur = cur.next.next;
        }
        return false;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next==null) {
            return null;
        }
        int index = 1,cur=0,pre=0;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            index++;
        }
        cur = index - n;
        if(cur == 0) {
            if(head.next != null) {
                head = head.next;
                return head;
            }
            return null;
        }
        cur--;
        temp = head;
        while (pre < cur) {
            temp = temp.next;
            pre++;
        }
        if(pre == cur) {
            if(temp.next.next != null) {
                ListNode temp1 = temp;
                temp.next = temp.next.next;
            } else {
                temp.next = null;
            }
        }
        return head;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) {
            return head;
        }
        ListNode temp = head, pre = head;
        while (temp.next != null) {
            pre = temp.next;
            if(temp.next.next != null) {
                temp.next = temp.next.next;
            } else {
                temp.next = null;
            }
            pre.next = head;
            head = pre;
        }
        return head;
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
//        if(head.next == null) {
//            if(head.val == val) {
//                return null;
//            }
//        }
        ListNode temp = head,pre = head;
        while (temp != null) {
            if(temp.val == val) {
                if(head == temp) {
                    head = head.next;
                }
                if(temp.next != null) {
                    pre.next = temp.next;
                    temp = temp.next;
                } else {
                    pre.next = null;
                    temp = null;
                }

            } else {
                pre = temp;
                temp = temp.next;
            }
        }
        return head;
    }
    public ListNode mytest(ListNode head1) {
//        ListNode temp = head;
        head1 = head1.next;
        return  head1;
    }
    public ListNode mytest1() {
        ListNode temp = head;
        temp =temp.next;
//        head.next = null;
        head = temp;
        return  temp;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}