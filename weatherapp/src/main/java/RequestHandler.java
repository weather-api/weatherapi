import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class RequestHandler {
    private HttpClient currentClient = new DefaultHttpClient();

    public City executeRequest(String c) throws Exception {
        HttpGet currentGetRequest = new HttpGet("http://localhost:8080/"+c);
        HttpResponse currentResponse;
        currentResponse = currentClient.execute(currentGetRequest);

        String json_string = EntityUtils.toString(currentResponse.getEntity());

        City city = new Gson().fromJson(json_string,City.class);
        return city;
    }





}
