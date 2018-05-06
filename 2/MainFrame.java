import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JLabel jlb1=new JLabel("攝氏:");//建立標籤
    private JButton jbtncount =new JButton("=");//設置一個計算紐
    private JButton jbtnexit=new JButton("EXIT");//設置一個關閉視窗按鈕
    private JTextField jtfimput=new JTextField();//設置一個輸入的框
    private JLabel jlb2=new JLabel("華氏:" );//輸出答案

    public MainFrame(){
        variant();
    }

    private void variant(){
        this.setDefaultCloseOperation(3);//設定關閉視窗的按鈕
        this.setLayout(null);//設置布局為空
        this.setBounds(100,100,700,500);//設置介面大小

        jlb1.setBounds(50,50,150,40);
        this.add(jlb1);

        jtfimput.setBounds(100,50,150,40);//設置輸入框大小(x,y,width,height)
        this.add(jtfimput);//把按鈕顯示上去

        jbtncount.setBounds(250,50,150,40);
        jbtncount.setBorder(BorderFactory.createRaisedBevelBorder());//按鈕特殊效果
        this.add(jbtncount);

        jlb2.setBounds(450,50,150,40);
        this.add(jlb2);

        jbtnexit.setBounds(250,150,150,40);
        jbtnexit.setBorder(BorderFactory.createRaisedBevelBorder());
        this.add(jbtnexit);

        //---------------------------程式設計----------------------------//

        jbtncount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb2.setText("華氏:"+Double.toString((Double.parseDouble(jtfimput.getText()) + 40) * 1.8 - 40));
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
