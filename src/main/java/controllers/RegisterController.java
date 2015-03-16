package controllers;

public class RegisterController {       

    public Result index() {
        return Results.html().template("views/RegisterController/register.ftl.html");

    }
}
