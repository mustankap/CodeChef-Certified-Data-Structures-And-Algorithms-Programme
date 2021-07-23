/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */

 import java.util.*;

class InsertIntoLinkedList {
    public LLNode solve(LLNode head, int pos, int val) {
        
        if(pos==0)
        {
            LLNode new_node = new LLNode(val,head);
            return new_node;
        }
        else{
            LLNode new_node = new LLNode(val);
            LLNode pointer = head;
            for(int i=0;i<pos-1;i++)
            {
                pointer= pointer.next;
               
            }
            new_node.next=pointer.next;
            pointer.next = new_node;

        }      
        return head;
    }
}

// class Solution {
//     public LLNode solve(LLNode head, int pos, int val) {
//         if (pos == 0) {
//             LLNode ans = new LLNode(val, head);
//             return ans;
//         }
//         LLNode temp = head;
//         while (pos > 1) {
//             temp = temp.next;
//             pos--;
//         }
//         temp.next = new LLNode(val, temp.next);
//         return head;
//     }
// }
