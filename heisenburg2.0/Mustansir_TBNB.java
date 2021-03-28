import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
 
public class Mustansir_TBNB {
 
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        double c=0.0;
        for(int T=1;T<=t;T++)
        {
            String[] st = br.readLine().split(" "); 
            int second=Integer.parseInt(st[1]);
            int first=Integer.parseInt(st[0]);
            double avg=0;
            if(first==10||second==10)
            {
                avg = (first+second)/2.0;
                if(avg>=7.5)
                {
                    c++;
                }
            }
        }

        double gen = (c/t)*100.0;
        
        if(gen>=50)
        {
            System.out.println("genius");
        }
        else{
            System.out.println("Not Genius Yet");
        }
    }
}
