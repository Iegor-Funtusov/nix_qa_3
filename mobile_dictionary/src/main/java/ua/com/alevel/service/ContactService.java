package ua.com.alevel.service;

import ua.com.alevel.dto.ContactDto;

import java.util.List;
import java.util.Map;

public interface ContactService {

    void create(ContactDto dto);
    List<ContactDto> findAll(Map<String, String[]> query);
}
