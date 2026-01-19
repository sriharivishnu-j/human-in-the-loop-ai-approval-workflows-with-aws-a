package com.example.humanintheloop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.humanintheloop.service.WorkflowService;

@RestController
public class WorkflowController {

  private final WorkflowService workflowService;

  public WorkflowController(WorkflowService workflowService) {
    this.workflowService = workflowService;
  }

  @PostMapping("/workflows")
  public String createWorkflow(@RequestBody String data) {
    return workflowService.createWorkflow(data);
  }

  @GetMapping("/workflows/{id}")
  public String getWorkflow(@PathVariable Long id) {
    return workflowService.getWorkflow(id);
  }
}