
package chapter7;




public class Student {
    int studentid =101;
    String firstName = "john";
    String lastName ="williams";
    String gender = "male";
    int age = 25;
    
    
    public void study(){
        System.out.println("list of courses");
        System.out.println("java");
        System.out.println("web development");
        System.out.println("moblie app");
    }
    
    public void display(){
        System.out.printf("student id: %d%n",studentid);
        System.out.printf("student first name: %s%n",firstName);
        System.out.printf("student last name: %s%n",lastName);
        System.out.printf("student gender: %s%n",gender);
        System.out.printf("student age: %d%n",age);
        
        
        study();
    }
    
}
