package cal.info.controller;

import cal.info.modele.Hackathon;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class ControllerHackathon implements HttpHandler {

     List<Hackathon> lesHackathons = new ArrayList<>();

    @Override
    public void handle(HttpExchange echange) throws IOException {

        String response = "Bienvenue au contrôle des hackathons !";

        echange.sendResponseHeaders(200, response.length());
        OutputStream os = echange.getResponseBody();
        os.write(response.getBytes());

        os.close();
    }
}
