class q36
{
	public static void main(String args[])
		{
			int n=9;
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
					{
						System.out.print(" ");
					}
				
				for(int k=8;k>=i;k--)
					{
						System.out.print("*");
					//	System.out.print(" ");
					}
				for(int l=9;l>=i;l--)
				{
					System.out.print("*");
					//System.out.print(" ");
				}					
			  System.out.println();	
			}
		}
}