package HW;

public class Role_admin implements Role, Cloneable{
    String CRUD = "almost";
    @Override
    public void action() {
        System.out.println("администратор может все");
    }

    @Override
    public String toString() {
        return "Role_admin{" +
                "CRUD='" + CRUD + '\'' +
                '}';
    }
}
