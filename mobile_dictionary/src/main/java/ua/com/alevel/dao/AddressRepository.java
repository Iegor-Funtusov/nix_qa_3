package ua.com.alevel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.alevel.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> { }
