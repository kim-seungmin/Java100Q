public class Java100_29{
	public static void main(String[] args){
		int[] score={50,60,70,80,90,100};
		int scoreLength=score.length;
		int[] rank=new int[scoreLength];
		for(int i=0;i<scoreLength;i++){
			rank[i]=1;
			for(int j=i;j<scoreLength;j++){
				if(score[i]<score[j])rank[i]++;
			}
		}
		
		for(int i=0;i<scoreLength;i++){
			System.out.println(score[i]+" - "+rank[i]);
		}
	}
}
