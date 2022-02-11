package SingleDimensionArray;

public class SingleDimensionArrayMain {
    public static void main(String[] args) {

        System.out.println("Creating a blank array of size 10");
        SingleDimensionArray sda = new SingleDimensionArray(10);

        System.out.println("Traversing and printing the array");
        sda.traverseArray();

        System.out.println("Inserting values into array");

        sda.insertionArray(0,10);
        sda.insertionArray(1,20);
        sda.insertionArray(2,30);
        sda.insertionArray(3,40);
        sda.insertionArray(4,50);
        sda.insertionArray(5,60);
        sda.insertionArray(6,70);
        sda.insertionArray(7,80);
        sda.insertionArray(8,90);
        sda.insertionArray(9,100);
        sda.insertionArray(1,100);
        sda.insertionArray(10,1000);

        System.out.println("Accessing values from Array");
        sda.accessingCell(1);
        sda.accessingCell(10);

        System.out.println("Searching for a value in array");
        sda.searchInArr(10);
        sda.searchInArr(10000);

        System.out.println("Deleting values in array");
        sda.traverseArray();
        sda.deleteValue(1);
        sda.traverseArray();
        sda.deleteValue(100);

        sda.traverseArray();

    }
}
