class Sample{
    public void playMusic(){
        System.out.println("Playing Music");
    }
    public String getMeAPen(int cost){
        if(cost>=10) return "Pen Deleivered";
        else return "Try Again";
    }
}
public class MethodsExample {
    public static void main(String []args){
        Sample samp=new Sample();
        samp.playMusic();
        String op=samp.getMeAPen(2);
        System.out.println(op);
        String op2=samp.getMeAPen(10);
        System.out.println(op2);
    }
}
