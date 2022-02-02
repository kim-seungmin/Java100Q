class Java100_26{
	public static void main(String[] args){
		int a[]={3,8,1,20,100,500,6};
		System.out.println(max(a));
		System.out.println(min(a));
	}
	
	public static int max(int[] a){
		int maxNum=a[0];
		for(int i=1;i<a.length;i++){
			if(maxNum<a[i])maxNum=a[i];
		}
		return maxNum;
	}
	public static int min(int[] a){
		int minNum=a[0];
		for(int num:a){
			if(minNum>num)minNum=num;
		}
		return minNum;
	}
}
