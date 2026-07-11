package com.assignment.saas_backend.controller;

import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.Event;
import com.stripe.net.Webhook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stripe")
public class StripeWebhookController {

    @Value("${stripe.webhook-secret}")
    private String webhookSecret;

    @PostMapping("/webhook")
    public String handleWebhook(
            @RequestBody String payload,
            @RequestHeader("Stripe-Signature") String signature) {

        try {

            Event event = Webhook.constructEvent(
                    payload,
                    signature,
                    webhookSecret);

            System.out.println("================================");
            System.out.println("Event Type : " + event.getType());
            System.out.println("Event Id   : " + event.getId());
            System.out.println("================================");

            if ("checkout.session.completed".equals(event.getType())) {

                System.out.println("✅ Subscription payment completed!");

            }

            return "Success";

        } catch (SignatureVerificationException e) {

            return "Invalid Signature";
        }
    }
}