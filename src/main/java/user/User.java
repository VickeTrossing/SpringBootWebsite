package user;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String email;
    private String password;
    private String fistName;
    private String lastName;
    private int age;
}
