import models.Hero;
import models.Squad;
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
             return new ModelAndView(model, "heros.hbs");
         },new HandlebarsTemplateEngine());
         get("/hero/details",(request, response) -> {
                Map<String,Object> model= new HashMap<>();
             model.put("nam", request.session().attribute("nam"));
                return  new ModelAndView(model,"heros.hbs");
            }, new HandlebarsTemplateEngine());
         get("/squad/form", (request, response) -> {
             Map<String,Object> model= new HashMap<String, Object>();
             model.put("hero", request.session().attribute("nam"));
             return new ModelAndView(model,"squad-forms.html");
         }, new HandlebarsTemplateEngine());

        post("/squad", (req, res)->{
            Map<String, Object> model= new HashMap<String, Object>();
            String name= req.queryParams("name");
            String Cause= req.queryParams("cause");
            Squad squadCons= new Squad(name, Cause);
            ArrayList<Squad>allSquads= Squad.getsInstance();
            req.session().attribute("squad",allSquads);
            model.put("squad", req.session().attribute("squad"));
            model.put("hero", req.session().attribute("nam"));
            return new ModelAndView(model,"squad.html");

        }, new HandlebarsTemplateEngine());
        get("/squad/home",(request, response) -> {
            Map<String,Object> model= new HashMap<String, Object>();
            model.put("squad", request.session().attribute("squad"));
            model.put("hero", request.session().attribute("nam"));
            return new ModelAndView(model,"squad.html");
        },new HandlebarsTemplateEngine());
    }
    }
