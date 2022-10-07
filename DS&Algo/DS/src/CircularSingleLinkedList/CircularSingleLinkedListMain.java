package CircularSingleLinkedList;

//driver class
public class CircularSingleLinkedListMain {




    public static void main(String[] args) {
        System.out.println("Circular Single Linked List demo starts here");

        CircularSingleLinkedList circularSingleLinkedList = new CircularSingleLinkedList();
        circularSingleLinkedList.insertNodeAtStart(10);

        circularSingleLinkedList.traverseCircularSingleLinkedList();

        System.out.println("Circular Single Linked List demo ends here");
    }


}
