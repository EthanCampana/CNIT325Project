
import com.google.gson.Gson;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class MainForm extends JFrame implements ActionListener {

    private JCheckBox jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox6, jCheckBox7, jCheckBox8, jCheckBox9, jCheckBox10;
    private JPanel p2, contentPane;
    private JTextField search;
    private JScrollPane scrollPane;
    private JButton btnSearch;
    private ArrayList<JButton> results = new ArrayList<>();
    private static int SIDE_WIDTH = 200, CONTENT_WIDTH = 700, HEIGHT = 500;
    private Person p;

    public MainForm(User user) {
        
        p = user;
        initComponents();

    }

    public MainForm(Critic critic) {
        
        p = critic;
        initComponents();
        
    }

    public MainForm(Admin admin) {
        
        p = admin;
        initComponents();
        
    }
    
    
    
    
    
    public void initComponents() {
        JPanel pnlSide = new JPanel();
        pnlSide.setBorder(LineBorder.createBlackLineBorder());
        pnlSide = new JPanel();
        jCheckBox1 = new JCheckBox("Fast Food");
        jCheckBox2 = new JCheckBox("Mexican");
        jCheckBox3 = new JCheckBox("Pizza");
        jCheckBox4 = new JCheckBox("Japanese");
        jCheckBox5 = new JCheckBox("Korean");
        jCheckBox6 = new JCheckBox("Italian");
        jCheckBox7 = new JCheckBox("Desserts");
        jCheckBox8 = new JCheckBox("Coffee");
        jCheckBox9 = new JCheckBox("Chinese");
        jCheckBox10 = new JCheckBox("Grocery");

        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
                pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlSideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox1)
                                        .addComponent(jCheckBox2)
                                        .addComponent(jCheckBox3)
                                        .addComponent(jCheckBox4)
                                        .addComponent(jCheckBox5)
                                        .addComponent(jCheckBox6)
                                        .addComponent(jCheckBox7)
                                        .addComponent(jCheckBox8)
                                        .addComponent(jCheckBox9)
                                        .addComponent(jCheckBox10))
                                .addContainerGap(98, Short.MAX_VALUE))
        );
        pnlSideLayout.setVerticalGroup(
                pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlSideLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox10)
                                .addContainerGap(255, Short.MAX_VALUE))
        );

        JPanel pnlHeader = new JPanel();
        pnlHeader.setLayout(new FlowLayout());
        pnlHeader.setBackground(Color.LIGHT_GRAY);
        pnlHeader.setPreferredSize(new Dimension(SIDE_WIDTH, 70));

        JLabel lblTitle = new JLabel("Restaurants");
        search = new JTextField(35);
        btnSearch = new JButton("Search");
        btnSearch.addActionListener(this);
        lblTitle.setForeground(Color.BLACK);
        lblTitle.setPreferredSize(new Dimension(SIDE_WIDTH, 50));
        lblTitle.setFont(lblTitle.getFont().deriveFont(30.0f));

        pnlHeader.add(lblTitle);
        pnlHeader.add(search);
        pnlHeader.add(btnSearch);

        // Content Panel
        p2 = new JPanel();
