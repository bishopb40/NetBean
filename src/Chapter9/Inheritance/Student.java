
package Chapter9.Inheritance;

public class Student {
    String studentId;
    String name;
    int age;
    String gender;
    
    public Student(String studentId,String name,int age,String gender){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void study(){
        System.out.printf("%s is studying",name);
    }
    public void display(){
        System.out.printf("The student ID is: %s%n", studentId);
        System.out.printf("The student name is: %s%n", name);
        System.out.printf("The student age is: %d%n", age);
        System.out.printf("The student gender is: %s%n", gender);
       


    }
    
}
