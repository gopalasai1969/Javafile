class table
{
 public static void main(String args[])
{
  int a=7,x=1,y=0;
  while(x<=20)//it is normal order (Reverse order means x=10,x>=1,x--)
  {
   y=a*x;
 //System.out.println(a+"x"+x+"="+y);
  if(y%13==0)
   {
   System.out.println(a+"x"+x+"="+y);
   }  
   x++;
  
  
  
   }
 
 }
}