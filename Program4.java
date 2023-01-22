package methods;

public class Program4 {
     static int Method(int x, int y){
         int add = x+y;
         return add;
     }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Program4 obj = new Program4();

        int ans = obj.Method(a,b);

        System.out.println("Addition of x & y :" + ans);
    }
}
