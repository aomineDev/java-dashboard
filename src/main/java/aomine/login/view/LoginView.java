package aomine.login.view;

import javax.swing.JButton;
import javax.swing.JPanel;

import aomine.login.controller.LoginController;
import net.miginfocom.swing.MigLayout;

public class LoginView extends JPanel {
  private LoginController controller;

  public LoginView() {
    controller = new LoginController(this);
    init();
  }

  public void init() {
    setLayout(new MigLayout());
    btnLogin = new JButton("Login");
    btnLogin.addActionListener(controller::handleLoginClick);

    add(btnLogin);
  }

  private JButton btnLogin;
}
