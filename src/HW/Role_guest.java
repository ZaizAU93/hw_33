package HW;

public class Role_guest implements Role{
    String CRUD = "nothing";

    @Override
    public void action() {
        System.out.println("������������ ����� ���� ������ ��� ����� � ������ ��� �������������");
    }

    @Override
    public String toString() {
        return "Role_guest{" +
                "CRUD='" + CRUD + '\'' +
                '}';
    }
}
