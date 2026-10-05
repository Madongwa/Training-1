//2nd min and 2nd max
public class prog_7 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int n=arr.length;
		int max=arr[0], min=arr[n-1];
		int max2=arr[0], min2=arr[n-1];
		for(int i=0;i<=n-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
				max2=arr[i-1];
			}
		}
		for(int i=n-1; i>=0;i--) {
			if(arr[i]<min) {
				min=arr[i];
				min2=arr[i+1];
			}
		}
		System.out.println("2nd max: "+max2);
		System.out.println("2nd min: "+min2);

	}

}
