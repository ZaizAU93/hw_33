package HW;

public class Role_admin implements Role, Cloneable{
    String CRUD = "almost";
    @Override
    public void action() {
        System.out.println("������������� ����� ���");
    }

    @Override
    public String toString() {
        return "Role_admin{" +
                "CRUD='" + CRUD + '\'' +
                '}';
    }
}
