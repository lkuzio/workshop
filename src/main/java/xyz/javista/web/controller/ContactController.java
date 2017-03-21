package xyz.javista.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.javista.core.repository.ContactServiceImpl;
import xyz.javista.core.entity.Contact;
import xyz.javista.core.repository.ContactRepository;

/**
 * Created by Luke on 2017-01-24.
 */
@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ContactServiceImpl contactService;

    @RequestMapping(method = RequestMethod.GET)
    public Page<Contact> getContacts(){
        return contactRepository.findAll(new PageRequest(0,100));
    }


    @RequestMapping(method = RequestMethod.POST)
    public Contact addContact(Contact contact){
        return contactService.add(contact);
    }

}
