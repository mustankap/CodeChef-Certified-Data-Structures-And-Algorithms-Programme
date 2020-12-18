package testJava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

 
 
public class drazilfactorialcodeforces {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int b = Integer.parseInt(br.readLine());
 
        if (b < 1 || b > 15){
            System.out.println();
        }
        else {
            int[] list = new int[15];
            ArrayList<Integer> big = new ArrayList<Integer>();
 
            for (int i = 0; i < b; i++) { 
             list[i] = br.read();
                switch (list[i]) {
                    case 49:
                        list[i] = 1;
                        break;
                    case 50:
                        list[i] = 2;
                        break;
                    case 51:
                        list[i] = 3;
                        break;
                    case 52:
                        list[i] = 4;
                        break;
                    case 53:
                        list[i] = 5;
                        break;
                    case 54:
                        list[i] = 6;
                        break;
                    case 55:
                        list[i] = 7;
                        break;
                    case 56:
                        list[i] = 8;
                        break;
                    case 57:
                        list[i] = 9;
                        break;
                    case 48:
                        list[i] = 0;
                        break;
                    default:
                        break;
                }
            }
 
            int max = 0;
 
            for (int i = 0; i < b; i++) { 
                if (list[i] % 2 == 1 && list[i] != 9) {
                    max++;
                }
            }
 
            int j;
 
            if (max == b) {
                for (j = 0; j < b; j++) { 
                	for (int i = 0; i < b; i++) {
                        if (list[i] < list[j]) {
                            int f = list[i];
                            list[i] = list[j];
                            list[j] = f;
                        }
                    }
                }
            }
 
            for (int i = 0; i < b; i++) {
                switch (list[i]) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        big.add(2);
                        break;
                    case 3:
                        big.add(3);
                        break;
                    case 4:
                        big.add(3);
                        big.add(2);
                        big.add(2);
                        break;
                    case 5:
                        big.add(5);
                        break;
                    case 6:
                        big.add(5);
                        big.add(3);
                        break;
                    case 7:
                        big.add(7);
                        break;
                    case 8:
                        big.add(7);
                        big.add(2);
                        big.add(2);
                        big.add(2);
                        break;
                    case 9:
                        big.add(7);
                        big.add(3);
                        big.add(3);
                        big.add(2);
                        break;
                    default:
                        break;
                }
            }
 
            int[] bigAr = new int[big.size()];
            for (int i = 0; i < bigAr.length; i++)
                bigAr[i] = big.get(i);
 
            for (j = 0; j < bigAr.length; j++) {
                for (int i = 0; i < bigAr.length; i++) {
                    if (bigAr[i] < bigAr[j]) {
                        int f = bigAr[i];
                        bigAr[i] = bigAr[j];
                        bigAr[j] = f;
                    }
                }
            }
 
 
            for (int i = 0; i < bigAr.length; i++)
                System.out.print(bigAr[i]);
 
        }
 
 
    }
}

      


