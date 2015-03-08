package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Chrome;
import views.html.Firefox;
import views.html.Index;
import views.html.InternetExplorer;

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

    return ok(Index.render());
  }

  /**
   * Returns the internet explorer page.
   *
   * @return The resulting internet explorer page.
   */
  public static Result internetExplorer() {

    return ok(InternetExplorer.render());
  }

  /**
   * Returns the firefox page.
   *
   * @return The resulting firefox page.
   */
  public static Result firefox() {

    return ok(Firefox.render());
  }

  /**
   * Returns the chrome page.
   *
   * @return The resulting chrome page.
   */
  public static Result chrome() {

    return ok(Chrome.render());
  }

}
