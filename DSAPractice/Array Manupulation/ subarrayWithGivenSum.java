
// https://www.geeksforgeeks.org/find-subarray-with-given-sum/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public class subarrayWithGivenSum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        List<Integer> ar = new ArrayList<Integer>(Collections.nCopies(st.length, 0));
        
        for (int i = 0; i < ar.size(); i++) {
            ar.set(Integer.parseInt(st[0]),i);
        }

        int tot = ar.stream().mapToInt(Integer::intValue).sum();

        //sliding window


    }
}