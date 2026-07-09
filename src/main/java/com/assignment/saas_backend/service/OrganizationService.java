package com.assignment.saas_backend.service;

import com.assignment.saas_backend.entity.Organization;
import com.assignment.saas_backend.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public Organization saveOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }
}