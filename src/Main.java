import java.util.Scanner;

public class Main {
	
	private static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int low = 0, high = Integer.MAX_VALUE;
		while(low <= high) {
			int mid = (low + high)/2;
			if(func(mid, m,arr)) {
				if(func(mid-1, m, arr)) {
					high = mid-1;
				}
				else {
					System.out.println(mid);
				}
			}
			else {
				low  = mid+1;
			}
		}
		 System.out.println(-1);
	}
	private static boolean func(int time, int items , int[] arr) {
		int count  = 0;
		for(int ele: arr) {
			count += ele/time;
		}
		return count >= items;
	}

}
