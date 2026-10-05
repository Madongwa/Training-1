//linear search
public class prog_10 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int n=arr.length;
		int number=20;
		for(int i=0; i<=n-1;i++) {
			if(arr[i]==number) {
				System.out.println("number is in: "+(i+1));
			}
			else
				System.out.println("not found");
		}

	}

}
