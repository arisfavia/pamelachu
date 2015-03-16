package controllers;

public class LoginController {       

    public Result index() {
        return Results.html().template("views/LoginController/login.ftl.html");

    }
}
