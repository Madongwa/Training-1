//number of positive negetive and zero
public class prog_9 {

	public static void main(String[] args) {
		int[] arr= {10,20,0,-12,-50};
		int n=arr.length;
		int pos=0, neg=0, zero=0;
		for(int i=0;i<=n-1;i++) {
			if(arr[i]>0) {
				pos++;
			}
			else if(arr[i]<0) {
				neg++;
			}
			else {
				zero++;
			}
		}
		System.out.println("positive: "+pos);
		System.out.println("negetive: "+neg);
		System.out.println("zero: "+zero);
				
	}

}
