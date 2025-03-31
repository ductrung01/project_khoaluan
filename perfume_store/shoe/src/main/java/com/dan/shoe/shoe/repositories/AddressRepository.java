package com.dan.shoe.shoe.repositories;

import com.dan.shoe.shoe.models.Address;
import com.dan.shoe.shoe.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByUser(User user);
    Address findByUserAndPrimaryAddressTrue(User user);
}