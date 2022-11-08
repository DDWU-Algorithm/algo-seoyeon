import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int[] sumArr = new int[11];
	    sumArr[1] = 1;
	    sumArr[2] = 2;
	    sumArr[3] = 4;
	    
	    for(int i = 4; i < 11; i++) {
	        sumArr[i] = sumArr[i-1] + sumArr[i-2] + sumArr[i-3];
	    }
	    
	    int m = Integer.parseInt(br.readLine());
	    for(int i = 0; i < m; i++) {
	        int n = Integer.parseInt(br.readLine());
	        System.out.println(sumArr[n]);
	    }
	}
}
