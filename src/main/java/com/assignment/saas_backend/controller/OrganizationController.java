package com.assignment.saas_backend.controller;

import com.assignment.saas_backend.dto.request.OrganizationRequest;
import com.assignment.saas_backend.entity.Organization;
import com.assignment.saas_backend.service.OrganizationService;
import com.stripe.exception.StripeException;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/organizations")
public class OrganizationController {

    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    // Create Organization
    @PostMapping
    public Organization createOrganization(
            @Valid @RequestBody OrganizationRequest request)
            throws StripeException {

        return organizationService.saveOrganization(request);
    }

    // Get All Organizations
    @GetMapping
    public List<Organization> getAllOrganizations() {
        return organizationService.getAllOrganizations();
    }

    // Get Organization By Id
    @GetMapping("/{id}")
    public Organization getOrganizationById(
            @PathVariable Long id) {

        return organizationService.getOrganizationById(id);
    }

    // Update Organization
    @PutMapping("/{id}")
    public Organization updateOrganization(
            @PathVariable Long id,
            @Valid @RequestBody OrganizationRequest request) {

        return organizationService.updateOrganization(id, request);
    }

    // Delete Organization
    @DeleteMapping("/{id}")
    public void deleteOrganization(
            @PathVariable Long id) {

        organizationService.deleteOrganization(id);
    }
}