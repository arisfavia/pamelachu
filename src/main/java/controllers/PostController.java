package controllers;

public class PostController {       

    public Result index() {
        return Results.html().template("views/PostController/post.ftl.html");

    }
}
