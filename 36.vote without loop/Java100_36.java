import java.util.Arrays;

class Solution{
	public void solutionMethod(int num, int[] voted){
		int[] candidate = new int[num+1];

		//count voted
		for(int i=0;i<voted.length;i++){
			candidate[voted[i]]++;
		}

		//print voted
		for(int i=1;i<4;i++){
			System.out.println(i+"번 후보 --> "+candidate[i]+" 표");
		}

		//win no loop
		Arrays.sort(candidate);
		System.out.println("lowst voted: "+candidate[1]);
		System.out.println("most voted: "+candidate[candidate.length-1]);
		int winerTicket = candidate[candidate.length-1];

		//check half
		boolean majority=winerTicket<=(voted.length/(double)2);
		if(majority)System.out.println("과반수 이상 실패 -> 미당선");
		else System.out.println("과반수 통과 -> "+"후보 당선");
	}
}

public class Java100_36{
	public static void main(String[] args){
		Solution s1 = new Solution();

		int[] vote_box = {1,3,1,3,3,2,2};

		s1.solutionMethod(3, vote_box);
	}
}
