package ua.com.alevel.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ua.com.alevel.dao.AddressRepository;
import ua.com.alevel.dao.ContactRepository;
import ua.com.alevel.dto.ContactDto;
import ua.com.alevel.entity.Address;
import ua.com.alevel.entity.Contact;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    private final AddressRepository addressRepository;
    private final ContactRepository contactRepository;

    public ContactServiceImpl(AddressRepository addressRepository, ContactRepository contactRepository) {
        this.addressRepository = addressRepository;
        this.contactRepository = contactRepository;
    }

    @Override
    public void create(ContactDto dto) {
        if (!contactRepository.existsByMobileNumber(dto.getMobileNumber())) {
            Address address = new Address();
            address.setCity(dto.getCity());
            address.setCountry(dto.getCountry());
            address = addressRepository.save(address);
            Contact contact = new Contact();
            contact.setAddress(address);
            contact.setFirstName(dto.getFirstName());
            contact.setLastName(dto.getLastName());
            contact.setMobileNumber(dto.getMobileNumber());
            contactRepository.save(contact);
        }
    }

    @Override
    public List<ContactDto> findAll(Map<String, String[]> query) {
        String sort = query.get("sort")[0];
        String order = query.get("order")[0];

        Sort defaultSort = Sort.by(order).descending();
        if (sort.equals("asc")) {
            defaultSort = Sort.by(order).ascending();
        }

        return contactRepository.findAll(defaultSort)
                .stream()
                .map(ContactDto::new)
                .collect(Collectors.toList());
    }
}
