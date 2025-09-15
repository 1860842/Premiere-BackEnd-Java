package cal.info.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import cal.info.modele.Etudiant;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class ControllerEtudiant implements HttpHandler {
    
    
     List<Etudiant> lesEtudiants = new ArrayList<>();

    @Override
    public void handle(HttpExchange echange) throws IOException {

        String response = "Bienvenue au controle des etudiants !";

        echange.sendResponseHeaders(200, response.length());
        OutputStream os = echange.getResponseBody();
        os.write(response.getBytes());

        os.close();
    }
}
