import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
public class RequestSpecificationRest{
    protected static RequestSpecification requestSpec;
    @BeforeClass
    public static RequestSpecification initSpec(){
        requestSpec = (RequestSpecification) new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://reqres.in")
                //.setPort(8080)
                .build();
        return (RequestSpecification) requestSpec;
    }

    }

