package ua.com.alevel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import ua.com.alevel.dto.ContactDto;
import ua.com.alevel.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody ContactDto dto) {
        contactService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(true);
    }

    @GetMapping
    public ResponseEntity<List<ContactDto>> findAll(WebRequest request) {
        return ResponseEntity.ok(contactService.findAll(request.getParameterMap()));
    }
}
