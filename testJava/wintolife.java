import java.io.*;
import java.util.*;
import java.util.stream.*;
 
 
public class wintolife {
 
public static void main(String[] args)throws IOException {
 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
long t=Long.parseLong(br.readLine());

for(long i=0;i<t;i++)
{
    String[] nk = br.readLine().split(" "); 
    int n = Integer.parseInt(nk[0]);
    int k = Integer.parseInt(nk[1]);
    String[] ar = br.readLine().split(" ");
    int[] nums=new int[n];
    for(int m =0;m<n;m++)
    {
        nums[m]=Integer.parseInt(ar[m]);
    }
    List<Integer> arr = Arrays.stream(nums).boxed().collect(Collectors.toList());
    int mod = 0;
    for(int j = 0;j<arr.size();j++)
    {   
        if(k%arr.get(j)==0)
            arr.set(j,k/arr.get(j));
        else
            arr.set(j,-1);
    }

    Collections.sort(arr);
    int jd=0;
    while(arr.get(jd)<0) {
        arr.remove(jd);
    }
    System.out.println(arr.get(0) +" " +arr.get(arr.size()-1));
}
}
}