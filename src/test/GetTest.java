import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetTest {
    private static RequestSpecification requestSpecification;
    @BeforeClass
    public static void initSpec(){
        requestSpecification = (RequestSpecification) new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://reqres.in")
                //.setPort(8080)
                .build();
    }

    @Test
    public void firstGetTest(){
                given().spec((RequestSpecification) requestSpecification)
                .when().get(Endpoints.getUsers).
                then().assertThat().statusCode(200);
    }
    @Test
    public void getTestNegative(){
        RestAssured.
                when().get("https://reqres.in/api/").
                then().assertThat().statusCode(404);
    }
}

