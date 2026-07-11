package com.assignment.saas_backend.dto.request;

public class CheckoutRequest {

    private String customerId;

    public CheckoutRequest() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}