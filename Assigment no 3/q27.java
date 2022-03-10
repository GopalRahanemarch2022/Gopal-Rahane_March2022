class q27
{
 public static void main(String args[])
 {
 
   int n=5;
    for(int i=1;i<=n;i++)
 {
     for( int j=n-1;j>=i;j--)
	 {
	 System.out.print(" ");
     }
	 for(int k=1;k<=i;k++)
	 {
		 System.out.print("*");
	 }
	System.out.println();
   }
 
  for(int k=n;k>=1;k--)
 {
     for( int l=n-1;l>=k;l--)
	 {
	 System.out.print(" ");
     }
	 for(int m=k;m>=1;m--)
	 {
		 System.out.print("*");
	 }
	System.out.println();
   }
   
 }
}