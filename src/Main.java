import HW.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Британец", "Борис");
        Person person = new Person("Джон", 27, 2300);

        person.setCat(cat);

        System.out.println(person.toString());

        Person person1;
        try {
            person1 = (Person) person.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(person1.toString());
        System.out.println(person.equals(person1));

        person1.setName("Брюс");
        System.out.println(person1.toString());
        System.out.println(person.equals(person1));

        System.out.println("HomeWork");

        Role role = new Role_admin();
        Role role1 = new Role_guest();
        Role role2 = new Role_users();

        User user = new User("Jon", "123", role1);
        User user1 = new User("Jon", "122", role1);
        User user2 = new User("Jon", "123", role1);

        System.out.println(user.equals(user2));
        System.out.println(user.equals(user1));

        System.out.println(user.toString());
        System.out.println(user1.toString());
        System.out.println(user2.toString());

        System.out.println(user2.hashCode());

        User cloneUser;

        try {
            cloneUser = (User)user1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(cloneUser.toString());
        cloneUser.setUser_name("Борис");
        System.out.println(cloneUser.toString());

    }
}