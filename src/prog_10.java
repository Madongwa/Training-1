//linear search
public class prog_10 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int n=arr.length;
		int number=20;
		boolean num=false;
		for(int i=0; i<=n-1;i++) {
			if(arr[i]==number) {
				num=true;
				System.out.println("value was found on: "+(i+1));
			}
		}
		if(num==false) {
			System.out.println("not found");
		}

	}

}
