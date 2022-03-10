class q39
{
	public static void main(String args[])
		{
			int n=9;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
					{
						System.out.print(" ");
					}
				
				for(int k=9;k>=i;k--)
					{
						System.out.print("*");
					}
				for(int l=8;l>=i;l--)
				{
					System.out.print("*");
				}					
			  System.out.println();	
			}
		}
}