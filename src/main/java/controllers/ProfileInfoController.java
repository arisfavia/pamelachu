package controllers;

public class ProfileInfoController {       

    public Result index() {
        return Results.html().template("views/ProfileInfoController/profileInfo.ftl.html");

    }
}
