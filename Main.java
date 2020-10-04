class Main {
  public static void main(String[] args) {
   byte[] daysDefaulted = {1};
   float payperday=700j,amountpaid=2000j;
   float totalamount=0j;
   byte  amountofdays=0; 
   float temp=amountpaid;
   byte dayspaidfor= 0;
   float remainttopay;
   float excess;
   for(byte i:daysDefaulted){
     totalamount=totalamount+payperday;
     amountofdays++;
   }
   System.out.println("Total amount to be paid is"+totalamount);
   for(int i=0;i<amountofdays;i++){
     if(temp>=payperday){
       temp=temp-payperday;
       dayspaidfor++;
     }
     else if(temp<payperday){
       break;
     }
   }
   for(int i=0;i<dayspaidfor;i++){
     System.out.println(daysDefaulted[i]);
   }
   if(amountpaid%payperday>0&&amountpaid<totalamount){
    System.out.println("Day not completely paid for is"+daysDefaulted[dayspaidfor]+" Amount left to complete it is"+(payperday-(amountpaid%payperday)));
   }
   if(amountpaid<totalamount){
     remainttopay=totalamount-amountpaid;
     System.out.println("Amount remaining to pay is"+excess);
   }
   else if(amountpaid>totalamount){
     excess=amountpaid-totalamount;
     System.out.println("You paid the exact amount");
   }
  }
}