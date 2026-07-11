package com.assignment.saas_backend.controller;

import com.assignment.saas_backend.dto.request.CheckoutRequest;
import com.assignment.saas_backend.service.StripeService;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stripe")
public class StripeController {

    private final StripeService stripeService;

    public StripeController(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    @PostMapping("/checkout")
    public String createCheckoutSession(
            @RequestBody CheckoutRequest request)
            throws StripeException {

        return stripeService.createCheckoutSession(
                request.getCustomerId());
    }
}