//odd and even numbers in an array
public class prog_8 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int n=arr.length;
		int even=0,odd=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("odd :"+odd);
		System.out.print("even: "+even);

	}

}
