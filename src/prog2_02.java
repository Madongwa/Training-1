
public class prog2_02 {

	static void rotate(int[] a, int k) {
		if(a.length == 0)
			return;
		k%=a.length;
		reverse(a,0,a.length-1);
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
	}
	

}
