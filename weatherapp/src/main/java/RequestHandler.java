import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * @author Saliha Altındiş
 * @author Zehra Yılmaz
 */

/**
 * This class is created for executing the request
 * which is composed of service root and city name that is taken from client.
 * @see <a href="https://technet.microsoft.com/en-us/library/cc958958.aspx">For record types, click here.</a>
 */
public class RequestHandler {
    private HttpClient currentClient = new DefaultHttpClient();
   /**
     * This method executes the request and gets response.
     * If response is valid, gets response body and returns it to City object using Gson.
	 * @param city
     * @return
     * @throws Exception
     * @see Exception
     * @see City
     * @see Gson
     */
    public City executeRequest(String c) throws Exception {
        HttpGet currentGetRequest = new HttpGet("http://localhost:8080/"+c);
        HttpResponse currentResponse;
        currentResponse = currentClient.execute(currentGetRequest);

        String json_string = EntityUtils.toString(currentResponse.getEntity());

        City city = new Gson().fromJson(json_string,City.class);
        return city;
    }





}
