package ExceptionHandeling.Calculator;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DataFromApi {
    public static void main(String[] args) {

        try {

            // 1️⃣ HttpClient object
            HttpClient client = HttpClient.newHttpClient();

            // 2️⃣ API request
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.github.com/users/ritesh-builds")).GET().build();

            // 3️⃣ API call
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 4️⃣ Response print
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Data from API:");
            System.out.println(response.body());

        } catch (Exception e) {
            System.out.println("An error occurred... " + e.getMessage());
        }
    }
}
