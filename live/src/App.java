import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        // Accessar url
        var url = "https://api.themoviedb.org/3/trending/movie/week?api_key={insert_here_api_key}";
        URI uri = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).GET().build();
        
        // Pegar texto JSON
        String json = client.send(request, BodyHandlers.ofString()).body();
        
        // Imprimir texto JSON
        System.out.println(json);
    }
}
