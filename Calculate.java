class Calculate
{
  public static void main(String args[])
  {
    int currentyear=2023;
    int birthyear=2000;
    int age=currentyear-birthyear;
    System.out.println("tage="+age);
    int days=365*age;
    int hours=days*24;
    int min=hours*60;
    int secs=min*3600;
    System.out.println("tdays="+days);
    System.out.println("thours="+hours);
    System.out.println("tmin="+min);
    System.out.println("total="+secs);
   }
}


    