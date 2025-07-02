/*
abstract class Fruits {
    public abstract void taste();
    public void eat(){
        System.out.println("Lets eat the fruit.");
    }
}
class Mango extends Fruits {
    public void taste(){
        System.out.println("Mango is sweet");
    }
}
 */
/*
abstract class pen{
    public abstract void write();
    public abstract void refill();
}
class fountainPen extends pen {
    public void changeNib(){
        System.out.println("The nib of the pen can be changed.");
    }
    @Override
    public void write() {
        System.out.println("The pen can write in any surfaces.");
    }

    @Override
    public void refill() {
        System.out.println("Fountain pen is a good pen.");
    }
}

 */

abstract class animal{
    public abstract void sound();
}
class lion extends animal {
    public void sound() {
        System.out.println("The sound made by the lion is like : roar.");
    }
}
    class tiger extends animal {
        @Override
        public void sound() {
            System.out.println("The sound made by a tiger is:growls");
        }
    }

    public class abstract_1 {
        public static void main(String[] args) {
/*
        Mango m = new Mango();
        m.eat();
        m.taste();

 */
            /*
            fountainPen f = new fountainPen();
            f.write();
            f.refill();
            f.changeNib();
             */
            animal a = new lion();
            a.sound();
            animal b = new tiger();
            b.sound();

        }
    }
