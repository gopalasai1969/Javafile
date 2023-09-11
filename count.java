class count
{
	public static void main(String[] args) 
	{
		int a=5,b=2,c=11,count=0;
	    while(c>b)
	    {
	        if(c%b==0)
	        {
	            System.out.println(b);
	            count++;
	           
	        }
	        
	        b++;
	    }
	    System.out.println("Count="+count);
	    if(count==0)
	    System.out.println("Prime Number");
	    else
	    System.out.println("Not Prime number");
	}
}