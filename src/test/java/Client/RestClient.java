package Client;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class RestClient implements ClientInterface {
        
    public Response getRequest(String uri){
        return given().when().get(uri);
    }

    public Response deleteRequest(String uri){
        return given().when().delete(uri);
    }

    public Response sendPostRequest(String uri, Object requestPayload) {

        return given().contentType(ContentType.JSON).when().body(requestPayload).post(uri);
    }

    public Response sendPutRequest(String uri, Object requestPayload) {

        return given().contentType(ContentType.JSON).when().body(requestPayload).put(uri);
    }

    public Response sendPatchRequest(String uri, Object requestPayload) {

        return given().contentType(ContentType.JSON).when().body(requestPayload).patch(uri);
    }
    
}
