import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetTest {

    @Test
    public void firstGetTest(){
                given().spec(RequestSpecificationRest.initSpec())
                .when().get(Endpoints.getUsers).
                then().spec(ResponseSpecificationRest.getResponseSuccess());
    }
    @Test
    public void checkBook(){
        LibraryPojo libraryPojo = given().spec(RequestSpecificationRest.initSpec())
                .when().get(Endpoints.getUsers)
                .then().extract().body().as(LibraryPojo.class);
    }


    @Test
    public void getTestNegative(){
        when().get("https://reqres.in/api/").
                then().spec(ResponseSpecificationRest.getResponse404());
    }
}

