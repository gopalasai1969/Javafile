class ascending1
{
public static void main(String args[])
{
int a=708,b=887,c=123;
if(a>b)
{
a=a+b;
b=a-b;
a=a-b;
}
if(a>c)
{
a=a+c;
c=a-c;
a=a-c;
}
if(b>c)
{
b=b+c;
c=b-c;
b=b-c;
}

System.out.println("A="+a);
System.out.println("B="+b);
System.out.println("C="+c);


}
}
