package me.sigh.algorithm.sort;

import java.util.Stack;

/**
 * 头条面试题
 *
 * 单链表操作
 * 输入：奇数位升序，偶数位降序
 * 1 -> 80 -> 3 -> 60 -> 5 -> 40 -> 7 -> 2
 * 输出：升序单链表
 * 1 -> 2 -> 3 -> 5 -> 7 -> 40 -> 60 -> 80
 * 要求: 时间和空间 o(n)
 */
public class OrderdLinkTransfer {

    static class Node {

        int  value;
        Node next;
    }


    // 1 -> 80 -> 3 -> 60 -> 5 -> 40 -> 7 -> 2
    // 1 -> 2 -> 3 -> 5 -> 7 -> 40 -> 60 -> 80
    public static Node transfer(Node n) {

        Node newN = new Node();
        newN.value = n.value;
        Node head = newN;
        Stack<Integer> stack = new Stack();
        int i = 2;
        n = n.next;
        do {
            if (i % 2 == 1) {
                Node tmp = new Node();
                newN.next = tmp;
                tmp.value = n.value;
                newN = newN.next;
            } else {
                stack.push(n.value);
            }
            i++;
            n = n.next;
        } while (n != null);

        Node current = head;
        Node tail = null;
        while (current != null) {
            int v = stack.peek();
            int nv = current.value;
            if (current.next == null) {
                tail = current;
            }
            if (v <= nv) {

                current.value = v;

                Node tmp = new Node();
                tmp.value = nv;
                tmp.next = current.next;

                current.next = tmp;

                stack.pop();
            }
            current = current.next;
        }
        while (!stack.isEmpty()) {

            Node node = new Node();
            node.value = stack.pop();
            tail.next = node;
            tail = tail.next;
        }
        return head;
    }

    public static void retrieve(Node head) {

        Node t = head;
        System.out.printf("start ");
        while (t != null) {
            System.out.printf("-> %d ", t.value);
            t = t.next;
        }
        System.out.println("-> end");
    }

    public static void main(String[] args) {

        // 1 -> 80 -> 3 -> 60 -> 5 -> 40 -> 7 -> 2
        int a[] = new int[] {1, 80, 3, 60, 5, 40, 7, 2};
        Node node = new Node();
        Node head = node;
        node.next = null;
        node.value = a[0];
        for (int i = 1; i < a.length; i++) {

            Node n = new Node();
            n.value = a[i];
            node.next = n;
            node = node.next;
        }

        retrieve(head);
        // 1 -> 2 -> 3 -> 5 -> 7 -> 40 -> 60 -> 80
        Node result = transfer(head);
        retrieve(result);
        System.out.println();
    }
}


