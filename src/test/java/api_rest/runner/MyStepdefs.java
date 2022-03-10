package api_rest.runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("uso autentificacion {}")
    public void usoAutentificacionNone() {
    }

    @When("uso request {} al url {} con el json")
    public void usoRequestPOSTAlUrlApiUserJsonConElJson() {
    }

    @Then("el codigo de respuesta {int}")
    public void elCodigoDeRespuesta(int expected) {
    }

    @And("el body esperado deberia ser")
    public void elBodyEsperadoDeberiaSer(String expectedJSON) {
    }

    @When("actualizo con el link {} con el usuario {} y password {}")
    public void actualizoConElLinkApiUserJsonConElUsuarioYPassword(String url,String pwd,String user,String body) {
    }
}
