package InheritanceVehicles_folder;

public class Vehicles extends Object{
    public int speed(int kms, int hours) {
        int result = kms/hours;
        return result;
    }
    public int weight(int height, int width, int depth) {
        int result = height*width*depth;
        return result;
    }
    public int substraction(int first, int second){
        int result = first-second;
        return result;
    }
}
