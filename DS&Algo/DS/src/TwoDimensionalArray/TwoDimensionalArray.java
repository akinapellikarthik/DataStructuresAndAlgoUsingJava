package TwoDimensionalArray;

public class TwoDimensionalArray {

    int[][] arr;

    //Initialize a array with Integer.MIN_VALUE
    public TwoDimensionalArray(int noOfRows, int noOfCols) {
        this.arr = new int[noOfRows][noOfCols];
        for (int row = 0; row < noOfRows; row++) {
            for (int col = 0; col < noOfCols; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }

    }

    //traversal of an array
    public void traversal2DArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void insertValueIntoArray(int rowNo, int colNo, int value) {

        if (arr[rowNo][colNo] == Integer.MIN_VALUE) {
            this.arr[rowNo][colNo] = value;
            System.out.printf("Value inserted successfully into rowNo %d colNo %d", rowNo, colNo);
            System.out.println();
        } else
            System.out.println("This cell value is already being filled");
    }

    public void accessingGivenCell(int rowNo, int colNo) {
        try {
            System.out.println("Cell value retrived is " + arr[rowNo][colNo]);
        } catch (Exception e) {
            System.out.println("Exception in accessing the cell as rowNo or colNo doesn't exist");
        }
    }

    public void searchingCellValue(int value) {
        try {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] == value) {

                        System.out.printf("Cell value retrieved at rowNo %d colNo %d", row, col);
                        System.out.println();
                        return;
                    }
                }
            }
            System.out.println("Cell value doesn't exist in array");
        } catch (Exception e) {
            System.out.println("Invalid cell range. Either rowNo or colNo is incorrect");

        }
    }

    public void deleteSingleCell(int rowNo,int colNo){
        try{
            System.out.println("Deleting the cell value "+arr[rowNo][colNo]);
            arr[rowNo][colNo] = Integer.MIN_VALUE;
            System.out.println("Successfully Deleted cell value");
        }
        catch (Exception e){
            System.out.println("Invalid cell range. Either rowNo or colNo is incorrect");
        }
    }

    public void deleteArray(){
        this.arr = null;
        System.out.println("Suvvessfully deleted entire Array...");
    }

}
