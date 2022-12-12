package InheritanceVehicles_folder;

public class Vans extends Vehicles {
    public int windows_count(int oneway_count) {
        int result = oneway_count*3;
        return result;
    }
}
