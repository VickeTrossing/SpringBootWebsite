package com.vicketrossing.springbootthymeleaf.user;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;

@Entity
@Table(name="user")
@EnableJpaRepositories(basePackages = {"user"})
@EntityScan()
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "email", nullable = false, unique = true, length = 45)
    private String email;

    @Column(nullable = false, unique = true, length = 15, name="password")
    private String password;

    @Column(nullable = false, unique = true, length = 45, name ="first_name")
    private String firstName;

    @Column(nullable = false, unique = true, length = 45, name ="last_name")
    private String lastName;




    public User(Long id, String email, String password, String firstName, String lastName) {
        this.setId(id);
        this.setEmail(email);
        this.setPassword(password);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public User(){}

    public User(String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", fistName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +

                '}';
    }
}