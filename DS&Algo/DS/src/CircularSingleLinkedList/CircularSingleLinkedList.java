package CircularSingleLinkedList;

import SingleLinkedList.SingleLLNode;

public class CircularSingleLinkedList {

    private SingleLLNode head;
    private SingleLLNode tail;
    private int size;

    SingleLLNode insertNodeAtStart(int nodeValue) {

        SingleLLNode node = new SingleLLNode();
        node.setData(nodeValue);
        node.setNext(node);

        head = node;
        tail = node;
        size = 1;

        return head;

    }

    void traverseCircularSingleLinkedList() {
        SingleLLNode temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}


