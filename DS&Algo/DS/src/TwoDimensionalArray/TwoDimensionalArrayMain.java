package TwoDimensionalArray;

public class TwoDimensionalArrayMain {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(5,5);
        twoDimensionalArray.traversal2DArray();
        twoDimensionalArray.insertValueIntoArray(4,4,1010);
        twoDimensionalArray.traversal2DArray();

        twoDimensionalArray.accessingGivenCell(4,4);
        twoDimensionalArray.accessingGivenCell(4,-10);
        twoDimensionalArray.searchingCellValue(10101);
        twoDimensionalArray.searchingCellValue(1010);
        twoDimensionalArray.deleteSingleCell(4,4);
        twoDimensionalArray.traversal2DArray();

        twoDimensionalArray.deleteArray();

        twoDimensionalArray.traversal2DArray();

    }
}
