//copy an array
public class prog_14 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int n=arr.length;
		int[] copy=new int[n];
		for(int i=0;i<=n-1;i++) {
			copy[i]=arr[i];
		}
		System.out.print("The copy array: ");
		for(int i=0;i<n;i++) {
			System.out.print(copy[i]+" ");
		}

	}

}
