

class Employee {
    public long salary;
    String name;
    public String ringing;

//    public long getSalary() {
//        return salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    public static class square{
        public int side ;

        public int perimeter(){
            return 4*side;
        }
        public int area(){
            return side*side;
        }
}




        public  static class Main {
            public static void main(String[] args) {

                //question 1
            /*
            Employee avinash  = new Employee();
            avinash.setName("avinash");
            avinash.salary =83466;
            System.out.println("name of the employee is : "+avinash.getName());
            System.out.println("salary of the employee is: "+avinash.getSalary());
             */

                //problem 3
                square c = new square();
                c.side = 12;
                System.out.println("Side of a square is:"+c.side);
                System.out.println("Area of a square is:"+c.area());
                System.out.println("Perimeter of a square is:"+c.perimeter());
                }
            }
        }




