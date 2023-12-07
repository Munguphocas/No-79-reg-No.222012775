public class compound {
    public double amount (double p,double r,double t,double n){
        double result=p*Math.pow(1+(r/n),n*t);
        return result;
    }
    public static void main(String[] args) {
    compound d2=new compound();
    double p=500000;double r=0.18;double t=3;double n=12;
    double result =d2  .amount(p,r,t,n);
    System.out.println("amount:"+result);
    }
}


    
