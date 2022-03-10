Feature: Create a Token and then delete the Token
  Scenario: Create a Token and then delete the Token

    Given uso autentificacion basic
    When uso request GET al url /api/authentication/token.json con el json
    """

    """
    Then el codigo de respuesta 200
    And recivo el TokenString guardado en TOKEN
    And el body esperado deberia ser
    """
    {
    "TokenString": TOKEN,
    "UserEmail": "rodriviladegut@gmail.com",
    "ExpirationTime": "IGNORE"
}
    """
