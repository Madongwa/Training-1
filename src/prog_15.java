//to check if array is equal
public class prog_15 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int[] b= {10,20,30,4o};
		boolean array=true;
		if(a.length != b.length) {
			array=false;
		}else {
			for(int i=0; i<=a.length-1;i++) {
				if(a[i]!=b[i]) {
					array = false;
					break;
				}
			}
		}
if(array==true) {
	System.out.println("Arrays are equal");
}
else {
	System.out.println("Array isnt equal");
}
	}

}
