import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
    public static RequestSpecification requestSpecification(){

        return new RequestSpecBuilder()
                .setBaseUri("https://reqres.in")
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification responseSpecification(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }
    static ResponseSpecification getResponseSuccess201(){
        return new ResponseSpecBuilder()
                .expectStatusCode(201)
                .build();
    }
    static ResponseSpecification getResponse404(){
        return new ResponseSpecBuilder()
                .expectStatusCode(404)
                .build();
    }
    public static void installSpecifications(RequestSpecification request, ResponseSpecification response){
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }
}
