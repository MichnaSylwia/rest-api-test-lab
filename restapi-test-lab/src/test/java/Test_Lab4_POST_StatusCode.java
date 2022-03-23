import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Lab4_POST_StatusCode {

    @Test
    public void testPostRequest_responseStatusCode(){

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body("{\"Name\":\"qa-test-001\",\"IsComplete\":false}");

        Response response = request.post("https://peselvalidatorapitest.azurewebsites.net/api/Todo");

        Assert.assertEquals(response.statusCode(), 201);
    }
    @Test
    public void testPostRequest_responseStatusCode_version2(){

        RequestSpecification request = RestAssured.given();
        request.contentType(ContentType.JSON);
        request.body("{\"Name\":\"qa-test-001\",\"IsComplete\":false}");

        Response response = request.post("https://peselvalidatorapitest.azurewebsites.net/api/Todo");

        Assert.assertEquals(response.statusCode(), 201);
    }
}
