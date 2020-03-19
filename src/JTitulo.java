import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JTitulo extends JLabel {
    File montserratbold = new File("src/assets/Montserrat-Bold.ttf");
    Font fontbold = Font.createFont(Font.TRUETYPE_FONT, montserratbold);
    Font sizedFontBold = fontbold.deriveFont(14f);

    JTitulo(String text) throws IOException, FontFormatException {
        this.setText(text);
        this.setFont(sizedFontBold);
    }
}
