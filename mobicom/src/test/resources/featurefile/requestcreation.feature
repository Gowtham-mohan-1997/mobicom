Feature: Mobicom Automation Testcasess

    @createContractrequest
    Scenario: Create a new contract request
    Given I launch the browser and open the application
    When I log in as an initiator
    When initiator request created with yes
    When I complete the contract draft reviewal task 1 with approve
    When I complete the contract draft reviewal task 2 with approve
    Then complete the Contract - Lawyer Allocation task
    Then complete the  Contract Draft - Lawyer Approval task
    Then complete the   Contract Draft Authorization task
    Then complete the Upload updated Brief Information Document task
    And  complete the  Upload Signed Contract task
    And complete the Contract Documents Verification task
     
    @contractReviewModification
    Scenario: complete the contractreviewaltask with send for modification
    Given create the contract requets
    When complete the contract reviewal task one with send for modification
    Then complete the contract reviewal task two with send for modification
    And  complete resubmission task
    
    @ContractDraft-Reviewal 
    Scenario: complete the ContractDraft-Reviewal with send for modification
    Given create the contract_requests
    When complete the contract reviewal task1 with approve
    When complete the contract reviewal task2 with approve
    Then complete the ContractLawyer Allocation task
    Then complete the ContractDraft-Reviewal task with send for modification
    And  complete the resubmission_tasks
    
    @ContractDraft-authorization 
    Scenario: complete the ContractDraft-authorization with send for modification
    Given create the contract request
    When complete the contract reviewal task one with approve
    When complete the contract reviewal task two with approve
    Then complete the contractlawyer Allocation task
    Then complete the ContractDraft-Reviewal task with approve
    And  complete the ContractDraftauthorization task with send for modification
    And  complete the resubmission task
     
    @contractReviewReject
    Scenario: complete the contractreviewaltask with Reject
    Given create the ContractRequest
    When complete the contract reviewal task one with Reject
    Then complete the contract reviewal task two with Reject
    
    @Alltag @ContractDraft-ReviewalReject 
    Scenario: complete the ContractDraft-Reviewal with Reject
    Given Create the new contract Request
    When complete the ContractReviewal taskone with approve
    When complete the ContractReviewal tasktwo with approve
    Then complete the ContractLawyer allocation task
    Then complete the ContractDraft-Reviewal task with Reject
    
    @Alltag @ContractDraft-authorizationReject 
    Scenario: complete the ContractDraft-authorization with Reject
    Given create the new contract request with YES
    When complete the contract reviewaltask first with approve
    When complete the contract reviewaltask second with approve
    Then Complete Contract - Lawyer Allocation task with select approver 
    Then complete the contract-draft-Reviewal task with approve
    And  complete the ContractDraft-authorization task with Reject
        
        
    @Alltag @Renew-contract-request 
    Scenario: complate the renew contract request
    Given create the new contract request with yes
    When create the renew contract request
    When complete the contract draft reviewal task1 with approve
    When Complete contract drafted reviewal task2 with approve
    Then complete the Contract - Lawyer Allocation task for select layer
    Then complete Contract Drafted - Lawyer approval Task
    Then complete Contract Drafted Authorization task with approve
    Then Upload updated Brief Information Document task
    And Upload Signed Contract task
    And Contract Documents Verification task
    
     @Alltag @contract-holdonrelease-releaseonhold
     Scenario: complete the place on hold and release on hold
     Given create new request with yes
     When contract draft reviewal first task should be complete
     When contract draft reviewal second task should be complete
     Then Contract - Lawyer Allocation task should be complete
     Then Contract Draft - Lawyer Approval task should complete with approve
     Then Contract Draft Authorization task should be complete with approve
     Then Upload updated Brief Information Document task should be complete
     And Upload Signed Contract task should be complete
     And Contract Documents Verification task should be complete
     And complete the place on hold
     And complete the releasehold
   
     @Alltag @complete-contract-terminate
     Scenario: complete the contract terminate
     Given create contract request with yes
     When contract draft reviewal first task should be complete with approve
     When contract draft reviewal second task should be complete with approve
     Then Contract - Lawyer Allocation task should complete
     Then Contract Draft - Lawyer Approval task should complete 
     Then Contract Draft Authorization task should be complete 
     Then Upload updated Brief Information Document task should complete
     And Upload Signed Contract task should complete
     And Contract Documents Verification task should complete
     And complete the contract termination
     
      @renewecontractReviewModification
    Scenario: complete the renewecontractreviewaltask with send for modification
    Given request creation with yes
    When create renew contract request
    When complete contract reviewal task one with sendformodification
    Then complete contract reviewal task two with sendformodification
    And  complete the resubmission task in initiator
     
      @renewalContractDraft-Reviewal 
    Scenario: complete the renewalContractDraft-Reviewal with send for modification
    Given create the new contract request
    When renew contract request created
    When complete contract reviewal task1 with approve
    When complete contract reviewal task2 with approve
    Then complete ContractLawyer Allocation task
    Then complete ContractDraft-Reviewal task with send for modification
    And  complete resubmission_tasks
    
    @renewalContractDraft-authorization 
    Scenario: complete the renewalContractDraft-authorization with send for modification
    Given create new request
    When create renew request
    When complete the contract reviewal task one with approved
    When complete the contract reviewal task two with approved
    Then complete the contract lawyer Allocation task
    Then complete the Contract Draft-Reviewal task with approve
    And  complete the Contract Draft authorization task with send for modification
    And  complete the resubmission task from initiator
    
    @renewecontractReviewReject
    Scenario: complete the renewalcontractreviewaltask with Reject
    Given create a new request in initiator
    When create the renew contract request in initiator
    When complete the contract reviewal task one with Rejected
    Then complete the contract reviewal task two with Rejected
      
      
    @renewalContractDraft-ReviewalReject 
    Scenario: complete the renewalContractDraft-Reviewal with Reject
    Given initiator should create the new request
    When initiator should create the renewal request
    When complete the ContractReviewal taskone with approved
    When complete the ContractReviewal tasktwo with approved
    Then complete ContracLawyer allocation task
    Then complete ContractDraft-Reviewal task with Reject
    
     @renewalContractDraft-authorizationReject 
    Scenario: complete the renewalContractDraft-authorization with Reject
    Given request creation in initiator
    When renew request creation in initiator
    When complete the contract reviewaltask first with approver
    When complete the contract reviewaltask second with approver
    Then Complete Contract - Lawyer Allocation task with select approver 
    Then complete the contract-draft-Reviewal task with approver
    And  complete the ContractDraft-authorization task with Rejected
    
    
    @oldcontractrenewecontractReviewModification
    Scenario: complete the oldcontractcontractreviewaltask with send for modification
    Given renew the old contract 
    When complete the renew contract reviewal task one with send for modification
    Then complete the renew contract reviewal task two with send for modification
    And  complete resubmission task in initiator
    
    @oldcontractreneweContractDraft-Reviewal 
    Scenario: complete the ContractDraft-Reviewal with send for modification
    Given renew the old contract request
    When complete the contract review task1 with approve
    When complete the contract review task2 with approve
    Then complete the Contract-Lawyer Allocation task
    Then complete the ContractDraftReview task with send for modification
    And  complete the resubmission tasks
    
    @oldcontractreneweContractDraft-authorization 
    Scenario: complete the ContractDraft-authorization task with send for modification
    Given renew the oldcontract request
    When complete the contract_reviewal task one with approve
    When complete the contract_reviewal task two with approve
    Then complete the contract_lawyer Allocation task
    Then complete the Contract_Draft-Reviewal task with approve
    And  complete the Contract_Draft_authorization task with send for modification
    And  complete the resubmission_task
    
     @oldcontractrenewecontractReviewReject
    Scenario: complete the contractreviewaltask with Reject
    #Given renew the old contract request in initiator
   # When complete the contract reviewal task_one with Rejected
    Then complete contract reviewal task two with the Reject
    
     @oldcontractreneweContractDraft-ReviewalReject 
    Scenario: complete the ContractDraft-Reviewal with Reject
    Given renew the oldcontract in initiator
    When complete the ContractReviewal task one with approved
    When complete the ContractReviewal task two with approved
    Then completed the ContractLawyer allocation task
    Then completed the ContractDraft-Reviewal task with Reject
    
    @oldcontractreneweContractDraft-authorizationReject 
    Scenario: complete the ContractDraft-authorization with Reject
    Given renew the old contract from the initiator task 
    When complete the contract reviewaltasks first with approve
    When complete the contract reviewaltasks second with approve
    Then Complete Contract - Lawyer Allocation tasks with select approver 
    Then complete the contract-draft-Reviewal tasks with approve
    And  complete the ContractDraft-authorization tasks with Reject
    