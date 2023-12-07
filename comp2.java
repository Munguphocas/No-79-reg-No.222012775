  public class comp2 {
    public double cal(double p,double n, double rate){
        double amount;
        int t;
        for( t=1;t<=3;t++){
       amount=p*(Math.pow((1+rate/n),t*n));
    
        
        System.out.println("the compound interest at year " + t+" is :"+ p*(Math.pow((1+rate/n),t*n)));}
        return p*(Math.pow((1+rate/n),t*n));
    
    
    }
    
}
 class interest {
    public static void main(String[] args) {
        comp2 mycomp2= new comp2();
        double result;
        result= mycomp2.cal(500000,12,0.18);
       System.out.println("the compound intrest of 3 years is "+result);
       
        
    }
    
}
