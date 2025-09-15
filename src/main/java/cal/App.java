package cal;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import cal.info.controller.ControllerEtudiant;
import cal.info.controller.ControllerHackathon;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class App {
    public static void main(String[] args) throws IOException {
    // Création du serveur HTTP qui écoutera sur le port 8000
    HttpServer serveur = HttpServer.create(new InetSocketAddress(8090), 0);

    serveur.createContext("/hackathons", new ControllerHackathon());
    serveur.createContext("/etudiants", new ControllerEtudiant());

    // Première route "/accueil" :
    serveur.createContext("/accueil", new HttpHandler() {
            @Override
            public void handle(HttpExchange echange) throws IOException {
                String response = "Bienvenue sur la page d'accueil !";
                echange.sendResponseHeaders(200, response.length());
                OutputStream os = echange.getResponseBody();
                os.write(response.getBytes());
                os.close(); 
            }
        });

    // Démarrer le serveur
    serveur.setExecutor(null); // Créer un exécuteur par défaut
    serveur.start();

    System.out.println("Serveur démarré et en écoute sur le port 8080");
}
}
