import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class JTriangle {

    public JTriangle() {

    }

    public JPanel getJTriangulo(int cateto_adyacente, int cateto_opuesto) {
        int xPoly[] = {0, 0, cateto_opuesto};
        int yPoly[] = {0, cateto_adyacente, cateto_adyacente};

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);


        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.drawPolygon(poly);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }
        };

        return p;
    }

    public JPanel getJTrianguloEscaleno(int cateto_adyacente, int cateto_opuesto, int hipotenusa) {
        int xPoly[] = {0, 0, cateto_opuesto};
        int yPoly[] = {0, cateto_adyacente, hipotenusa};

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.drawPolygon(poly);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }
        };

        return p;
    }
}