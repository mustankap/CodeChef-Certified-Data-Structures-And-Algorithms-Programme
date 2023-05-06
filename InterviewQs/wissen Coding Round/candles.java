import java.util.*;

class candies {

    static int limit_red = 0;
    static int limit_blue = 0;

    static int getans(int total, int red, int blue, int r, int b) {
        if ((red + blue) == 0) {
            return 1;
        }
        // fill red
        int x = 0;
        if (red > 0 && r > 0) {
            x = getans(total - 1, red - 1, blue, r - 1, limit_blue);
        }
        // fill blue
        int y = 0;
        if (blue > 0 && b > 0) {
            y = getans(total - 1, red, blue - 1, limit_red, b - 1);

        }
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        limit_blue = k;
        limit_red = k;
        int ans = getans(n + m, n, m, k, k);
        System.out.println(ans);

    }

}
