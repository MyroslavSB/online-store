import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author miroslav
*/
public class Book extends Product{
    protected String author, desc, publisher, publishedDate;
    private JPanel bookPanel;
    private BufferedImage image;
    
    public Book(String title, String author, String desc, String publisher, String url, String publishedDate, double price) {
        super(title, url, price);
        this.author = author;
        this.desc = desc;
        this.publishedDate = publishedDate;
        this.publisher = publisher;
    }

    public JPanel createBookCard() throws IOException {
        bookPanel = new JPanel(new BorderLayout());
        bookPanel.setName(super.name);
        bookPanel.setBackground(new Color(255, 51, 153));
        bookPanel.setBorder(new EmptyBorder(10, 5, 10, 5));
//        bookPanel.add(bookImage(this.url), BorderLayout.WEST);
        bookPanel.add(new JLabel(name), BorderLayout.NORTH);

        return bookPanel;
    }

    public JLabel bookImage(String url) throws IOException {
        JLabel imageLabel = new JLabel();
        URL imgUrl = new URL(url);
        image = ImageIO.read(imgUrl);
        imageLabel.setIcon(new ImageIcon(image));
        return imageLabel;
    }
}
