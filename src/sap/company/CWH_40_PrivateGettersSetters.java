package sap.company;
class employee1{
    private int id1;
    private String Name;
    public void setId(int id){
        id1=id;
    }
    public void setName(String n){
         Name = n;
    }
    public int getId(){
        return id1;
    }
    public String getName(){
        return Name;
    }
}
public class CWH_40_PrivateGettersSetters {
    public static void main(String[] args) {
        employee1 harry = new employee1();
        harry.setId(304);
        harry.setName("Harry Porter");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
