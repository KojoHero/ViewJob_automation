$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/View_Job/View_Job/src/test/java/View_Job/Viewjobs.feature");
formatter.feature({
  "line": 3,
  "name": "Job portal",
  "description": "",
  "id": "job-portal",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@COMMUNITY-713"
    },
    {
      "line": 2,
      "name": "@REQ_COMMUNITY-6"
    }
  ]
});
formatter.before({
  "duration": 6308454499,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Tests As a business, I should be able to see all jobs that I posted."
    },
    {
      "line": 6,
      "value": "#"
    },
    {
      "line": 7,
      "value": "#Acceptance Criteria:"
    },
    {
      "line": 8,
      "value": "#"
    },
    {
      "line": 9,
      "value": "## User is logged-in"
    },
    {
      "line": 10,
      "value": "## User clicks on All Jobs from its account from Job Portal on the navigation panel"
    },
    {
      "line": 11,
      "value": "## A page loads with all the jobs posted by the user"
    },
    {
      "line": 12,
      "value": "## The page provides filer: Search, Category, Location, Type, Salary Range"
    },
    {
      "line": 13,
      "value": "##  User can select/deselect multiple jobs and perform an action (delete)"
    },
    {
      "line": 14,
      "value": "## If the user clicks on any particular job, a one-job page loads up (Same Add Job page)"
    },
    {
      "line": 15,
      "value": "## User can edit the job and save it"
    },
    {
      "line": 16,
      "value": "## This page also provides the Delete Job option"
    }
  ],
  "line": 18,
  "name": "Verify if a business can view, search, edit and delete posted jobs",
  "description": "",
  "id": "job-portal;verify-if-a-business-can-view,-search,-edit-and-delete-posted-jobs",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@TEST_COMMUNITY-745"
    },
    {
      "line": 17,
      "name": "@REQ_COMMUNITY-22"
    },
    {
      "line": 17,
      "name": "@TESTSET_COMMUNITY-709"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user logs in (view jobs)",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user goes to view jobs (view jobs)",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User can search and filter by categories (view jobs)",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user can select/deselect a job and delete a selected job",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user can click and view the details of a selected job",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user can edit a posted job or delete a posted job",
  "keyword": "And "
});
formatter.match({
  "location": "Viewjobs_steps.user_logs_in_view_jobs()"
});
formatter.result({
  "duration": 5423178300,
  "status": "passed"
});
formatter.match({
  "location": "Viewjobs_steps.user_goes_to_view_jobs_view_jobs()"
});
formatter.result({
  "duration": 6110309999,
  "status": "passed"
});
formatter.match({
  "location": "Viewjobs_steps.user_can_search_and_filter_by_categories_view_jobs()"
});
formatter.result({
  "duration": 7304309301,
  "status": "passed"
});
formatter.match({
  "location": "Viewjobs_steps.user_can_select_deselect_a_job_and_delete_a_selected_job()"
});
formatter.result({
  "duration": 15250065899,
  "status": "passed"
});
formatter.match({
  "location": "Viewjobs_steps.user_can_click_and_view_the_details_of_a_selected_job()"
});
formatter.result({
  "duration": 3079174800,
  "status": "passed"
});
formatter.match({
  "location": "Viewjobs_steps.user_can_edit_a_posted_job_or_delete_a_posted_job()"
});
formatter.result({
  "duration": 9428969500,
  "status": "passed"
});
});