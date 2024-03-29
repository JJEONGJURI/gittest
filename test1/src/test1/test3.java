package test1;

public class test3 {

	public static void main(String[] args) {
		int i, j;
		int temp;
		int a[] = {14,22,53,45,1};
		
		for(i=0; i<a.length; i++) {
			for(j=0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(i=0; i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
