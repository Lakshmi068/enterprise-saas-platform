package com.assignment.saas_backend.service;

import com.assignment.saas_backend.dto.request.OrganizationRequest;
import com.assignment.saas_backend.entity.Organization;
import com.assignment.saas_backend.repository.OrganizationRepository;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;
    private final StripeService stripeService;

    public OrganizationService(
            OrganizationRepository organizationRepository,
            StripeService stripeService) {

        this.organizationRepository = organizationRepository;
        this.stripeService = stripeService;
    }

    // Create Organization
    public Organization saveOrganization(OrganizationRequest request)
            throws StripeException {

        Organization organization = new Organization();
        organization.setOrganizationName(request.getOrganizationName());

        String stripeCustomerId = stripeService.createCustomer(
                request.getOrganizationName(),
                "admin@company.com");

        organization.setStripeCustomerId(stripeCustomerId);

        return organizationRepository.save(organization);
    }

    // Get All Organizations
    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    // Get Organization by Id
    public Organization getOrganizationById(Long id) {

        return organizationRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Organization not found"));
    }

    // Update Organization
    public Organization updateOrganization(Long id, OrganizationRequest request) {

        Organization organization = getOrganizationById(id);

        organization.setOrganizationName(request.getOrganizationName());

        return organizationRepository.save(organization);
    }

    // Delete Organization
    public void deleteOrganization(Long id) {
        organizationRepository.deleteById(id);
    }
}