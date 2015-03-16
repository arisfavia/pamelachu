package controllers;

public class MenuController {       

    public Result index() {
        return Results.html().template("views/MenuController/menu.ftl.html");

    }
}
