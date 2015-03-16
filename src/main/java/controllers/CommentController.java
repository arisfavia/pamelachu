package controllers;

public class CommentController {       

    public Result index() {
        return Results.html().template("views/CommentController/comment.ftl.html");

    }
}