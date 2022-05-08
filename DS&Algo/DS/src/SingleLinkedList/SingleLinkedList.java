package SingleLinkedList;

public class SingleLinkedList {

    SingleLLNode head, tail = null;

    public void insertNodeAtStart(SingleLLNode node) {
        if (head == null) { // means linked list doesn't exist, and we need to attach it at start
            head = tail = node;
        } else {
            tail = head;
            node.setNext(head);
            head = node;
        }
    }

    public void insertNodeAtLast(SingleLLNode node) {
        if (tail == null) {
            tail = head = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public void insertNodeAt(SingleLLNode node, int location) {
        //location we will take it as location - 1 since we start index from 0
        SingleLLNode tmpNode = head;
        int tmpCount = 0;
        while (tmpCount < location - 1) {
            tmpNode = tmpNode.getNext();
            tmpCount++;
        }
        node.setNext(tmpNode.getNext());
        tmpNode.setNext(node);
    }

    public void traverseSingleLinkedList() {
        System.out.println("Traversal started...");
        SingleLLNode tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.getData() + "->");
            tmpNode = tmpNode.getNext();
        }
        System.out.println();
    }

    public void deleteNode(int location) {
        int tmpCount = 0;
        if (head == null) {
            System.out.println("LinkedList doesn't exist");
        } else {
            SingleLLNode tmpNode = head;
            while (tmpCount < location - 1) {
                tmpNode = head.getNext();
                tmpCount++;
            }

            SingleLLNode nodeToDelete = tmpNode.getNext();//this is the node to unlink
            tmpNode.setNext(nodeToDelete.getNext());

        }
    }

    public void searchNode(int value) {
        SingleLLNode tmpNode = head;
        while (tmpNode != null) {
            if (tmpNode.getData() == value) {
                System.out.println("Found value in LinkedList ::" + value);
                return;
            }
            tmpNode = tmpNode.getNext();
        }
        System.out.println("Value ::" + value + " is not found");
    }

    public void deleteSingleLinkedList() {
        head = tail = null;
    }

}
