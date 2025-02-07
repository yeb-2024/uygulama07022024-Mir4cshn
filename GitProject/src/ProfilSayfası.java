import javax.swing.*;
import java.awt.*;

public class ProfilSayfası {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel resim = new JLabel();

    public ProfilSayfası(){
        label.setText("İsim : Miraç Şahin");
        label.setFont(new Font(null, Font.PLAIN, 25));

        ImageIcon icon = new ImageIcon("Ekmek.png");

        resim = new JLabel(icon);

        frame.add(resim);
        frame.add(label);



        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profil Sayfası");
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }
}
