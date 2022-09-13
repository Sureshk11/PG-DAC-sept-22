class p9{

public static void main(String args[]){

char arr[]={'A','B','C','D','E'};

for(int i=0;i<=4;i++)

{     for( int j=4;j>=i;j--)
	{
		
		System.out.print(" ");	
	}

	for( int j=0;j<=i;j++)
	{
		
		System.out.print(arr[j]+" ");
		
	}
	
	System.out.println();
}





}




}