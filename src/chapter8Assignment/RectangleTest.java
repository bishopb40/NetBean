
package chapter8Assignment;

public class RectangleTest {
     public static void main(String[] args) {
        try {
            Rectangle rect = new Rectangle(5.5, 10.2);
            System.out.println("Length: " + rect.getLength());
            System.out.println("Width: " + rect.getWidth());
            System.out.println("Area: " + rect.calculateArea());
            System.out.println("Perimeter: " + rect.calculatePerimeter());

            // Uncommenting the lines below will throw an exception
            // rect.setLength(21);
            // rect.setWidth(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
