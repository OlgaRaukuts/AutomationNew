import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostTests extends BaseTest {
    @Test
    public void createNewUser(){
        given()
                .when()
        .body(postPojo)
                .post(Endpoints.postUser)
                .then();
        //assertThat(postPojo.getJob()).isEqualTo(postPojo.getJob()); just think about all this stuff
    }
}
