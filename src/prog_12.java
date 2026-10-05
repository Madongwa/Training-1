//last occurance for the element
public class prog_12 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,10,20,30,40,20,20,10};
		int n=arr.length;
		int num=20;
		int occurance=n-1;
		for(int i=n-1;i>=0;i--) {
			if(num==arr[i]) {
				System.out.println("Last occurance for "+num+" is at: "+(i+1));
				break;
			}
		}

	}

}
