package InheritanceVehicles_folder;

public class Cars extends Vehicles {
    private int oneway_count;

    Cars(int oneway_count) {
        this.oneway_count = oneway_count;
    }

    public int speed(int kms, int hours) {
        int result = kms/ hours +oneway_count;
        return result;
    }
}