//        p2.setLayout(new GridLayout(0, 1));
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setPreferredSize(new Dimension(CONTENT_WIDTH, HEIGHT));
        p2.setAutoscrolls(true);

        scrollPane = new JScrollPane(p2);
        scrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 0, 950, 800);

        contentPane = new JPanel(new BorderLayout());
        contentPane.setPreferredSize(new Dimension(950, 800));
        contentPane.add(scrollPane, BorderLayout.CENTER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
//        for (int i = 0; i < 20; i++) {
//
//            JPanel pnlResult = new JPanel();
//            pnlResult.add(new JLabel());
//            pnlResult.setLayout(new FlowLayout());
//            pnlResult.setBackground(Color.WHITE);
//            pnlResult.setPreferredSize(new Dimension(900, 180));
//            pnlResult.setBorder(new LineBorder(Color.BLACK));
//
//            p2.add(pnlResult);
//
//        }
        contentPane.add(pnlHeader, BorderLayout.NORTH);
        add(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(SIDE_WIDTH + CONTENT_WIDTH, HEIGHT);
    }

//    public static void main(String[] args) {
//
//        TestFrame f = new TestFrame();
//        f.setSize(SIDE_WIDTH + CONTENT_WIDTH, HEIGHT);
//        f.setResizable(true);
//        f.setVisible(true);
//        f.setLocationRelativeTo(null);
//
//    }
    public static Feed searchYelp(String location, String term, String categories) {

        if (categories.equals("") || categories.equals(null)) {
            categories = "restaurant,food";
        }
        if (term.equals("") || term.equals(null)) {
            term = "";
        } else {
            term = "term=" + term;
        }
        term = term.replaceAll(" ", "%20");
        System.out.println("https://api.yelp.com/v3/businesses/search?" + term + "&categories=" + categories + "&location=" + location);
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.yelp.com/v3/businesses/search?location=" + location + term + "&categories=" + categories);
        target.register((ClientRequestFilter) requestContext -> {
            requestContext.getHeaders().add("Authorization", "Bearer " + "eSUcRXu7r-KhNt-bxEn1DE4Nye4hXIdan2tQtRNQD9ritE7U-f38PnYU7RviTRar0t0TZ0bM0WuJg-9-4q_FW-ym2tVOFYNCed24Z_2OFYvOsMI_sWXBhMhbqLACXHYx");
        });
        String result = target.request(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println(result);
        Gson gson = new Gson();
        Feed feed = gson.fromJson(result, Feed.class);
        System.out.println(feed.getBusinesses().length);
        return feed;
    }

    public static void searchEventful() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://api.eventful.com/rest/events/search?app_key=wt6gmV8ShdxVJhSh&keywords=food&location=indianapolis&date=Future");
        String result = target.request(MediaType.APPLICATION_JSON).get(String.class);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btnSearch) {
            p2.removeAll();
            String categories = "";
            if (jCheckBox1.isSelected()) {
                categories += "hotdog,";
            }
            if (jCheckBox2.isSelected()) {
                categories += "mexican,";
            }
            if (jCheckBox3.isSelected()) {
                categories += "pizza,";
            }
            if (jCheckBox4.isSelected()) {
                categories += "japanese,";
            }
            if (jCheckBox5.isSelected()) {
                categories += "korean,";
            }
            if (jCheckBox6.isSelected()) {
                categories += "italian,";
            }
            if (jCheckBox7.isSelected()) {
                categories += "desserts,";
            }
            if (jCheckBox8.isSelected()) {
                categories += "coffee,";
            }
            if (jCheckBox9.isSelected()) {
                categories += "chinese,";
            }
            if (jCheckBox10.isSelected()) {
                categories += "grocery,";
            }
            if (categories.length() > 0 && categories.charAt(categories.length() - 1) == ',') {
                categories = categories.substring(0, categories.length() - 1);
            }
            Feed feed = searchYelp("47906", search.getText(), categories);
            results.clear();
            for (Restaurant r : feed.getBusinesses()) {

                ImageIcon image = new ImageIcon();
                String info = "<html><b><u>" + r.getName() + "</u></b><p style=\"padding-right: 5px;\">Rating :" + r.getRating() + "/5.0</p><br>" + r.getLocationObject().getDisplay_address()[0] + "<br>" + r.getLocationObject().getDisplay_address()[1] + "</html>";
                try {
                    if (!r.getImage_url().equals("")) {
                        URL url = new URL(r.getImage_url());
                        image = new ImageIcon(ImageIO.read(url));
                    }
                } catch (MalformedURLException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }

                JButton btnResult = new JButton();
                btnResult.setHorizontalAlignment(SwingConstants.LEFT);
                btnResult.setLayout(new GridLayout(1, 2));

                btnResult.add(new JLabel(info));
                btnResult.add(new JLabel(image));
                btnResult.setBackground(Color.WHITE);
                btnResult.setPreferredSize(new Dimension(CONTENT_WIDTH, 150));
                btnResult.setBorder(new LineBorder(Color.BLACK));
                btnResult.addActionListener(this);
                results.add(btnResult);
                p2.add(btnResult);

            }
            System.out.println(results.size());
            p2.setPreferredSize(new Dimension(CONTENT_WIDTH, (results.size() + 1) * 150));
        } else {
            for(JButton b : results) {
                if(ae.getSource() == b) {
                    if(p instanceof User) {
                        ((User)p).LeaveReview();
                    } else {
                        ((Critic)p).LeaveReview();
                    }
                }
            }
        }
        validate();
        repaint();
    }

}
