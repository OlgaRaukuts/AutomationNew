import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class PostmanEchoGetTest {

@Test
    public void useSpec(){
    given()
            .spec(Configs.spec)
            .param("limit",20)
            .when()
            .get("blogs")
            .then()
            .statusCode(200);
}

    @Test
    public void postmanFirstGetTest(){
        RestAssured.
                when().get("https://postman-echo.com/get").
                then().assertThat().statusCode(200);
    }
}

