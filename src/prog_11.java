//find first occurance
public class prog_11 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,20,40,20,30,10};
		int num=20;
		int count=0, first=0;
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			if(num==arr[i]) {
				System.out.println("its First occurence is at: "+(i+1));
				break;
			}
		}
		

	}

}
