package practice.cwh;
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
}
class Cellphone{
    public void ring(){
        System.out.println("Ringing Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Sumit...");
    }
}
class Square{
    public int area(int side){
        int area ;
        area = side*side;
        return area;
    }
    public int perimeter(int side){
        int perimeter ;
        perimeter = side*4;
        return perimeter;
    }
}
class Rectangle{
    int area;
    int perimeter;
    public int area(int length,int breadth){
        area = length*breadth;
        return area;
    }
    public int perimeter(int length,int breadth){
        perimeter = length*2 + breadth*2;
        return perimeter;
    }
}
class Pubg{
    public void hit(){
        System.out.println("Hitting enemy......");
    }
    public void fire(){
        System.out.println("Firing on the enemy......");
    }
    public void run(){
        System.out.println("Running away from enemy......");
    }
}
class Circle{
    float radius;
    float circumference;
    public float area(float r){
        radius = (r*r)*3.14f;
        return radius;
    }
    public float circumference(float r){
        circumference = 2*3.14f*r;
        return circumference;
    }
}
public class CH8_PR1 {
    public static void main(String[] args) {
        // Question 1
        Employee harry = new Employee();
        harry.name = "Harry Porter";
        harry.salary = 35000;
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
        harry.setName("Coder Harry");
        System.out.println(harry.getName());
        // Question 2
        Cellphone motorola = new Cellphone();
        motorola.callFriend();
        motorola.vibrate();
        motorola.ring();
        // Question 3
        Square square = new Square();
        System.out.println("Area of Square:- "+square.area(7));
        System.out.println("Perimeter of Square:- "+square.perimeter(7));
        // Question 4
        Rectangle rec = new Rectangle();
        System.out.println("Area of Rectangle:- "+rec.area(8,6));
        System.out.println("Perimeter of Rectangle:- "+rec.perimeter(8,6));
        // Question 5
        Pubg player = new Pubg();
        player.run();
        player.fire();
        player.hit();
        // question 6
        Circle c1 = new Circle();
        System.out.println("Area of circle:- "+c1.area(6));
        System.out.format("Circumference of circle:- %.2f",c1.circumference(6));
    }
}
