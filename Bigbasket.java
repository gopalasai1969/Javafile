class Bigbasket
{
 public static void main(String args[])
 {
  double ricequan=3.5;
  double ricerate=700;
  double Riceprice=ricequan*ricerate;
  System.out.println("Rice ="+Riceprice);
  double tomatoquan=4;
  double tomatorate=100;
  double Tomatoprice=tomatoquan*tomatorate;
  System.out.println("Tomato ="+Tomatoprice);
  double biscuitquan=7;
  double biscuitrate=55;
  double Biscuitprice=biscuitquan*biscuitrate;
  System.out.println("Biscuit ="+Biscuitprice);
  double straberrybox=4;
  double straberryprice=120;
  double Straberryrate=straberrybox*straberryprice;
  System.out.println("Strabeery ="+Straberryrate);
  double total=Riceprice+Tomatoprice+Biscuitprice+Straberryrate;
  System.out.println("Totalrate ="+total);
  double deliverycharges=110;
  System.out.println("Deliverycharges ="+deliverycharges);
  double charges=total+deliverycharges;
  System.out.println("After charges ="+charges);
  double discount=15.0/100*charges;
  double discprice=charges-discount;
  System.out.println("Discount price ="+discprice);
  double firsttimepur=150;
  double coupn=discprice-firsttimepur;
  System.out.println("Coupn offer ="+coupn);
  double gst=10.0/100*coupn;
  System.out.println("GST ="+gst);
  double gstprice=coupn+gst;
  System.out.println("FINAL PRICE ="+gstprice);
 }
}

  
  
  

  
  
  
  
  