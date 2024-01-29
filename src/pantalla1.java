import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pantalla1 extends JDialog {
    private JTextField nombre;
    private JTextField email;
    private JTextField telefono;
    private JTextField direccion;
    private JButton registro;
    private JButton cancelar;
    private JPasswordField contraseña1;
    private JPasswordField contraseña2;
    private JPanel panelregistro;

    public pantalla1(JFrame parent){
        super(parent);
        setTitle("Crear una nueva cuenta");
        setContentPane(panelregistro);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
        add(cancelar);
    }
}
