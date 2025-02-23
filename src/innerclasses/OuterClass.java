
package innerclasses;

public class OuterClass {
    
    private String message = "this is an outer class";
    static int y = 50;
    
    public static void checkMe(){
        System.out.println("this is a static method");
        
    }
    
    
    class InnerClass{
        int x = 10;
        public void display(){
            System.out.printf("%s%n",message);
            System.out.println(y);
            System.out.printf("the value of x is : %d%n", x);
            
            OuterClass.checkMe();
        }
    }
    
    public static  void main(String args[]){
        OuterClass outer = new OuterClass();
        
        OuterClass.InnerClass inner =  outer.new InnerClass();
        
        inner.display();
    }
}
