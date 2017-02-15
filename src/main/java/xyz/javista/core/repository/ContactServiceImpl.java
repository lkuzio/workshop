package xyz.javista.core.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import xyz.javista.core.entity.Contact;


/**
 * Created by Luke on 2017-01-24.
 */
@Component
@Transactional
public class ContactServiceImpl {


    @Autowired
    private ContactRepository contactRepository;

    public Contact add(Contact contact) {
        return contactRepository.save(contact);
    }
}
