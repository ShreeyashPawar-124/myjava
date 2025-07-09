package sap.company;
class Employee2{
    private int id ;
    private String name;
    private int salary;
    public Employee2(int id2,String n){
      id = id2;
      name = n;
      salary = 10000;
    }
    public void setId(int id1){
         id = id1;
    }
    public void setName(String yourName){
        name = yourName;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}
public class CWH_42_Constructor {
    public static void main(String[] args) {
        Employee2 emp2 = new Employee2(4,"Shreeyash");
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
    }
}
