
package innerclasses;

public class MethodLocalOuter {
    public void outermethod(){
        System.out.println("this is an outer method");
        
        class MethodLocalInner{
            public void display(){
                System.out.println("this is an inner class method");
            }
        }
        MethodLocalInner inner = new MethodLocalInner();
        inner.display();
        
        
    }
    public static void main(String args[]){
        MethodLocalOuter outer = new MethodLocalOuter();
        outer.outermethod();
        
    }
}
