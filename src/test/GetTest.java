import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class GetTest extends BaseTest {

    @Test
    public void checkAvatarAndIdTest(){
        Specifications.installSpecifications(Specifications.requestSpecification(),Specifications.responseSpecification());
        List<UserDataPojo> userData = given()
                .when()
                        .contentType(ContentType.JSON)
                        .get(Endpoints.getUsers).
                then()
                        .log().all()
                        .extract().body().jsonPath().getList("name", UserDataPojo.class);
        userData.stream().forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId())));

     /*   for (UserDataPojo userDatum : userData) {
            assertThat(userDatum).hasFieldOrPropertyWithValue("Numm", "numm");
        }

      */

    }


    @Test
    public void getTestNegative(){
        Specifications.installSpecifications(Specifications.requestSpecification(), Specifications.getResponse404());
        when().get("https://reqres.in/api/");
    }

}

