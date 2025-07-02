

// class Land{
//    private int  address;
//    private String name;
//
//    public int getAddress(){
//        return address =234;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(){
//        this.name="Hoshiarpur";
//    }
//    public void setName(String n ){
//        this.name=n;
//    }
//}

class brook{
    public int a  = 12;
    protected double s = 34.45;
    int  b = 56;
    public void foolish(){
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);

    }
}
public class access_modifiers_and_constructors {
    public static void main(String[] args) {
//        Land l = new Land();
//        l.setName();
//        l.getAddress();
//        System.out.println(l.getName());
//        System.out.println(l.getAddress());

        brook b = new brook();
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.s);

    }
}
