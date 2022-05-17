import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class SimpleGUI implements ActionListener {
    private ArrayList<GameType> list;

    public SimpleGUI() {
        list = new ArrayList<>();

        setupGui();
        load();
    }

    private void setupGui() {
        ImageIcon image = new ImageIcon("src/hypixel.jpg");
        Image imageData = image.getImage();
        Image scaledImage = imageData.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImage);
    }

    public void load(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
