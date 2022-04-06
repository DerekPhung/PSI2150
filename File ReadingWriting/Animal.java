public class Animal {
    private int numLegs;
    private int age;

    public Animal(int numLegs, int age) {
        this.age = age;
        this.numLegs = numLegs;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getNumLegs() {
        return numLegs;
    }
    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }
    public void animalSound() {
        System.out.println("The animal makes a noise.");
    }

    @Override
    public String toString()
    {
        return "Animal [numLegs=" + numLegs + ", age=" + age + "]";
    }
}