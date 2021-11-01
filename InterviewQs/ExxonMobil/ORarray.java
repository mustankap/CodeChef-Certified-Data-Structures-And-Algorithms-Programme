import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ORarray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] ar = br.readLine().split(" ");
        BigInteger[] st = new BigInteger[ar.length];

        for (int i = 0; i < ar.length; i++) {
            st[i] = BigInteger.valueOf(Integer.parseInt(ar[i]));
        }

    
    }
}