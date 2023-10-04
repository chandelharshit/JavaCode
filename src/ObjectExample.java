import java.net.StandardSocketOptions;

class Calc{
     int a;
     public int add(int a,int b){
         int ans=a+b;
         System.out.println("Inside add:");
         return ans;
     }
}
public class ObjectExample {
    public static void main(String []args){
        Calc cal=new Calc();
        int result=cal.add(3,5);
        System.out.println(result);
    }
}
