package Tests;
import org.junit.Assert;
import org.junit.Test;
import Requests.RequestFactory;
import io.restassured.response.Response;
import pojo.Requests.RequestsPojo;
import pojo.Responses.ResponsePojo;
import static io.restassured.RestAssured.*;

public class EndToEndTests extends TestConfig {

    RequestFactory requestFactory;

    public EndToEndTests(){
        requestFactory = new RequestFactory();
    }

    @Test
    public void myFirstTest() {

        requestFactory = new RequestFactory();
        requestFactory.getAllVideoGames().then().statusCode(200);

    }

    @Test
    public void testpostreq() {
        pojo.Requests.RequestsPojo req = new RequestsPojo();
        req.setCategory("abc");
        req.setName("saurav");
        req.setRating("five");
        req.setReleaseDate("2012-05-04");
        req.setReviewScore(85);
        requestFactory = new RequestFactory();
        Response response  = requestFactory.postVideoGames(req);
        ResponsePojo responsePojo =  response.getBody().as(ResponsePojo.class);
        response.path("id");
        }
    }
