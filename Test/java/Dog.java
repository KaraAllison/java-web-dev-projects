public class Dog {
    private String name;
    private int age;
    public Dog (String name){
        this.name = name;
        this.age = 0;
    }
    public Dog (int age) {
        this.age = age;

    }
    public Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }
}
