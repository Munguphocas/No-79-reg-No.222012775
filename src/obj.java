 //define a class with a method to add two numbers
 class Adder {
    public int add( int num1,int num2){
        return num1+num2;
    }
     public class obj{
        public static void main(String[]args){
        //create an instance of the Adder classmnb
        Adder myAdder=new Adder();
        //use the add method to add two numbers
         int result =myAdder.add(5,3);
        System.out.println("Result:"+result);//output
           }
           }
 }