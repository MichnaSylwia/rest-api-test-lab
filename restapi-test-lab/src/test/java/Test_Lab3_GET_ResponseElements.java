import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.get;

public class Test_Lab3_GET_ResponseElements {

    @Test
    public void testGetRequest_responseElements_id(){
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Todo/1");
        int actualId = response.path("id");
        int expectedId=1;
        Assert.assertEquals(actualId, expectedId);
    }

    @Test
    public void testGetRequest_responseElements_name(){
        Response response = get("https://peselvalidatorapitest.azurewebsites.net/api/Todo/1");

        String actualName=response.path("name");
        String expectedName="Item1abc";
        Assert.assertEquals(actualName, expectedName);

    }

}
