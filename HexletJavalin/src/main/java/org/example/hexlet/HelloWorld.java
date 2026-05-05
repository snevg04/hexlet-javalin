package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursePage;

import static io.javalin.rendering.template.TemplateUtil.model;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyles.header;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

//        app.get("/", ctx -> ctx.result("Hello World"));
//        app.get("/users", ctx -> ctx.result("GET /users"));
//        app.post("/users", ctx -> ctx.result("POST /users"));
//        app.get("/hello", ctx -> {
//            var name = ctx.queryParam("name");
//            if (name == null) {
//                ctx.result("Hello, World!");
//            } else {
//                ctx.result("Hello, " + name + "!");
//            }
//        });
//
//        app.get("/courses/{id}", ctx -> {
//            ctx.result("Course ID: " + ctx.pathParam("id"));
//        });
//        app.get("/users/{id}", ctx -> {
//            ctx.result("User ID: " + ctx.pathParam("id"));
//        });
//
//  public static void show(Context ctx) {
//      var id = ctx.pathParamAsClass("id", Long.class).get();
//      var user = UserRepository.find(id) // Ищем пользователя в базе по id
//          .orElseThrow(() -> new NotFoundResponse("Entity with id = " + id + " not found"));
//  }
//        app.get("/courses/{courseId}/lessons/{id}", ctx -> {
//            var courseId = ctx.pathParam("courseId");
//            var lessonId =  ctx.pathParam("id");
//            ctx.result("Course ID: " + courseId + " Lesson ID: " + lessonId);
//        });
//
//        app.get("users/{id}/post/{postId}", ctx -> {
//            var userId = ctx.pathParam("id");
//            var postId = ctx.pathParam("postId");
//            ctx.result("User ID: " + userId + " Post ID: " + postId);
//        });

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/courses/{id}", ctx -> {
            var id = ctx.pathParam("id");
//            var course =
//            var page = new CoursePage(courses, header);
//            ctx.render("courses/show.jte", model("page", page));
        });

            app.start(7070);
    }
}