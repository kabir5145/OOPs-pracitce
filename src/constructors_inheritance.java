

class footBall{
    footBall(){
        String name = "Lionel messi";
        System.out.println("Name of the   of the player is : "+name);
    }
    footBall(int x){
        System.out.println("Number of the player is : "+x);
    }
}
class cricket extends footBall{
    cricket(){
        String n = "Sachin ";
        System.out.println("Name of the player is : " +n);
    }
    cricket(int x,int y){
        super(x);
        System.out.println("Number of the player is : "+y);
    }
}
class ronaldo extends cricket{
    ronaldo(){
        String r = "Ronaldo";
        System.out.println("Name  of the player : "+r);
    }
    ronaldo(int x ,int y,int z){
        super(x,y);
        System.out.println("Age of the player is : "+z);
    }
}
class world extends ronaldo{
    world(){
        String s = " super man";
        System.out.println("super hero is :"+s);
    }
    world(int x ,int y,int z,int w){
        super(x,y,z);
        System.out.println("world would last till "+z +"years");
    }
}
public class constructors_inheritance {
    public static void main(String[] args) {
        ronaldo y = new ronaldo();
        world f = new world(10 ,100,40,23);
    }
}
