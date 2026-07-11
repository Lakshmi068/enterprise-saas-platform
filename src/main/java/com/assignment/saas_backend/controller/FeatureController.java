package com.assignment.saas_backend.controller;

import com.assignment.saas_backend.entity.Feature;
import com.assignment.saas_backend.entity.Subscription;
import com.assignment.saas_backend.service.FeatureService;
import com.assignment.saas_backend.service.SubscriptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/features")
public class FeatureController {

    private final SubscriptionService subscriptionService;
    private final FeatureService featureService;

    public FeatureController(
            SubscriptionService subscriptionService,
            FeatureService featureService) {

        this.subscriptionService = subscriptionService;
        this.featureService = featureService;
    }

    @GetMapping("/check")
    public boolean checkFeature(
            @RequestParam Long organizationId,
            @RequestParam Feature feature) {

        Subscription subscription =
                subscriptionService.getSubscriptionByOrganization(
                        organizationId);

        return featureService.hasFeature(
                subscription.getPlan(),
                feature);
    }
}