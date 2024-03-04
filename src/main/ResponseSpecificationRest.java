import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class ResponseSpecificationRest {
    protected static ResponseSpecification responseSpecSuccess;
    @BeforeClass
    static ResponseSpecification getResponseSuccess(){
        responseSpecSuccess = (ResponseSpecification) new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
        return (ResponseSpecification) responseSpecSuccess;
    }

    static ResponseSpecification getResponse404(){
        responseSpecSuccess = (ResponseSpecification) new ResponseSpecBuilder()
                .expectStatusCode(404)
                .build();
        return (ResponseSpecification) responseSpecSuccess;
    }

}
