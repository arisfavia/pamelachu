package controllers;

public class ProfileTimelineController {       

    public Result index() {
        return Results.html().template("views/ProfileTimelineController/profileTimeline.ftl.html");

    }
}
