import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DataFetch {
    public static void main(String[] args) {
        
       
        String url = "https://api.freeapi.app/api/v1/public/books?page=1&limit=10&inc=kind%2Cid%2Cetag%2CvolumeInfo&query=tech";

        
        try {
           
            HttpClient client = HttpClient.newHttpClient();

          
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()              
                    .build();

            
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

           
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Data aa gaya bhai: \n" + response.body());

        } catch (Exception e) {
            
            System.out.println("Kuch gadbad ho gayi: " + e.getMessage());
        }
    }
}
