class buzz
{
public static void main(String args[])
   {
    int n=20,x=7,y=6;
   if(n%x==0 && n%y==0)
   {
     System.out.println("Fizz buzz");
    }
     else if(n%x==0)
      {  
	System.out.println("Fizz");
      }
       else if(n%y==0)
	{
         System.out.println("Buzz");
         }
       else 
        {
         System.out.println(n);  
        }
   }
}    
	