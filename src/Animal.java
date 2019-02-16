public class Animal {
    protected int age;
    protected double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void run() {
        System.out.println("It's running!");
    }

    public void eat() {
        System.out.println("It's eating!");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
