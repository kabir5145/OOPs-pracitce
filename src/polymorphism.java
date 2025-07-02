interface movie25{
     void movie1();
     void movie2();

}
interface movie24{
    void movie3();
    void movie4();
}
class newMovie{
    void movieNum(int movieNumber){
        System.out.println("The rating of the number is -->"+movieNumber);
    }
}
class oldMovie implements movie24,movie25{
    @Override
    public void movie3() {
        System.out.println("s");
    }

    @Override
    public void movie4() {
        System.out.println("nasa");
    }

    public void movie1(){
        System.out.println("the movie name is old boy");
    }
    public void movie2(){
        System.out.println("the movie name was inception");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        newMovie n = new newMovie();
        n.movieNum(10);
        oldMovie o = new oldMovie();
        o.movie1();
        o.movie2();o.movie3();
        o.movie4();
    }
}
