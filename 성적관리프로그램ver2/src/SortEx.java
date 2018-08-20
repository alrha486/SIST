
 class SortEx {
	public static void main(String[] args) {
		int [] a = new int[] {10,84,37,17,65,67,27,41,55};
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=0;j<a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0; i<a.length;i++)
		System.out.println(a[i]);
	}
}
