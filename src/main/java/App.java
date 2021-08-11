import models.Hero;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
    public class App {
        public static void main(String[] args){
            staticFileLocation("/public");
         get("/",(request, response) -> {
             Map<String, Object> model= new HashMap<>();
             return new ModelAndView(model,"index.hbs");
         }, new HandlebarsTemplateEngine());

         post("/hero/details",(req, res) -> {
              Map<String, Object> model= new HashMap<String, Object>();
              String name=req.queryParams("name");
              int age=Integer.parseInt(req.queryParams("age"));
              String power=req.queryParams("powers");
              String weakness=req.queryParams("weakness");
              Hero hero= new Hero(name,age,power,weakness);
              ArrayList<Hero> arr=Hero.getNinjaInstance();
              req.session().attribute("nam",arr);
             model.put("nam", req.session().attribute("nam"));
             return new ModelAndView(model, "success.html");
         },new HandlebarsTemplateEngine());
         get("/hero/details",(request, response) -> {
                Map<String,Object> model= new HashMap<>();
             model.put("nam", request.session().attribute("nam"));
                return  new ModelAndView(model,"heros.hbs");
            }, new HandlebarsTemplateEngine());
         get("/squad", (request, response) -> {
             Map<String,Object> model= new HashMap<String, Object>();
             return new ModelAndView(model,"squad-forms.html");
         }, new HandlebarsTemplateEngine());
        }

    }
