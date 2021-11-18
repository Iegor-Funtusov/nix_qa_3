package ua.com.alevel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.alevel.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

    boolean existsByMobileNumber(String mobileNumber);
}
