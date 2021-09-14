package de.thm.mni.oopfq.http;

import de.thm.mni.oopfq.storage.IStore;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

/**
 * Provides an web api for to handle http calls.
 */
public class WebApi {
    private Vertx vertx;
    //private Set<Professor> professorSet;
    //private Set<Student> studentSet;

    /**
     * @param vertx The current vertex application.
     * @param store A store to store data.
     */
    public WebApi(Vertx vertx, IStore store) {
        this.vertx = vertx;

        //this.professorSet = store.newStore();
        //this.studentSet = store.newStore()
    }

    /**
     * @return The http router for the api.
     */
    public Router getRouter() {
        Router router = Router.router(vertx);

        router.route().handler(BodyHandler.create());

        router.post("/professors").handler(this::createProfessor);
        router.get("/professors").handler(this::listProfessors);

        router.get("/professors/:id").handler(this::getProfessor);
        router.put("/professors/:id").handler(this::changeProfessor);
        router.delete("/professors/:id").handler(this::deleteProfessor);

        router.post("/students").handler(this::createStudent);
        router.get("/students").handler(this::listStudents);

        router.get("/students/:id").handler(this::getStudent);
        router.put("/students/:id").handler(this::changeStudent);
        router.delete("/students/:id").handler(this::deleteStudent);

        router.get("/mentorings").handler(this::listMentors);

        return router;
    }

    protected void changeStudent(RoutingContext routingContext) {
        HttpServerRequest request = routingContext.request();
        String id = request.getParam("id");
        // TODO

        JsonObject body = routingContext.getBodyAsJson();

        System.out.println(body.encodePrettily());

        // Example Code
        HttpServerResponse response = routingContext.response();

        response.putHeader("content-type", "application/json");
        JsonObject someJson = new JsonObject()
                .put("test", "test2");

        response.end(someJson.encode());
    }

    protected void getStudent(RoutingContext routingContext) {
        String id = routingContext.request().getParam("id");
        // TODO
    }

    protected void deleteStudent(RoutingContext routingContext) {
        String id = routingContext.request().getParam("id");
        // TODO
    }

    protected void deleteProfessor(RoutingContext routingContext) {
        String id = routingContext.request().getParam("id");
        // TODO
    }

    protected void changeProfessor(RoutingContext routingContext) {
        String id = routingContext.request().getParam("id");
        // TODO
    }

    protected void getProfessor(RoutingContext routingContext) {
        String id = routingContext.request().getParam("id");
        // TODO
    }

    protected void listMentors(RoutingContext routingContext) {
        // TODO
    }

    protected void listStudents(RoutingContext routingContext) {
        // TODO
    }

    protected void createStudent(RoutingContext routingContext) {
        // TODO
    }

    protected void listProfessors(RoutingContext routingContext) {
        // TODO
    }

    protected void createProfessor(RoutingContext routingContext) {
        // TODO
    }
}
