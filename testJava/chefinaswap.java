/**
 * import java.util.*;
import java.io.*;
class ChefChefinaSwipes{
	// remove the same number from each sequence
	// with the remaining sequence, see if the frequency of same number is even (a&b)
	// if odd, print -1

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t= Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++){
			int n= Integer.parseInt(br.readLine());
			HashMap<Integer,Integer> total= new HashMap<Integer,Integer>();
			HashMap<Integer,Integer> amap= new HashMap<Integer,Integer>();
			HashMap<Integer,Integer> bmap= new HashMap<Integer,Integer>();
			String[] a= br.readLine().split(" ");
			String[] b= br.readLine().split(" "); 
			ArrayList<Integer> aa= new ArrayList<> ();
			ArrayList<Integer> bb= new ArrayList<> ();
			for(int j=0; j<n ; j++){
				aa.add(Integer.parseInt(a[j]));
				bb.add(Integer.parseInt(b[j]));
			}
			for(int j=0; j<n ; j++){
				if(amap.containsKey(aa.get(j))){
					amap.put(aa.get(j), amap.get(aa.get(j))+1); // frequency of each
				}
				else{
					amap.put(aa.get(j), 1);
				}
				if(bmap.containsKey(bb.get(j))){
					bmap.put(bb.get(j), bmap.get(bb.get(j))+1);
				}
				else{
					bmap.put(bb.get(j), 1);
				}
			}
			for(int j=0; j<n ; j++){
				if(total.containsKey(aa.get(j))){
					total.put(aa.get(j), total.get(aa.get(j))+1);
				}
				else{
					total.put(aa.get(j), 1);
				}
				if(total.containsKey(bb.get(j))){
					total.put(bb.get(j), total.get(bb.get(j))+1);
				}
				else{
					total.put(bb.get(j), 1);
				}

			}

			ArrayList<Integer> al= new ArrayList<> ();
			ArrayList<Integer> bl= new ArrayList<> ();
			int ind=0;
			for(int key: total.keySet()){
				if(total.get(key)%2==1){
					System.out.println("-1");
					ind=-1;
					break;
				}
			}
			if(ind==0){
				for(int key : amap.keySet()){
					if(amap.get(key)>total.get(key)/2){
						for(int k=0; k<amap.get(key)-total.get(key)/2 ; k++){
					 	al.add(key);
					} 
				}
			}
			for(int key : bmap.keySet()){
				if(bmap.get(key)>total.get(key)/2){
					for(int k=0; k<bmap.get(key)-total.get(key)/2 ; k++){
					 	bl.add(key);
					 } 
				}
			}
			Collections.sort(al);
			Collections.sort(bl);
			long cost=0;
			int keymin=1000000000;
			for(int key2: total.keySet()){
				keymin=Math.min(key2, keymin);
			}
			int mincost=keymin*2;

			for(int j=0; j<al.size(); j++){
				if(Math.min(al.get(j),bl.get(al.size()-(j+1)))>mincost){
					cost= cost+mincost;
				}
				else{
					cost= cost+Math.min(al.get(j),bl.get(al.size()-(j+1)));
				}
			}

			System.out.println(cost+"");
			
			}
			
			
		}

		br.close();
	}
}

 * 
 * 
 * 
 * 
 * 
 * 
 * for _ in range(int(input())):
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    aa, bb = {}, {}
    ans = 0
    dd = min(min(a), min(b))
    for i in range(n):
        if a[i] not in aa:
            aa[a[i]] = 1
        else:
            aa[a[i]] += 1
        if b[i] not in bb:
            bb[b[i]] = 1
        else:
            bb[b[i]] += 1
    kkk = {}
    c, d = [], []
    p, q = 0, 0
    for i in aa:
        if i in kkk:
            continue
        kkk[i] = 1
        if i in bb:
            if aa[i] == bb[i]:
                continue
            if (aa[i]+bb[i])%2 != 0:
                ans = -1
                break
            if aa[i] > bb[i]:
                for j in range((aa[i]-bb[i])//2):
                    c.append([i, "a"])
                    p += 1
            else:
                for j in range((bb[i]-aa[i])//2):
                    c.append([i, "b"])
                    q += 1
        else:
            if aa[i]%2 != 0:
                ans = -1
                break
            for j in range(aa[i]//2):
                c.append([i, "a"])
                p += 1
    for i in bb:
        if i in kkk:
            continue
        kkk[i] = 1
        if i in aa:
            if aa[i] == bb[i]:
                continue
            if (aa[i]+bb[i])%2 != 0:
                ans = -1
                break
            if aa[i] > bb[i]:
                for j in range((aa[i]-bb[i])//2):
                    c.append([i, "a"])
                    p += 1
            else:
                for j in range((bb[i]-aa[i])//2):
                    c.append([i, "b"])
                    q += 1
        else:
            if bb[i]%2 != 0:
                ans = -1
                break
            for j in range(bb[i]//2):
                c.append([i, "b"])
                q += 1
    if ans == -1 or p != q:
        print(-1)
        continue
    if p==0:
        print(0)
        continue
    c.sort()

    if dd >= c[0][0]:
        ans += c[0][0]
        for i in range(1, p):
            if c[i][0]>(2*c[0][0]):
                ans += (2*c[0][0])
            else:
                ans += c[i][0]
    else:
        for i in range(p):
            if c[i][0]>(2*dd):
                ans += (2*dd)
            else:
                ans += c[i][0]
    print(ans)*/
package testJava;

import java.util.Scanner;
import java.util.*;
public class chefinaswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0)
		{
			int n =sc.nextInt(),i,cost=0;
			int a[]=new int[n];
			int b[]=new int[n];
			
			for(i =0 ; i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			for(i =0 ; i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			
			Arrays.parallelSort(a);
			Arrays.parallelSort(b);
			
			int ui[]=new int[2*n];
			
			for (i = 0; i < n; i++)  
	        {ui[i]=a[i]; }
			
			for (i = 0; i < n; i++)  
	        {ui[i+n]=b[i]; }
	        
			int res = 0; 
	        for (i = 0; i < ui.length; i++)  
	        { 
	            res = res ^ ui[i]; 
	        } 
	        
	        if(res!=0)
	        {
	        	System.out.println("-1");
	        	continue;
	        }
				
			
				int mina=Arrays.stream(a).min().getAsInt();
				int minb=Arrays.stream(b).min().getAsInt();
				int ovrmin=Math.min(mina, minb);
				int twicovrmin=2*ovrmin;
				
				
				for(i=0;i<n;i++)
				{  
					int jt=Math.min(a[i], b[i]);
				
				if(a[i]!=b[i])
				{
					if(jt>=twicovrmin)
					{	a[i] = a[i] ^ b[i]; 
			        	b[i] = a[i] ^ b[i]; 
			        	a[i] = a[i] ^ b[i];
						cost+=twicovrmin;
					}
					else 
						{
						a[i] = a[i] ^ b[i]; 
				        b[i] = a[i] ^ b[i]; 
				        a[i] = a[i] ^ b[i];
						cost+=jt;
						}
				}
				Arrays.parallelSort(a);
				Arrays.parallelSort(b);
				
				}
				
				
			System.out.println(cost);	
			
			
		}
		
	}
	
}


