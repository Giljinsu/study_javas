public class Calculations extends Object {
    // 이 클래스가 갖고 있는 오브젝트 갯수 11개 왜냐하면 Object의 메소드도 포함해야 하기 때문
    int _first = 0;
    int _second = 0;
    // Constructor
    Calculations() {
        System.out.println("Calculations - constructor");
    }
    Calculations(int first, int second) {
        this._first = first;
        this._second = second;
        System.out.println("Calculations - constructor with params");
    }
    //multiplication
    public int multiplication() {
        int result = this._first * this._second;
        return result;
    }

    // Public Methods addition
    public int addition(int first, int second){
        int result = first+second;
        return result;
    }
    // Public Methods substraction
    public int substraction(int first, int second){
        int result = first-second;
        return result;
    }
}
