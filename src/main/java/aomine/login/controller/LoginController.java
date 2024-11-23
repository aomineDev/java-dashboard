package aomine.login.controller;

import java.awt.event.ActionEvent;

import aomine.ViewManager;
import aomine.admin.view.DashboardView;
import aomine.login.view.LoginView;

public class LoginController {
  private LoginView view;

  public LoginController(LoginView view) {
    this.view = view;
  }

  public void handleLoginClick(ActionEvent evt) {
    ViewManager.showView(new DashboardView());
    ViewManager.login();
  }
}
