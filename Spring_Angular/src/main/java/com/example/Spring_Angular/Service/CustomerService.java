package com.example.Spring_Angular.Service;


import com.example.Spring_Angular.DTO.CustomerDTO;
import com.example.Spring_Angular.DTO.CustomerSaveDTO;
import com.example.Spring_Angular.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomer();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}
