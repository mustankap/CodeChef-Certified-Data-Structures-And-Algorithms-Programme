import java.util.*;
import java.io.*;

class Subsetsall{
    static BufferedReader br;
    static StringTokenizer st;

    static int nextInt() throws IOException
    {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException
    {
        return Long.parseLong(next());
    }
    static String next()throws IOException
    {
        while(st==null || !st.hasMoreTokens())
        {
            st=new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public void main(String[] args)throws IOException {
        br= new BufferedReader(new InputStreamReader(System.in));
        int t=nextInt();
        while(t-->0)
        {
            input();
        }
        br.close();
    }

    void input() throws IOException
    {
        int n = nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
            arr[i]=nextInt();
        
        List<List<Integer>> anslist = new ArrayList<>();
        int a = nextInt();
        switch(a)
        {
            case 1:
            listOfAllSubset(0,arr,new ArrayList<>(),anslist);
            System.out.println(anslist);
            break;
            case 2:
            System.out.println(sumOfAllSubset(0,n-1,0,arr,new ArrayList<>()));
            break;
            case 3:
            int target = nextInt();
            CombinationSum(0,target,arr,new ArrayList<>(),anslist);
        }
        
        
        
        CombinationSum2(0,n,arr,new ArrayList<>(),anslist);

         
    }
    public void listOfAllSubset(int ind,int[] arr,List<Integer> ds,List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(ds));
        for(int i = ind;i<arr.length;i++)
        {
            if(i!=ind && arr[i]==arr[i-1])
            {
                continue;
            }

            ds.add(arr[i]);
            listOfAllSubset(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
    
        }
    }

    public List<Integer> sumOfAllSubset(int l, int r, int sum, int arr[], List<Integer> ds)
    {
        if(l>r)
        {
            ds.add(sum);
            return ds;
        }
        sumOfAllSubset(l+1,r,sum+arr[l],arr,ds);
        sumOfAllSubset(l+1,r,sum,arr,ds);
        return ds;
    }

    public List<List<Integer>> CombinationSum(int index,int target,int[] arr,List<Integer> ds,List<List<Integer>> anslist)
    {
        
        if(arr.length==index)
        {
            if(target == 0)
            {
                anslist.add(new ArrayList<>(ds));
                return anslist;

            }
        }
        if(target>=arr[index])
        {
            ds.add(arr[index]);
            anslist=CombinationSum(index,target-arr[index],arr,ds,anslist);
           ds.remove(ds.size()-1);
        }
        anslist=CombinationSum(index+1,target,arr,ds,anslist);
        return anslist;
    }

    public void CombinationSum2(int index,int target,int[] arr,List<Integer> ds,List<List<Integer>> anslist)
    {
        if(target == 0)
            {
                anslist.add(new ArrayList<>(ds));
                return ;
            }

        for(int i = index;i<arr.length;i++)
        {
            if(i>index&& arr[i]==arr[i-1])
            {
                continue;
            }
            else if(target<arr[i])
            {
                return;
            }
            ds.add(arr[i]);
            CombinationSum2(i+1,target-arr[i],arr,ds,anslist);
            ds.remove(ds.size()-1);
        }
    }
}


