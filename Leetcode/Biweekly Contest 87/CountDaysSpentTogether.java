import java.io.*;
import java.util.*;

class CountDaysSpentTogether {
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

    public static void input() throws IOException {
        String arriveAlice = next();
        String arriveBob = next();
        String leaveAlice = next();
        String leaveBob = next();
        System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));

    }

    static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String[] aa = arriveAlice.split("-");
        String[] ab = arriveBob.split("-");
        String[] lb = leaveBob.split("-");
        String[] la = leaveAlice.split("-");

        int aam = Integer.parseInt(aa[0]);
        int abm = Integer.parseInt(ab[0]);
        int lam = Integer.parseInt(la[0]);
        int lbm = Integer.parseInt(lb[0]);
        int aad = Integer.parseInt(aa[1]);
        int abd = Integer.parseInt(ab[1]);
        int lad = Integer.parseInt(la[1]);
        int lbd = Integer.parseInt(lb[1]);

        List<Integer> alicearrival = new ArrayList<>(Arrays.asList(aam, aad));
        List<Integer> bobarrival = new ArrayList<>(Arrays.asList(abm, abd));

        List<Integer> aliceleave = new ArrayList<>(Arrays.asList(lam, lad));
        List<Integer> bobleave = new ArrayList<>(Arrays.asList(lbm, lbd));

        List<List<Integer>> calendar = new ArrayList<>();

        int[] nod = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= nod[i - 1]; j++) {
                calendar.add(new ArrayList<>(Arrays.asList(i, j)));
            }
        }

        int a1 = 0, b1 = 0, c = 0;
        for (List<Integer> matcher : calendar) {

            if (matcher.equals(alicearrival)) {
                a1 = 1;
            }
            if (matcher.equals(bobarrival)) {
                b1 = 1;
            }
            if (a1 == 1 && b1 == 1) {
                c++;
            }

            if (matcher.equals(aliceleave) || matcher.equals(bobleave)) {
                break;
            }
        }
        return c;
    }
}