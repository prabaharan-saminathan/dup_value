public class com_3 {//duplicate element

	public static void main(String[] args) {
		int []a= {1,1,2,3,2,3,4,4,5};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}
