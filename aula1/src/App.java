import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // Do an HTTP conection and search the top 250 films
        String url = "https://api.themoviedb.org/3/trending/movie/week?api_key={insert_your_api_key}";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        //System.out.println(body);

        // Extract interesting data {title, poster, rating}
        var parser = new JsonParser();
        List<Map<String, String>> listaFilmes = parser.parse(body);

        // Plot and manipulate the data
        for (Map<String, String> filme : listaFilmes) {
            System.out.println(filme.get("title"));
            System.out.println("http://image.tmdb.org/t/p/w500" + filme.get("poster_path"));
            System.out.println(filme.get("vote_average"));
            System.out.println("");
        }
    }
}
