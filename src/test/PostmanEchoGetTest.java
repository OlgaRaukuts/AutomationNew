import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PostmanEchoGetTest {

    @Test
    public void firstGetTest(){
        RestAssured.
                when().get("https://postman-echo.com/get").
                then().assertThat().statusCode(200);
    }
    @Test
    public void getTestNegative(){
        RestAssured.
                when().get("https://postman-echo.com/get/olya").
                then().assertThat().statusCode(404);
    }
}

