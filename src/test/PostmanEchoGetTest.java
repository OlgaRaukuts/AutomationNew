import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PostmanEchoGetTest {

    @Test
    public void postmanFirstGetTest(){
        RestAssured.
                when().get("https://postman-echo.com/get").
                then().assertThat().statusCode(200);
    }
}

