class Vehicle{
    String model;
}
class Bike extends Vehicle{
    int seats;
}
class Bajaj extends Bike{
   
    double mileage;
   
    public Bajaj(String model,int seats,double mileage) {
        this.model=model;
        this.seats=seats;
        this.mileage=mileage;
    }
    @Override
    public String toString() {
        return "Model: "+model+"\n"
                +"Seats: "+seats+"\n"
                +"Mileage: "+mileage+"km/l \n";
    }
}
public class MultiLevelInheritance{
 public static void main(String[] args) {
    Bajaj b1= new Bajaj("Pulsar-150",2,45.2);
    Bajaj  b2= new Bajaj("NS-200", 2,30.5);
    System.out.println(b1);
    System.out.println(b2);
}
}
