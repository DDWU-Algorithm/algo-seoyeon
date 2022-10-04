import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
		    arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int beforeDescIdx = -2;
	    for(int i = n-1; i > 0; i--) {
	        if(arr[i-1] < arr[i]) {
	            beforeDescIdx = i-1;
	            break;
	        }
	    }
	    
	    if(beforeDescIdx == -2) {
	        System.out.println("-1");
	        return;
	    }
	    
	    // beforeDescIdx element <-> (뒤에서 부터 비교했을 때) 보다 큰 element
	    for(int i = n-1; i > beforeDescIdx; i--) {
	        if(arr[i] > arr[beforeDescIdx]) {
	            int tmp = arr[i];
	            arr[i] = arr[beforeDescIdx];
	            arr[beforeDescIdx] = tmp;
	            break;
	        }
	    }
	    
		// beforeDescIdx +1 ~ length 오름차순 sort 
		Arrays.sort(arr, beforeDescIdx+1, n);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
		    sb.append(arr[i] + " ");
		}
		System.out.print(sb);
	}
}
