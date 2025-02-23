
package classwork;


public class Person {
    private String name;
    private String country;
    private double age;
    
    
    Person(){
        name = "john emmma";
        country = "china";
        age = 36;    
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(double age) {
        this.age = age;
    }
    public void display(){
        System.out.printf("name: %s%n", getName());
        System.out.printf("country: %s%n", getCountry());
        System.out.printf("name: %s%n", getAge());
    }
}
