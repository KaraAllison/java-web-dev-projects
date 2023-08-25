public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Aerith", 5);
        Dog nameless = new Dog(7);
        Dog ageless = new Dog("Fred");
        System.out.println(myDog.toString());
        System.out.println(nameless.toString());
        System.out.println(ageless.toString());
    }
}
