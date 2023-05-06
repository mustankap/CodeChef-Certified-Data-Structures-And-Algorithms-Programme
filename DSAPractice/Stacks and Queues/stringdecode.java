import java.util.*;

class stringdecode {

    public static void main(String[] args) {
        System.out.println("the decoded string is"+decodedString("3[a3[b]1[ab]]"));//abbbababbbababbbab
    }

    static String decodedString(String s) {
        // code here
        Stack<Integer> sti = new Stack<>();
        Stack<Character> stc = new Stack<>();
        String result = "", temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                if (i == 0)
                    stc.push(s.charAt(i));
                else if (Character.isDigit(s.charAt(i - 1))) {
                    stc.push(s.charAt(i));

                } else {
                    sti.push(1);
                    stc.push(s.charAt(i));
                }
              System.out.println(Arrays.toString(sti.toArray()));  
              System.out.println(Arrays.toString(stc.toArray()));  
            } else if (s.charAt(i) == ']') {
                temp = "";
                int count = sti.peek();
                while (!stc.empty() && stc.peek() == '[')
                    temp += stc.pop();System.out.println(temp);

                for (int j = 0; j < count; j++)
                    result = result + temp; 
                sti.pop();
                stc.pop();
                
                for (int j = 0; j < result.length(); j++)
                    stc.push(result.charAt(j));

               result="";
               System.out.println(Arrays.toString(sti.toArray()));  
               System.out.println(Arrays.toString(stc.toArray()));  
                
            } else if (Character.isDigit(s.charAt(i))) {
                int no = 0;
                while (Character.isDigit(s.charAt(i))) {
                    no = no * 10 + s.charAt(i) - '0';
                    i++;
                    
                }
                sti.push(no);
                i--;

                System.out.println(Arrays.toString(sti.toArray()));  
                System.out.println(Arrays.toString(stc.toArray()));  
                
            } else {
                stc.push(s.charAt(i));
                System.out.println(Arrays.toString(sti.toArray()));  
                System.out.println(Arrays.toString(stc.toArray()));  
            }

        }

        String ans = "";
        while (!stc.empty())
            ans += stc.peek();stc.pop();

        return ans;

    }
}
/**
 * 
 * 
import java.util.Stack;
 
class Test
{
    // Returns decoded string for 'str'
    static String decode(String str)
    {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";
      
        // Traversing the string
        for (int i = 0; i < str.length(); i++)
        {
            int count = 0;
      
            // If number, convert it into number
            // and push it into integerstack.
            if (Character.isDigit(str.charAt(i)))
            {
                while (Character.isDigit(str.charAt(i)))
                {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
      
                i--;
                integerstack.push(count);
            }
      
            // If closing bracket ']', pop element until
            // '[' opening bracket is not found in the
            // character stack.
            else if (str.charAt(i) == ']')
            {
                temp = "";
                count = 0;
      
                if (!integerstack.isEmpty())
                {
                    count = integerstack.peek();
                    integerstack.pop();
                }
      
                while (!stringstack.isEmpty() && stringstack.peek()!='[' )
                {
                    temp = stringstack.peek() + temp;
                    stringstack.pop();
                }
      
                if (!stringstack.empty() && stringstack.peek() == '[')
                    stringstack.pop();
      
                // Repeating the popped string 'temo' count
                // number of times.
                for (int j = 0; j < count; j++)
                    result = result + temp;
      
                // Push it in the character stack.
                for (int j = 0; j < result.length(); j++)
                    stringstack.push(result.charAt(j));
      
                result = "";
            }
      
            // If '[' opening bracket, push it into character stack.
            else if (str.charAt(i) == '[')
            {
                if (Character.isDigit(str.charAt(i-1)))
                    stringstack.push(str.charAt(i));
      
                else
                {
                    stringstack.push(str.charAt(i));
                    integerstack.push(1);
                }
            }
      
            else
                stringstack.push(str.charAt(i));
        }
      
        // Pop all the element, make a string and return.
        while (!stringstack.isEmpty())
        {
            result = stringstack.peek() + result;
            stringstack.pop();
        }
      
        return result;
    }
 
    // Driver method
    public static void main(String args[])
    {
        String str = "3[b2[ca]]";
        System.out.println(decode(str));
    }
}
 */
