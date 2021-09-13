package de.thm.mni.oopfq;

import de.thm.mni.oopfq.http.WebApi;
import de.thm.mni.oopfq.storage.Store;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

public class App {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        HttpServer server = vertx.createHttpServer();

        Store store = new Store();
        WebApi api = new WebApi(vertx, store);
        server.requestHandler(api.getRouter()).listen(8080, res -> {
            if (res.succeeded()) {
                System.out.println("Server is now listening!");
            } else {
                System.err.println("Failed to bind!");
            }
        });
    }
}


