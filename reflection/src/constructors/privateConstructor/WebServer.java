package constructors.privateConstructor;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;

public class WebServer {
    public void startServer() throws IOException {
        HttpServer httpServer = HttpServer.create(ServerConfiguration.getInstance().getInetAddress(), 0);
        httpServer.createContext("/hello").setHandler(httpHandler -> {

                    String response = ServerConfiguration.getInstance().getGreetingMessage();
                    httpHandler.sendResponseHeaders(200, response.length());
                    OutputStream responseBody = httpHandler.getResponseBody();
                    responseBody.write(response.getBytes());
                    responseBody.flush();
                    responseBody.close();
                }
        );

        System.out.println(String.format("Server is Starting on %s at port %d",
                ServerConfiguration.getInstance().getInetAddress().getHostName(),
                ServerConfiguration.getInstance().getInetAddress().getPort()));
        httpServer.start();
    }
}
