class Vegetable{
    String vitamin;
    String color;
    String taste;
    public void type() {
    System.out.println("grows under ground");
    }
   
}
class Potato extends Vegetable{
    int calories;
    public Potato(String v,String c,String t) {
        this.vitamin=v;
        this.color=c;
        this.taste=t;   
    }
    @Override
    public String toString() {
        return "Vitamin: "+vitamin+"\nColor: "+color+"\nTaste: "+taste;
    }
   
}
class CauliFlower extends Vegetable{
    public CauliFlower(String v,String c,String t) {
        this.vitamin=v;
        this.color=c;
        this.taste=t;
    }
   
    public void type(){
        System.out.println("grows above ground");
    }
    @Override
    public String toString() {
        return "Vitamin: "+vitamin+"\nColor: "+color+"\nTaste: "+taste;
    }
}
public class HierarchicalInheritance {
public static void main(String[] args) {
    Potato p1 = new Potato("Unknown","Brown","TasteLess");
    System.out.println("Potato Details:");
    p1.type();
    System.out.println(p1);
    System.out.println("--------------------------------");
    CauliFlower c1 = new CauliFlower("A","White","Sweet");
    System.out.println("Cauliflower details: ");
    c1.type();
    System.out.println(c1);
   
}
}

