
package composition;

public class OneToOAassociation {
   public static void main(String args[]){
       Address add = new Address("number1 rumudor","ph","rivers state","nigeria");
       Person per = new Person("ifeanyi",add);
       per.displayPerson();
       
       System.out.println("");
       
       
       Address add1 = new Address("number 1 rumudor","ph","rivers state","nigeria");
       Person per1 = new Person("emma",add1);
       per1.displayPerson();
       
       Department dep = new Department("john");
       
       
   }
}
