package controllers;

public class ProfileMenuController {       

    public Result index() {
        return Results.html().template("views/ProfileMenuController/profileMenu.ftl.html");

    }
}
