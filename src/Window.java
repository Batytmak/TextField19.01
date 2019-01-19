import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JButton sendButton;
    private JTextField textField1;
    private JTextPane textPanel;
    private JPanel windowPanel;
    private JTextArea textArea1;

    public Window() {
        this.setSize(800,600);
        this.setContentPane(windowPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChatController cc = new ChatController("14");
        cc.setPane(textArea1); //ОШИБКА
        cc.obnovitChat();
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = textField1.getText().toString();
                cc.dobavitSoobsch(msg);
                textField1.setText("");
                cc.obnovitChat();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
