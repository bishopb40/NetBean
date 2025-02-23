
package innerclasses;

public class StaticOuterClass {
    private static String message = "this is an outer class";
    static int y = 50;
    
    public static  void checkMe(){
        System.out.println("this is a static method");
        
    }
    
    
    static class StaticInnerClass{
        int x = 10;
        public void display(){
            System.out.printf("%s%n",message);
            System.out.println(y);
            System.out.printf("the value of x is : %d%n", x);
            
            OuterClass.checkMe();
        }
    }
    public static void main(String args[]){
        StaticOuterClass.StaticInnerClass inner = new StaticOuterClass.StaticInnerClass();
        
        inner.display();
    }
}
