import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }
        Arrays.sort(t);
        int id = 0;
        int[] a = new int[n];
        for (int i = 0; i + 1 < n; i++) {
            if (t[i] != t[i + 1]) {
                a[id++] =  t[i];
            }
        }
        if (t[n - 1] != a[n - 1]) {
            a[id++] = t[n - 1];
        }
        boolean checker = false;
        for (int i = 0; i + 2 < id; i++) {
            checker |= (a[i + 1] - a[i] <= 2 && a[i + 2] - a[i + 1] <= 2 && a[i + 2] - a[i] <= 2);
        }
        System.out.println(checker ? "YES" : "NO");
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
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
            } catch(IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
