class FlipCoin
{
	public static void main(String args[])
	{

		int n = 10;
		int headCount = 0;
		int tailCount = 0;
		for(int i=1; i<= n; i++)
		{
			double checkCoin =  Math.random();
			if(checkCoin > 0.5)
			{
				headCount++;
			}
			else
			{
				tailCount++;
			}
		}
	
		System.out.println("HeadCount:"+headCount);
		System.out.println("TailCount:"+tailCount);
	
		int PercentHead = (headCount * 100) / 10;
		int PercentTail = (tailCount * 100) / 10;

		System.out.println("The Percentage of Heads is : " + PercentHead);
		System.out.println("The Percentage of Tails is : " + PercentTail);	
	}
}