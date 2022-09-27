import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        int heightSum = 0;
        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            heightSum += arr[i];
        }

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(heightSum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for(int k = 2; k < arr.length; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
	}
}
