package practice.cwh;
class cylinder{
    private int height;
    private int radius;

    public void setHeight(int h){
        height = h;
    }
    public void setRadius(int r){
        radius = r;
    }
    public float getSurfaceArea(){
        return (2 * 3.142f * (radius * height)) + (2 * 3.142f * (radius * radius));
    }
    public float getVolume(){
        return 3.142f * (radius * radius) * height;
    }
}
public class CH9_PR1 {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setHeight(4);
        cyl.setRadius(3);
        System.out.println("Volume of cylinder = "+ cyl.getVolume());
        System.out.println("Surface Area of Cylinder = "+cyl.getSurfaceArea());
    }
}
