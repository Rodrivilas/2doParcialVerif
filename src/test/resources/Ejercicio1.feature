Feature: Create and update a user in Todo.ly
  Scenario: crear y actualizar el user

    Given uso autentificacion none
    When uso request POST al url /api/user.json con el json
    """
    {
    "Email":"segundoParcialRodriViladegut@upb.com",
    "FullName":"Rodrigo Viladegut",
    "Password":"12345"
    }
    """
    Then el codigo de respuesta 200
    And el body esperado deberia ser
    """
    {

    }
    """
    When actualizo con el link /api/user.json con el usuario segundoParcialRodriViladegut@upb.com y password 12345
    """
    {
      "FullName": "Rodrigo Viladegut Update"
    }
    """
    Then el codigo de respuesta 200
