import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.testng.Assert;
import static io.restassured.RestAssured.given;

public class Test_Lab5_POST_Response {

    @Test
    public void testPostRequest_response() {
        String expectedName = "qa-test-111";

        RequestSpecification request = given();
        request.header("Content-Type", "application/json");
        request.body("{\"Name\":\"" + expectedName + "\",\"IsComplete\":false}");

        Response response = request.post("https://peselvalidatorapitest.azurewebsites.net/api/Todo");
        int actualId = response.path("id");
        String actualName = response.path("name");
        Boolean actualIsComplete = response.path("isComplete");

        Assert.assertTrue(actualId > 0);
        Assert.assertEquals(actualName, expectedName);
        Assert.assertFalse(actualIsComplete);
    }


}

