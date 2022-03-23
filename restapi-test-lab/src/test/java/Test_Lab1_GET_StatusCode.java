import io.restassured.response.Response;
import static io.restassured.RestAssured.get;
import org.junit.Assert;
import org.junit.Test;

public class Test_Lab1_GET_StatusCode {

    @Test
    public void testGetRequest_ResponseStatusCodeOk() {
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Todo/1");

        Assert.assertEquals(response.statusCode(), 200);


    }

    @Test

    public void testGetRequest_ResponseStatusCodeNotFound() {
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Todo/5");

        Assert.assertEquals(response.statusCode(), 404);
    }
}
