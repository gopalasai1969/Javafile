class ascending
{
public static void main(String args[])
{
int a=908,b=87,c=123;
if(a>b)
{
int d;
d=a;
a=b;
b=d;

}
if(a>c)
{
int f;
f=c;
c=a;
a=f;
}


if(b>c)
{
int e;
e=c;
c=b;
b=e;


}

System.out.println("A="+a);
System.out.println("B="+b);
System.out.println("C="+c);


}
}
