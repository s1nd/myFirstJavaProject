package javaStudy20_socket;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Http1 {
    static HttpClient httpclient = HttpClient.newBuilder().build();
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        String url = "https://www.sina.com.cn";
        //为什么不直接用json呢？
        HttpRequest req = HttpRequest.newBuilder(new URI(url))
                .header("User-Agent","Java HttpClient")
                .header("Accept","*/*")
                .timeout(Duration.ofSeconds(5))
                .version(HttpClient.Version.HTTP_2)
                .build();
        HttpResponse<String> res = httpclient.send(req,HttpResponse.BodyHandlers.ofString());
        Map<String, List<String>> headers = res.headers().map();
        for(String header:headers.keySet()){
            System.out.println(headers.get(header).get(0));

        }
        System.out.println(res.body().substring(0,1024)+"...");
    }
}
