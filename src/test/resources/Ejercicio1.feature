Feature: Create and update a user in Todo.ly
  Scenario: crear y actualizar el user

    Given uso autentificacion none
    When uso request POSTSINH al url /api/user.json con el json

    """
    {
    "Email":"segundoExamenRodriViladegut@upb.com",
    "FullName":"Rodrigo Viladegut",
    "Password":"12345"
    }
    """

    Then el codigo de respuesta 200

    And el body esperado deberia ser
    """
    {
    "Id": "IGNORE",
    "Email": "segundoExamenRodriViladegut@upb.com",
    "Password": null,
    "FullName": "Rodrigo Viladegut",
    "TimeZone": 0,
    "IsProUser": false,
    "DefaultProjectId": "IGNORE",
    "AddItemMoreExpanded": false,
    "EditDueDateMoreExpanded": false,
    "ListSortType": 0,
    "FirstDayOfWeek": 0,
    "NewTaskDueDate": -1,
    "TimeZoneId": "Pacific Standard Time"
    }
    """
    When actualizo con el link /api/user.json con el usuario segundoExamenRodriViladegut@upb.com y password 12345
    """
    {
      "FullName": "Rodrigo Viladegut Update"
    }
    """

    Then el codigo de respuesta 200
