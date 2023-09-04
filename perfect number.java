class perfect number
{
public static void main(String args[])
{
 int n=7,a=1,sum=0;
   while(a<n)
  {
     if(n%a==0)
	{
	  sum=sum+a;
	}
	a++;
	}
	if(sum==num)
	{
	  System.out.println("PERFECT NUMBER");
	}
	else
	{
	 System.out.println("NOT PERFECT NUMBER");
	}
    }
}