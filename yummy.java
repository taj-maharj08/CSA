public class yummy {
    public static void main(String [] args){
        System.out.println("Yummy");
        chocolate();
        iceCream();
    }
    public static void chocolate(){
        System.out.print("Chocolate ");
        System.out.println("cake");
    }
    public static void frenchFries(){
        System.out.println("French fries with ketchup");
        chocolate();
        System.out.println("that was yummy");
    }
    public static void iceCream(){
        System.out.println("Ice");
        frenchFries();
        System.out.println("Cream");
    }
}
