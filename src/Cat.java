public class Cat implements Cloneable{
    String breed;
    String name;

    public Cat(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
