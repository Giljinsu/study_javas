package InheritanceVehicles_folder;

public class InheritanceVehicles {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        Vans vans = new Vans();
        Cars cars = new Cars(3);
        System.out.println("Done");
        System.out.println(vehicles.speed(6, 3));
    }
}
