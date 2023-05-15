package Requests;
import Client.RestClient;
import io.restassured.response.Response;

public class RequestFactory {
RestClient restClient;
public RequestFactory(){
    restClient = new RestClient();
}

public Response getAllVideoGames(){
        return restClient.getRequest("/videogame");
}

public Response postVideoGames(Object payload){
    return restClient.sendPostRequest("/videogame", payload);
}

}
