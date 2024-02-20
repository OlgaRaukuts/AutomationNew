import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

public class RequestSpecification {
    static RequestSpecification requestSpecification;

    static void setUp() {
        requestSpecification = (RequestSpecification) new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setPort(8080)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.ANY)
                .log(LogDetail.ALL)
                .build();
    }

}
