
public class prog_13 {

	public static void main(String[] args) {
		int[] arr= {1,2,4,3,6,2,1,2,5,3,2,2,3,1,4,2};
		int n=arr.length;
		int count=0;
		int num=2;
		for(int i=0; i<=n-1;i++) {
			if(arr[i]==num) {
				num++;
			}
		}
		System.out.println("the number of time repeated is: "+num);

	}

}
