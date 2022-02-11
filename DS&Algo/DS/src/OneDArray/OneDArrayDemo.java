package OneDArray;

public class OneDArrayDemo {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};

        OneDArrayDemo demo = new OneDArrayDemo();
        demo.printArrayContents(arr);
        System.out.println("value is found at :" + demo.accessingArrValueUsingIndex(arr, 4));
        System.out.println("search 50 at:" + demo.searchValue(arr, 50));
        System.out.println("search 70 at:" + demo.searchValue(arr, 70));

    }

    void printArrayContents(int[] arr) {
        //Traversing and Printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int accessingArrValueUsingIndex(int[] arr, int index) {
        if (index >= arr.length)
            return -1;
        else
            return arr[index];
    }

    int searchValue(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search)
                return i;
        }
        return -1;
    }
}
