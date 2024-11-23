package aomine.admin.view;

import javax.swing.JLabel;

import aomine.components.layout.view.SimpleView;

public class UsersView extends SimpleView {
  public UsersView() {
    init();
  }

  private void init() {
    add(new JLabel("Users"));
  }
}
