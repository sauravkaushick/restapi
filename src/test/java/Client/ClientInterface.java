package Client;

import io.restassured.response.Response;


public interface ClientInterface {

    public Response getRequest(String uri);
    public Response deleteRequest(String uri);
    public Response sendPostRequest(String uri, Object requestPayload);
    public Response sendPutRequest(String uri, Object requestPayload);
    public Response sendPatchRequest(String uri, Object requestPayload);

}