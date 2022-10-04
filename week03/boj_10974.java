import java.io.*;
import java.util.*;

public class Main
{
    private static int N;
	private static int arr[];
	private static boolean visited[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
        arr = new int[N];
		visited = new boolean[N];

		perm(0);
	}
	
	private static void perm(int cnt) {
	    if(cnt == N) {
	        for(int i = 0; i < N; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        return;
	    }
	    
	    for(int i = 0; i < N; i++) {
	        if(!visited[i]) {
	            arr[cnt] = i+1;
	            visited[i] = true;
	            perm(cnt+1);
	            visited[i] = false;
	        }
	    }
	}
}
