

interface goodPlayer{
    void player1();
    void player2();
}
interface worstPlayer extends goodPlayer{
    void player3();
    void player4();
}
class rating implements worstPlayer {
    public void player1() {
        System.out.println("messi ");
    }

    @Override
    public void player2() {
        System.out.println("ronaldo ");
    }

    @Override
    public void player3() {
        System.out.println("onana ");
    }

    @Override
    public void player4() {
        System.out.println("nicolas jackson ");
    }
}
    public class inheritance_in_interface {
    public static void main(String[] args) {
        System.out.println("The player are rated by there playing performance ");
        rating r = new rating();
        System.out.print("great player is =");
       r.player1();
    }
}
