import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Test
public class PostmanEchoGetTest extends Configs {

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
                when().get("https://postman-echo.com/get?foo1=bar1&foo2=bar2").
                then().assertThat().statusCode(200);
    }
}

