//find average of its elements
public class prog_5 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int n=arr.length;
		int sum=0;
		for(int i=0; i<=n-1; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum/n);

	}

}
