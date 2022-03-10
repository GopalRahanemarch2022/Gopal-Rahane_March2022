class q13
{
	public static void main(String args [])
	{	
	char i,l,j,sp=1;
		for( i='a';i<='e';i++)
		{
			for( l=5;l>=sp;l--)
			{
				System.out.print(" ");
				sp++;
				
			}
			for( j='a';j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			
			
			System.out.println();
		}
		
	}
}