class vowels
{
public static void main(String args[])
{
   char ch='E';
   int num;
  if(ch>=65&&ch<=90)
   {
     if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
         System.out.println("Vowels");
	else
    {
	System.out.println("consonants");
         }
          System.out.println("Captial");    
	}
     else if(ch>=97 && ch<=122)
    {
    
     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
         System.out.println("Vowels");
	else
    {
	System.out.println("consonants");
	
    }
	System.out.println("small");
  }
      
 else if(ch>='0' && ch<='9')
  System.out.println("Numbers");
else
 System.out.println("Symbols");
}
}
      