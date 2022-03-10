Feature: Create and update a user in Todo.ly
  Scenario: create and update the user

    Given uso autentificacion basic
    When uso request POST al url /api/projects.json con el json
    """
    {
    "Content":"RodriProjectoo",
    "Icon":4
    }
    """
    Then el codigo de respuesta 200
    And el body esperado deberia ser
    """
    {
        "Id": "IGNORE",
        "Content": "RodriProjectoo",
        "ItemsCount": 0,
        "Icon":4,
        "ItemType": "IGNORE",
        "ParentId": null,
        "Collapsed": false,
        "ItemOrder": "IGNORE",
        "Children": [],
        "IsProjectShared": false,
        "ProjectShareOwnerName": null,
        "ProjectShareOwnerEmail": null,
        "IsShareApproved": false,
        "IsOwnProject": true,
        "LastSyncedDateTime": "IGNORE",
        "LastUpdatedDate": "IGNORE",
        "Deleted": false,
        "SyncClientCreationId": null
    }
    """
    And guardo el Id de la respuesta en Id_proj

    When uso request POST al url /api/items.json con el json
    """
    {
    "Content":"RodriVItemoo",
    "ProjectId": Id_proj
    }
    """
    Then el codigo de respuesta 200
    And el body esperado deberia ser
    """
    {
        "Id": "IGNORE",
        "Content": "RodriVItemoo",
        "ItemType": "IGNORE",
        "Checked": false,
        "ProjectId": Id_proj,
        "ParentId": null,
        "Path": "",
        "Collapsed": false,
        "DateString": null,
        "DateStringPriority": 0,
        "DueDate": "",
        "Recurrence": null,
        "ItemOrder": "IGNORE",
        "Priority": 4,
        "LastSyncedDateTime": "IGNORE",
        "Children": [],
        "DueDateTime": null,
        "CreatedDate": "IGNORE",
        "LastCheckedDate": null,
        "LastUpdatedDate": "IGNORE",
        "Deleted": false,
        "Notes": "",
        "InHistory": false,
        "SyncClientCreationId": null,
        "DueTimeSpecified": true,
        "OwnerId": "IGNORE"
    }
    """
    And guardo el Id de la respuesta en Id_item

    When uso request PUT al url /api/items.json con el json
    """
    {
      "Checked":true
    }
    """
    Then el codigo de respuesta 200

    When uso request DELETE al url /api/items/Id_item.json con el json
    """
    """
    Then el codigo de respuesta 200



