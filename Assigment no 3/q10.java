class q10
{
	public static void main(String args[])
		{
		char i,j,k;
		int sp=1;
			for(i='e';i>='a';i--)
			{
				for( j=4;j>=sp;j--)
					{
						System.out.print(" ");
						sp++;
					}
				
				for( k=i;k<='e';k++)
					{
						System.out.print(k+" ");
					}
			System.out.println();	
			}
		}
}
