package aomine.admin.view;

import javax.swing.JButton;

import aomine.components.layout.view.SimpleView;

public class DashboardView extends SimpleView {
  public DashboardView() {
    init();
  }

  private void init() {
    JButton btn = new JButton("Button");

    add(btn);
  }
}
