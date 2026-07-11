package com.assignment.saas_backend.service;
import com.assignment.saas_backend.exception.ResourceNotFoundException;
import com.assignment.saas_backend.dto.request.SubscriptionRequest;
import com.assignment.saas_backend.entity.*;
import com.assignment.saas_backend.repository.OrganizationRepository;
import com.assignment.saas_backend.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;
    private final OrganizationRepository organizationRepository;

    public SubscriptionService(
            SubscriptionRepository subscriptionRepository,
            OrganizationRepository organizationRepository) {

        this.subscriptionRepository = subscriptionRepository;
        this.organizationRepository = organizationRepository;
    }
    public Subscription getSubscriptionByOrganization(Long organizationId) {

        Organization organization =
                organizationRepository.findById(organizationId)
                        .orElseThrow(() ->
                                new RuntimeException("Organization not found"));

        return subscriptionRepository.findByOrganization(organization)
                .orElseThrow(() -> new ResourceNotFoundException("Subscription not found"));
    }

    public Subscription createSubscription(SubscriptionRequest request) {

        Organization organization = organizationRepository.findById(request.getOrganizationId())
                .orElseThrow(() -> new RuntimeException("Organization not found"));

        Subscription subscription = new Subscription();

        subscription.setOrganization(organization);

        subscription.setPlan(
                PlanType.valueOf(request.getPlan().toUpperCase())
        );

        subscription.setStatus(SubscriptionStatus.ACTIVE);

        subscription.setStartDate(LocalDate.now());

        subscription.setEndDate(LocalDate.now().plusMonths(1));

        return subscriptionRepository.save(subscription);
    }

    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }
}
