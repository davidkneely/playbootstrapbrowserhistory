package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Chrome;
import views.html.Firefox;
import views.html.Index;
import views.html.InternetExplorer;
import views.html.Introduction;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   *
   * @return The resulting home page.
   */
  public static Result index() {

    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Renders the introdcution page.
   * @return The introduction page.
   */
  public static Result introduction() {

    return ok(Introduction.render("Welcome to the introduction."));
  }
  /**
   * Renders the internet explorer page.
   * @return The internet explorer page.
   */
  public static Result internetExplorer() {

    return ok(InternetExplorer.render("Welcome to internet explorer."));
  }
  /**
   * Renders the firefox page.
   * @return The firefox page.
   */
  public static Result firefox() {

    return ok(Firefox.render("Welcome to Firefox."));
  }
  /**
   * Renders the chrome page.
   * @return The chrome page.
   */
  public static Result chrome() {

    return ok(Chrome.render("Welcome to Chrome."));
  }

}
