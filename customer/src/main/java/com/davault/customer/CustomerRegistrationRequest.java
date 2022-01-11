package com.davault.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
