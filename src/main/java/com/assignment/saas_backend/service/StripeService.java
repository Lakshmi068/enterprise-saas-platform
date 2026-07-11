package com.assignment.saas_backend.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.checkout.Session;
import com.stripe.param.CustomerCreateParams;
import com.stripe.param.checkout.SessionCreateParams;
import org.springframework.stereotype.Service;

@Service
public class StripeService {

    public String createCustomer(String name, String email)
            throws StripeException {

        CustomerCreateParams params =
                CustomerCreateParams.builder()
                        .setName(name)
                        .setEmail(email)
                        .build();

        Customer customer = Customer.create(params);

        return customer.getId();
    }

    public String createCheckoutSession(String customerId)
            throws StripeException {

        SessionCreateParams params =
                SessionCreateParams.builder()
                        .setMode(SessionCreateParams.Mode.SUBSCRIPTION)
                        .setCustomer(customerId)

                        .setSuccessUrl("http://localhost:8080/payment/success")
                        .setCancelUrl("http://localhost:8080/payment/cancel")

                        .addLineItem(
                                SessionCreateParams.LineItem.builder()
                                        .setQuantity(1L)

                                        // We'll replace this with your real Stripe Price ID next
                                        .setPrice("price_1TrkVH5dNcyDDScdDOHmHH81")

                                        .build())

                        .build();

        Session session = Session.create(params);

        return session.getUrl();
    }
}