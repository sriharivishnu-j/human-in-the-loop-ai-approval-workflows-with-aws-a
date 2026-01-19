package com.example.humanintheloop.service;

import org.springframework.stereotype.Service;

@Service
public class WorkflowService {

  public String createWorkflow(String data) {
    // TODO: Implement logic to create a workflow
    return "Workflow created with data: " + data;
  }

  public String getWorkflow(Long id) {
    // TODO: Implement logic to retrieve a workflow
    return "Returning workflow with ID: " + id;
  }
}