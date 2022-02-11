package SingleDimensionArray;

public class SingleDimensionArray {
    int[] arr = null;

    //Initialize the Array
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Print the Array
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array doesn't exists any more");
        }
    }

    //Insertion into an array
    public void insertionArray(int index, int value) {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.printf("Successfully inserted %d at %d\n", value, index);
            } else System.out.println("Value is already present and can't insert value again");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index in accessing!");
        }
    }

    //Accessing an array
    public void accessingCell(int index) {
        try {
            System.out.printf("value found at %d\n", arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access the array!");
        }
    }

    //Search a value in an Array
    public void searchInArr(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (valueToSearch == arr[i]) {
                System.out.printf("Value found! at index %d for value %d \n", i, valueToSearch);
                return;
            }
        }
        System.out.println("Value is not found!");
    }

    //Delete value from an array present at an index
    public void deleteValue(int deleteValueFromThisCell) {
        try {
            arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index doesn't exists");
        }
    }
}
