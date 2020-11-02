package countDiv;

public class Solution {
	
	int count = 0 ;
	public int solution(int A, int B, int K)
	{
		for (int i = A; i < B; i++) {
			if(i%K==0)
			{
				count++;
			}
		}
		
		return count;
	}
}

