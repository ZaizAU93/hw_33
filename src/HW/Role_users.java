package HW;

public class Role_users implements Role{
    String CRUD = "all";
    @Override
    public void action() {
        System.out.println("�����  ����� ����� �������������");
    }

    @Override
    public String toString() {
        return "Role_users{" +
                "CRUD='" + CRUD + '\'' +
                '}';
    }
}
