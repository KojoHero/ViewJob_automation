@COMMUNITY-713
@REQ_COMMUNITY-6
Feature: Job portal

	#Tests As a business, I should be able to see all jobs that I posted. 
	#
	#Acceptance Criteria: 
	#
	## User is logged-in
	## User clicks on All Jobs from its account from Job Portal on the navigation panel
	## A page loads with all the jobs posted by the user
	## The page provides filer: Search, Category, Location, Type, Salary Range
	##  User can select/deselect multiple jobs and perform an action (delete)
	## If the user clicks on any particular job, a one-job page loads up (Same Add Job page)
	## User can edit the job and save it
	## This page also provides the Delete Job option
	@TEST_COMMUNITY-745 @REQ_COMMUNITY-22 @TESTSET_COMMUNITY-709
	Scenario: Verify if a business can view, search, edit and delete posted jobs
		When user logs in (view jobs)
		And user goes to view jobs (view jobs)
		And User can search and filter by categories (view jobs)
		And user can select/deselect a job and delete a selected job
		And user can click and view the details of a selected job
		And user can edit a posted job or delete a posted job
