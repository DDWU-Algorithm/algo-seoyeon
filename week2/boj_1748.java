import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = br.readLine();
		int length = strNum.length();
		int n = Integer.parseInt(strNum);
		
		int sum = 0;
		for(int i = 0; i < length; i++) {
		    if(i == length - 1) {
		        sum += (n - Math.pow(10, i) + 1) * (i + 1);
		    }
		    else {
		        sum += (Math.pow(10, i + 1) - Math.pow(10, i)) * (i + 1);
		    }
		}
		System.out.println(sum);
	}
}
