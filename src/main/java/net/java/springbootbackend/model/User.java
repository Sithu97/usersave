package net.java.springbootbackend.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private  String emailId;

}
