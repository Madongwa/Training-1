//reverse an array
public class prog_16 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int n=arr.length;
		int[] rev=new int[n];
		for(int i=n-1;i>=0;i--) {
			rev[i]=arr[i];
		}
		for(int i=n-1;i>=0;i--) {
			System.out.print(rev[i]+" ");}
	}

}
