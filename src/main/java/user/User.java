package user;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(nullable = false, unique = true, length = 15)
    private String password;

    @Column(nullable = false, unique = true, length = 45, name ="first_name")
    private String fistName;

    @Column(nullable = false, unique = true, length = 45, name ="last_name")
    private String lastName;

    @Column(nullable = false, unique = true, length = 3)
    private int age;


    public User(Long id, String email, String password, String fistName, String lastName, int age) {
        this.setId(id);
        this.setEmail(email);
        this.setPassword(password);
        this.setFistName(fistName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public User(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", fistName='" + getFistName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
