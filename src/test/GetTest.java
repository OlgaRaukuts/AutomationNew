import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetTest {

    @Test
    public void firstGetTest(){
        RestAssured
                .when().get("https://reqres.in/api/users?page=2").
                then().assertThat().statusCode(200);
    }
    @Test
    public void getTestNegative(){
        RestAssured.
                when().get("https://reqres.in/api/").
                then().assertThat().statusCode(404);
    }
}

