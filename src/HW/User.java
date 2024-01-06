package HW;

import java.util.Objects;

public class User implements Cloneable{
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    int id = hashCode();
    String user_name;
    String password;
    Role role;
    static int count = 0;

    public User( String user_name, String password, Role role) {
        this.user_name = user_name;
        this.password = password;
        this.role = role;
        count++;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(user_name, user.user_name) && Objects.equals(password, user.password) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return this.id + count;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
