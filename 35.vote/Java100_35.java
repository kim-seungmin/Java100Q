class Solution{		
	public void solutionMethod(int num, int[] voted){
		int[] candidate = new int[num+1];
		
		//count voted
		for(int i=0;i<voted.length;i++){
			candidate[voted[i]]++;
		}
		
		//print voted
		for(int i=1;i<4;i++){
			System.out.println(i+"�� �ĺ� --> "+candidate[i]+" ǥ");
		}
		
		//win		
		int winer = 0;
		int winerTicket=candidate[0];
		for(int i=1;i<4;i++){
			if(candidate[winer]<candidate[i]){
				winer=i;
				winerTicket=candidate[i];
			}
		}
		
		System.out.println("���� ���� ��ǥ��: "+winerTicket+"ǥ, "+winer+"�ĺ�");
		
		//check half
		boolean majority=winerTicket<=(voted.length/(double)2);
		if(majority)System.out.println("���ݼ� �̻� ���� -> �̴缱");
		else System.out.println("���ݼ� ��� -> "+winer+"�ĺ� �缱");
	}
}

public class Java100_35{
	public static void main(String[] args){
		Solution s1 = new Solution();

		int[] vote_box = {1,3,1,3,3,2,2};

		s1.solutionMethod(3, vote_box);
	}
}