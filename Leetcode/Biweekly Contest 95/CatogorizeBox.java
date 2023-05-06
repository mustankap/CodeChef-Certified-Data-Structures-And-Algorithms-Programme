import java.io.*;
import java.math.BigInteger;
import java.util.*;

class CategorizeBox {
    static BufferedReader br;
    static StringTokenizer st;

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int t = nextInt();
        while (t-- > 0) {
            input();
        }
        br.close();
    }

    /**
     * 
     * The box is "Bulky" if:
     * Any of the dimensions of the box is greater or equal to 10^4.
     * Or, the volume of the box is greater or equal to 10^9.
     * If the mass of the box is greater or equal to 100, it is "Heavy".
     * If the box is both "Bulky" and "Heavy", then its category is "Both".
     * If the box is neither "Bulky" nor "Heavy", then its category is "Neither".
     * If the box is "Bulky" but not "Heavy", then its category is "Bulky".
     * If the box is "Heavy" but not "Bulky", then its category is "Heavy".
     * 
     */
    public static void input() throws IOException {
        int length = nextInt();
        int width = nextInt();
        int height = nextInt();
        int mass = nextInt();

        System.out.println(categBox(length, width, height, mass));
    }

    static String categBox(int length, int width, int height, int mass) {
        BigInteger l = BigInteger.valueOf(length);
        BigInteger w = BigInteger.valueOf(width);
        BigInteger h = BigInteger.valueOf(height);
        BigInteger vol = l.multiply(w).multiply(h);
        BigInteger m = BigInteger.valueOf(mass);
        String result = "";
        char ob = 0;
        char oh = 0;

        BigInteger tenf = BigInteger.valueOf((long) Math.pow(10, 4));
        BigInteger tenN = BigInteger.valueOf((long) Math.pow(10, 9));
        if (m.compareTo(BigInteger.valueOf(100)) >= 0) {
            result = "Heavy";
            oh = 'h';
        }
        if (l.compareTo(tenf) >= 0 || w.compareTo(tenf) >= 0 || h.compareTo(tenf) >= 0 || m.compareTo(tenf) >= 0
                || vol.compareTo(tenN) >= 0) {
            result = "Bulky";
            ob = 'b';
        }
        if (ob == 'b' && oh == 'h') {
            result = "both";
        }
        if (ob != 'b' && oh != 'h') {
            result = "neither";
        }

        return result;

    }
}