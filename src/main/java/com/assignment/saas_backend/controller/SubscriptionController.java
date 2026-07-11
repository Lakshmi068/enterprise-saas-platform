package com.assignment.saas_backend.controller;

import com.assignment.saas_backend.dto.request.SubscriptionRequest;
import com.assignment.saas_backend.entity.Subscription;
import com.assignment.saas_backend.service.SubscriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subscriptions")
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping
    public Subscription createSubscription(
            @RequestBody SubscriptionRequest request) {

        return subscriptionService.createSubscription(request);
    }

    @GetMapping
    public List<Subscription> getAllSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }
}