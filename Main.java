import java.io.*;
import java.util.*;

public class Main {

    static final int MOD = (int) 1e9 + 7;
    public static void main(String args[]) throws IOException {
        FastReader scn = new FastReader();

        // int t = scn.nextInt();
        // while (t-- > 0) {
        //   // code
        //     }
        // int n = scn.nextInt();
          
        //   int ht = log2(n-1);

          System.out.println(highestPowerof2(20));
  
   
 
    }

                //highest power of 2 using log (takes logn time)
    static int log2(int n)
{
     
    int p = (int)(Math.log(n) /
                  Math.log(2));
    return (int)Math.pow(2, p);
}


                  // higest power of 2 takes ( O(1)) time fastest

  static int highestPowerof2(int x)
    {
       
        // check for the set bits
        x |= x >> 1;
        x |= x >> 2;
        x |= x >> 4;
        x |= x >> 8;
        x |= x >> 16;
         
        // Then we remove all but the top bit by xor'ing the
        // string of 1's with that string of 1's shifted one to
        // the left, and we end up with just the one top bit
        // followed by 0's.
        return x ^ (x >> 1); 
     
    }

    static class FastReader {
        InputStreamReader ir;
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            ir = new InputStreamReader(System.in);
            br = new BufferedReader(ir);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

   

}