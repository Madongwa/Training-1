//max and min element
public class prog_6 {

	public static void main(String[] args) {
			int[] arr= {10,20,30,40,50};
			int n=arr.length;
			int max=arr[0], min=arr[0];
			for(int i=0;i<=n-1;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
				if(arr[i]<min) {
					min=arr[i];
				}
			}System.out.println("max: "+max);
			System.out.println("min: "+min);
	}

}
