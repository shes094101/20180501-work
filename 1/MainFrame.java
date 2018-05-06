import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton jbtnAdd = new JButton("-->");// 設置按鈕add
    private JButton jbtnReduce = new JButton("<--");// 設置按鈕reduce
    private JButton jbtnexit = new JButton("Exit");// 設置按鈕exit
    private JLabel jlb =new JLabel("ლ(・ω・ლ)");
    private JTextField jtf =new JTextField("10");//設置一個讓人輸入的框
    private int x = 0;//設置參數為0

    public MainFrame() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//設置關閉按鈕
        this.setLayout(null);                       //設置布局為空
        this.setLocation(100, 50);            //設置位置
        this.setSize(800, 600);     //設置大小

        jbtnAdd.setLocation(170, 60);              //將按鈕設定位置
        jbtnAdd.setSize(120, 30);  //設定按鈕大小
        this.add(jbtnAdd);                       //將按鈕設置在介面上

        jbtnReduce.setLocation(50, 60);
        jbtnReduce.setSize(120, 30);
        this.add(jbtnReduce);


        jbtnexit.setLocation(290,60);
        jbtnexit.setSize(120,30);
        this.add(jbtnexit);

        jlb.setBounds(x,200,120,30);
        this.add(jlb);

        jtf.setBounds(10,10,100,50);
        this.add(jtf);

        jbtnAdd.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                x+=Integer.parseInt(jtf.getText());
               jlb.setLocation(x,200);
               MainFrame.this.setTitle(Integer.toString(x));
            }
        });


        jbtnReduce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=Integer.parseInt(jtf.getText());
                jlb.setLocation(x,200);
                MainFrame.this.setTitle(Integer.toString(x));

            }
        });

        jbtnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        }
    }
