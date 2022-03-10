package api_rest.factoryRequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestPOSTSinHeaders implements IRequest {
    @Override
    public Response send(RequestInformation requestInformation) {
        Response response= given()
                .body(requestInformation.getBody())
                .log().all()
                .when()
                .post(requestInformation.getUrl());
        response.then().log().all();
        return response;
    }
}
