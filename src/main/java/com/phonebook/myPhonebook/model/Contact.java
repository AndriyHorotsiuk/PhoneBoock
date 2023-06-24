package com.phonebook.myPhonebook.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_phonebook")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user")
    private String user= "1";
    @Column(name = "surname")
    private String surname;
    @Column(name = "name")
    private String name;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "phone_mobile")
    private String phoneMobile;
    @Column(name = "phone_home")
    private String phoneHome;
    @Column(name = "adress")
    private String adress;
    @Column(name = "e-mail")
    private String mail;

}
