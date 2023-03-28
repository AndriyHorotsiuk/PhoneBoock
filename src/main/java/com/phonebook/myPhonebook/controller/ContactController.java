package com.phonebook.myPhonebook.controller;

import com.phonebook.myPhonebook.model.Contact;
import com.phonebook.myPhonebook.service.Contactsctervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactController {
    private final Contactsctervice contactsctervice;

    public ContactController(Contactsctervice contactsctervice) {
        this.contactsctervice = contactsctervice;
    }

    @GetMapping("/contacts")
    public String findAll(Model model) {
        List<Contact> contacts = contactsctervice.findAll();
        model.addAttribute("contacts",contacts);
        return "contact-list";
    }
    @GetMapping("/contact-create")
    public String createContactForm (Contact contact){
        return "contact-create";

    }
    @PostMapping
    public String createContact(Contact contact){
        contactsctervice.saveContact(contact);
        return "redirect:/contscts";

    }
}
