$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EmployeeCRUD.feature");
formatter.feature({
  "line": 1,
  "name": "Employee CRUD and Search Operations",
  "description": "",
  "id": "employee-crud-and-search-operations",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "I am able to add edit and search and delete the  employee",
  "description": "",
  "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@employeeCRUD5TCS"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to PIM after log in with Admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Add employee with  first name as \"\u003cfName\u003e\" and mname as \"\u003cmName\u003e\" and lName as \"\u003cLname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I  verify employeeAdded in list with  first name as \"\u003cfName\u003e\" and mname as \"\u003cmName\u003e\" and lName as \"\u003cLname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on Edit button and update below values and save the Data",
  "rows": [
    {
      "cells": [
        "updatefNamevalue",
        "1"
      ],
      "line": 9
    },
    {
      "cells": [
        "updatedmName",
        "1"
      ],
      "line": 10
    },
    {
      "cells": [
        "updatedLname",
        "1"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I search the employee and ensure that it is searched using below values",
  "rows": [
    {
      "cells": [
        "updatefNamevalue",
        "AutUserFName1"
      ],
      "line": 13
    },
    {
      "cells": [
        "updatedmName",
        "AutUserMName1"
      ],
      "line": 14
    },
    {
      "cells": [
        "updatedlName",
        "AutUserLName1"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I select and Delete the Updated Employee and verify employee is not  in search result",
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee;",
  "rows": [
    {
      "cells": [
        "fName",
        "mName",
        "Lname"
      ],
      "line": 19,
      "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee;;1"
    },
    {
      "cells": [
        "AutUserFName",
        "AutUserMName",
        "AutUserLName"
      ],
      "line": 20,
      "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 255900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "I am able to add edit and search and delete the  employee",
  "description": "",
  "id": "employee-crud-and-search-operations;i-am-able-to-add-edit-and-search-and-delete-the--employee;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@employeeCRUD5TCS"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to PIM after log in with Admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Add employee with  first name as \"AutUserFName\" and mname as \"AutUserMName\" and lName as \"AutUserLName\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I  verify employeeAdded in list with  first name as \"AutUserFName\" and mname as \"AutUserMName\" and lName as \"AutUserLName\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on Edit button and update below values and save the Data",
  "rows": [
    {
      "cells": [
        "updatefNamevalue",
        "1"
      ],
      "line": 9
    },
    {
      "cells": [
        "updatedmName",
        "1"
      ],
      "line": 10
    },
    {
      "cells": [
        "updatedLname",
        "1"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I search the employee and ensure that it is searched using below values",
  "rows": [
    {
      "cells": [
        "updatefNamevalue",
        "AutUserFName1"
      ],
      "line": 13
    },
    {
      "cells": [
        "updatedmName",
        "AutUserMName1"
      ],
      "line": 14
    },
    {
      "cells": [
        "updatedlName",
        "AutUserLName1"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I select and Delete the Updated Employee and verify employee is not  in search result",
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeCRUDSteps.navigate_to_PIM_after_log_in_with_Admin_user()"
});
formatter.write("Staarting the Orange HRM Application");
formatter.write("Logging in to ORange HRM Application");
formatter.write("There is some Exception in Fluent Wait checking--  no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@type\u003d\u0027submit\u0027]\"}\n  (Session info: chrome\u003d137.0.7151.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-715ID5O\u0027, ip: \u0027192.168.0.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.20\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 137.0.7151.122, chrome: {chromedriverVersion: 137.0.7151.68 (2989ffee9373..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:52015}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: aa1372ac19b739abf542cb9ccfc16fbf\n*** Element info: {Using\u003dxpath, value\u003d//button[@type\u003d\u0027submit\u0027]}");
formatter.write(" Error on fetching  the text in element after wating !");
formatter.embedding("image/png", "embedded0.png");
formatter.write("Nevigating to PIM page after LOGIN");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 48570916500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AutUserFName",
      "offset": 36
    },
    {
      "val": "AutUserMName",
      "offset": 64
    },
    {
      "val": "AutUserLName",
      "offset": 92
    }
  ],
  "location": "EmployeeCRUDSteps.i_Add_employee_with_first_name_as_and_mname_as_and_lName_as(String,String,String)"
});
formatter.write("Adding new employee by nevigating to \u0027Add Empployee page\u0027 !");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 27132195000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AutUserFName",
      "offset": 53
    },
    {
      "val": "AutUserMName",
      "offset": 81
    },
    {
      "val": "AutUserLName",
      "offset": 109
    }
  ],
  "location": "EmployeeCRUDSteps.i_verify_employeeAdded_in_list_with_first_name_as_and_mname_as_and_lName_as(String,String,String)"
});
formatter.write("Searching the newly added emp in the list");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 32952824400,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeCRUDSteps.i_click_on_Edit_button_and_update_below_values_and_save_the_Data(DataTable)"
});
formatter.write("Editing the Searched employee Details ");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 36744069800,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeCRUDSteps.i_search_the_employee_and_ensure_that_it_is_searched_using_below_values(DataTable)"
});
formatter.write("Searching theedited amp in the list");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "duration": 17215663000,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeCRUDSteps.i_select_and_Delete_the_Updated_Employee_and_verify_employee_is_not_in_search_result()"
});
formatter.write("Deleting the searched employee !");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "duration": 5558833800,
  "status": "passed"
});
formatter.write("Closing the Application");
formatter.after({
  "duration": 428487600,
  "status": "passed"
});
});