package SingleLinkedList;

public class SingleLinkedListMain {

    public static void main(String[] args) {
        SingleLLNode node1 = new SingleLLNode(10, null);
        SingleLLNode node2 = new SingleLLNode(20, null);
        SingleLLNode node3 = new SingleLLNode(30, null);
        SingleLLNode node4 = new SingleLLNode(40, null);

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertNodeAtStart(node1);
        singleLinkedList.insertNodeAtStart(node2);
        singleLinkedList.insertNodeAtLast(node3);

        singleLinkedList.insertNodeAt(node4,1);

        singleLinkedList.traverseSingleLinkedList();

        singleLinkedList.searchNode(10);

        singleLinkedList.deleteNode(3);

        singleLinkedList.traverseSingleLinkedList();
        singleLinkedList.deleteNode(3);
        singleLinkedList.traverseSingleLinkedList();

        singleLinkedList.deleteSingleLinkedList();
        singleLinkedList.insertNodeAtLast(new SingleLLNode(1010, null));
        singleLinkedList.traverseSingleLinkedList();

    }
}
