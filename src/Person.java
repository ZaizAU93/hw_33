public class Person implements Cloneable{
    String name;
    int age;
    double salary;

    Cat cat;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", cat=" + cat +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 21 ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.setCat((Cat) this.cat.clone());
        return clonedPerson;
    }
}
