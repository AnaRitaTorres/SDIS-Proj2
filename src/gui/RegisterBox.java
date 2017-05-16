package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rita on 12-05-2017.
 */
public class RegisterBox extends JFrame {

    private JTextField usernameField;
    private JTextField nameField;
    private JPasswordField passwordField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel nameLabel;
    private JButton registerButton;
    private JButton cancelButton;


    public RegisterBox() throws HeadlessException {

        super("Register");

        setSize(300,150);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        JPanel buttons = new JPanel();

        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        nameLabel = new JLabel("Name:");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(nameLabel,cs);

        nameField = new JTextField(15);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(nameField,cs);

        usernameLabel = new JLabel("Username:");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(usernameLabel,cs);

        usernameField = new JTextField(15);
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(usernameField,cs);

        passwordLabel = new JLabel("Password:");
        cs.gridx = 0;
        cs.gridy = 2;
        cs.gridwidth = 1;
        panel.add(passwordLabel,cs);

        passwordField = new JPasswordField(15);
        cs.gridx = 1;
        cs.gridy = 2;
        cs.gridwidth = 2;
        panel.add(passwordField,cs);

        registerButton = new JButton("Register");
        cs.gridx=1;
        cs.gridy=3;
        cs.gridwidth = 1;
        buttons.add(registerButton,cs);

        registerButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        dispose();
                        HomeBox h = new HomeBox();
                        h.setVisible(true);
                    }
                }
        );

        cancelButton = new JButton("Cancel");
        cs.gridx=1;
        cs.gridy=5;
        cs.gridwidth = 1;
        buttons.add(cancelButton,cs);

        cancelButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        dispose();
                        StartBox s = new StartBox();
                        s.setVisible(true);
                    }
                }
        );

        add(panel,BorderLayout.CENTER);
        add(buttons,BorderLayout.PAGE_END);

        setVisible(true);

    }

    public static void main(String[] args){

        RegisterBox r = new RegisterBox();
    }

}