import io.restassured.builder.ResponseSpecBuilder;

import static org.hamcrest.core.StringContains.containsString;

public class ResponseSpecification {
    protected static ResponseSpecification responseSpec;
    static void getResponse(){
        responseSpec = (ResponseSpecification) new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody(containsString("success"))
                .build();
    }


}
