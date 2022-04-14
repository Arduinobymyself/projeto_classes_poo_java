package dev.marcelo.test;

import dev.marcelo.Customer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void givenCalculateAge_whenReturnCustomerAge_thenSucceed(){
        Customer customer = new Customer();
        customer.setBirthday(LocalDate.of(1971, Month.FEBRUARY, 11));
        Integer actual = customer.calculateAge();
        assertEquals(51, actual);
    }
}