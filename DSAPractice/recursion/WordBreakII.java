
//https://www.codingninjas.com/codestudio/problems/983635?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
/*
 * 
 * 
 * void breakword(string &s,unordered_map<string,bool>& mapp,string &tmp,vector<string>&ans,int ind)
{
   if(ind==s.size())
   {
       ans.push_back(tmp);
       return;
   }
   for(int i=ind;i<s.size();i++)
   {
       string sub = s.substr(ind,i-ind+1);
       if(mapp[sub])
       {
           tmp = tmp+sub+" ";
           breakword(s,mapp,tmp,ans,i+1);
           //backtrack
           for(int i=0;i<=sub.size();i++)
               tmp.pop_back();
       }
   }
}

vector<string> wordBreak(string &s, vector<string> &dictionary)
{
   // Write your code here
   unordered_map<string,bool> mapp;
   for(string ele : dictionary)
       mapp[ele] = true;
   
   string tmp="";
   vector<string> ans;
   breakword(s,mapp,tmp,ans,0);
   return ans;
}
 */
import java.io.*;
import java.util.*;

class WordBreakII {
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
        int k = nextInt();
        ArrayList<String> dictionary = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            dictionary.add(next());
        }
        String seq = next();
        ArrayList<String> sam = new ArrayList<>();
        wordBreak(0, sam, ans, seq, dictionary);

        System.out.println(ans);
    }

    static void wordBreak(int ind, ArrayList<String> sam, ArrayList<String> ans,
            String s, ArrayList<String> dictionary) {

        if (ind == s.length()) {
            ans.add(listToString(sam));
            // sam.removeAll(sam);
        }

        // System.out.println("ind value:" + ind);
        for (int i = ind; i < s.length(); i++) {
            // System.out.println("value of i:" + i);
            // System.out.println("value of ind:" + ind);
            if (ind == s.length() || i == s.length()) {
                break;
            }
            String firstHalf = s.substring(ind, ind + (i - ind + 1));
            // System.out.println("firsthalf:" + firstHalf);
            // System.out.println("checking " + firstHalf + " in dictionary...");
            if (dictionary.contains(firstHalf)) {
                // System.out.println("its present!");
                sam.add(firstHalf);
                // System.out.println("added to sam...");
                // System.out.println("-------------------------------");
                // System.out.println(sam);

                wordBreak(i + 1, sam, ans, s, dictionary);
                // System.out.println("after returning from recursion sam value:" + sam);
                sam.remove(sam.size() - 1);
            }
            // System.out.println("not present! :( ");

        }

    }

    static String listToString(ArrayList<String> h) {
        String m = "";
        for (int i = 0; i < h.size(); i++) {
            m += h.get(i) + " ";
        }
        return m.trim();
    }

}
