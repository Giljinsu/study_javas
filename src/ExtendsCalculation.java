public class ExtendsCalculation extends Calculations{
    ExtendsCalculation() {
        System.out.println("ExtendsCalculations - constructor");
    }
    //multiply
    public int multiplications(int first, int second) {
        int result = first * second;
        return result;
    }
    public int substraction(int first, int second){
        int result = second-first;
        return result;
    }
}
