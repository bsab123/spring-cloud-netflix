package org.caps.provider.service;


import org.caps.provider.domain.Customer;

import java.util.List;

public interface CustomersInterface {

    public List<Customer> searchCity(Integer pageNumber, Integer pageSize, String searchContent);

    Customer saveCustomer(Customer customer);
}
