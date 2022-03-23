import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.get;

public class Test_Lab2_GET_Response {

    @Test
    public void testGetRequest_response(){
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Todo/1");
        String actualBody=response.getBody().asString();
        String expectedBody="{\"id\":1,\"name\":\"Item1abc\",\"isComplete\":false}";

        Assert.assertEquals(expectedBody, expectedBody);
    }
}
