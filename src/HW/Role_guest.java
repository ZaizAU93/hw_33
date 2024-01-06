package HW;

public class Role_guest implements Role{
    String CRUD = "nothing";

    @Override
    public void action() {
        System.out.println("пользователь может чуть больше чем гость и меньше чем администратор");
    }

    @Override
    public String toString() {
        return "Role_guest{" +
                "CRUD='" + CRUD + '\'' +
                '}';
    }
}
