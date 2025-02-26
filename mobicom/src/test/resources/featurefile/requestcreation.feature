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
     
      
    