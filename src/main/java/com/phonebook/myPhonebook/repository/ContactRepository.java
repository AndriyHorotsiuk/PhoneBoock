package com.phonebook.myPhonebook.repository;

import com.phonebook.myPhonebook.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
