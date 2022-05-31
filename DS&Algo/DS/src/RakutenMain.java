import java.util.LinkedHashMap;
import java.util.Map;

public class RakutenMain {
    public static String intToRoman(int number) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[number / 1000]
                + hundreds[(number % 1000) / 100]
                + tens[(number % 100) / 10]
                + units[number % 10];
    }
    public static void main(String[] args) {
        //1 I
        //6 VI
        // I II III IV V VI VII VIII IX X
        // L - 50
        // C - 100
        // D - 500
        // M - 1000
        int inputNumber = 99;
        //99 - XCIX
        //100 + 1
        //IC
        String s = intToRoman(99);
        System.out.println(s);


    }
}
