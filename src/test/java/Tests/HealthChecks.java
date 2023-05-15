package Tests;
import org.junit.Test;

import Requests.RequestFactory;

public class HealthChecks extends TestConfig {

    RequestFactory requestFactory;

    public HealthChecks(){
        requestFactory = new RequestFactory();
    }

    @Test
    public void myFirstTest() {
        requestFactory = new RequestFactory();
        requestFactory.getAllVideoGames().then().statusCode(200);
    }
}