public class mrbobinterest {
    public static double interest (double p,double r,int t){
        double result=(p*r*t)/100;
        return result;

    }
    public static void main(String[] args) {
        mrbobinterest a2=new mrbobinterest();
        double interest=a2.interest(1000000,0.05,5);
        System.out.println("the interest is:"+ " "+interest);
    }
}
