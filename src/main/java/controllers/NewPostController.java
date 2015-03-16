package controllers;

public class NewPostController {       

    public Result index() {
        return Results.html().template("views/NewPostController/newPost.ftl.html");

    }
}
