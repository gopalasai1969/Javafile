class desc1
{
public static void main(String args[])
{
int a=908,b=87,c=123;
if(a<b)
{
a=a+b;
b=a-b;
a=a-b;
}
if(b<c)
{
b=b+c;
c=b-c;
b=b-c;


}
if(a<c)
{
a=a+c;
c=a-c;
a=a-c;
}

System.out.println("A="+a);
System.out.println("B="+b);
System.out.println("C="+c);


}
}
