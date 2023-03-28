package com.phonebook.myPhonebook.service;

import com.phonebook.myPhonebook.model.Contact;
import com.phonebook.myPhonebook.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Contactsctervice {
    private final ContactRepository contactRepository;

    public Contactsctervice(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact findByID(Long id) {
        return contactRepository.getOne(id);

    }

    public List<Contact> findAll() {
        return contactRepository.findAll();

    }

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);

    }

    public void deletByID(Long id) {
        contactRepository.deleteById(id);

    }

}
