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
		
		
		int beforeAscIdx = -2;
	    for(int i = n-1; i > 0; i--) {
	        if(arr[i-1] > arr[i]) {
	            beforeAscIdx = i-1;
	            break;
	        }
	    }
	    
	    if(beforeAscIdx == -2) {
	        System.out.println("-1");
	        return;
	    }
	    
	    // beforeAscIdx element <-> (뒤에서 부터 비교했을 때) 보다 작은 element
	    for(int i = n-1; i > beforeAscIdx; i--) {
	        if(arr[i] < arr[beforeAscIdx]) {
	            int tmp = arr[i];
	            arr[i] = arr[beforeAscIdx];
	            arr[beforeAscIdx] = tmp;
	            break;
	        }
	    }
	    
	    // beforeAscIdx +1 ~ length 내림차순 sort 
	    
	    
		//Arrays.sort(intArr, beforeAscIdx+1, n+1, Comparator.reverseOrder());
		
		int[] s = Arrays.copyOfRange(arr, beforeAscIdx+1, n);
		Integer[] sArr = Arrays.stream(s).boxed().toArray(Integer[]::new);
		
		Arrays.sort(sArr, Collections.reverseOrder());
		int sArray[] = Arrays.stream(sArr).mapToInt(Integer::intValue).toArray(); 
		

		for(int i = 0; i < s.length; i++) {
		    arr[i+beforeAscIdx+1] = sArray[i];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
		    sb.append(arr[i] + " ");
		}
		System.out.print(sb);
	}
}
