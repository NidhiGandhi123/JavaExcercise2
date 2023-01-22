package methods;

public class Program5 {
    static int SumOfTwo(int x, int y){
       return x+y;
    }
    static int SumOfThree(int x, int y, int z){
        return x+y+z;
    }

    public static void main(String[] args) {
        int a=9;
        int b=9;
        int c=9;

        Program5 obj = new Program5();

        System.out.println(obj.SumOfTwo(a,b));
        System.out.println(obj.SumOfThree(a,b,c));

    }
}
