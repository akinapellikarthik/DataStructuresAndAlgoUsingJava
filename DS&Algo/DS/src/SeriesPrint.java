public class SeriesPrint {

    public static void main(String[] args) {

        String s = "";
        s.split()
        int b = 3, n = 5, val = 5;
        for (int i = 1; i <= n; i++) {
            val += (Math.pow(2, i - 1) * b);
            System.out.print(val + " ");
        }
    }
}
