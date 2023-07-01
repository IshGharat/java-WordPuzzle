import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PicturePuzzle extends JFrame implements ActionListener{

    ArrayList<Icon> allImages =new ArrayList<Icon>();
    ArrayList<JButton> allButtons =new ArrayList<JButton>();
    JPanel panel;
    boolean firstClick=false;
    JButton button1,button2;

    public PicturePuzzle(){
        super("Coderunner Picture Puzzle");
        storeImages();
        init();
    }

    public void init(){
        panel =new JPanel();
        panel.setLayout(new GridLayout(3,3,1,1));
        getContentPane().add(panel,BorderLayout.CENTER);
        createButtons();

        JButton reset=new JButton("Reset");
        getContentPane().add(reset,BorderLayout.SOUTH);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                allButtons.clear();
                getContentPane().removeAll();
                init();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    public void storeImages(){
        for(int i=9;i>=0;i--){
            Icon ic=new ImageIcon("Images/"+i+".jpg");
            allImages.add(ic);
        }
    }

    public void createButtons(){
        for(int i=0;i<9;i++){
            JButton btn=new JButton(resizeImages(allImages.get(i)));
            ((ImageIcon) btn.getIcon()).setDescription(String.valueOf(i));
            btn.setPreferredSize(new Dimension(200, 200));
            btn.addActionListener(this);
            allButtons.add(btn);
        }
        Collections.shuffle(allButtons);
         for(int j=0;j<9;j++){
            panel.add(allButtons.get(j));
         }
    }
    public Icon resizeImages(Icon input){
        ImageIcon img=new ImageIcon(((ImageIcon)input).getImage().getScaledInstance(200, 200, DO_NOTHING_ON_CLOSE));
        return img;
    }

    public static void main(String[] args) {
        new PicturePuzzle();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!firstClick){
            firstClick=true;
            button1=(JButton)e.getSource();
        }else {
            firstClick=false;
            button2=(JButton)e.getSource();
            if(button2 != button1){
                swap();
            }
            boolean result =checkWin();
            if(result){
                JOptionPane.showMessageDialog(this,"Great job!!! You WON","Congratulations!!",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    public void swap(){
        Icon ic1=button1.getIcon();
        Icon ic2=button2.getIcon();
        button1.setIcon(ic2);
        button2.setIcon(ic1);
    }
    public boolean checkWin(){
        boolean win=true;
        for(int i=0;i<9;i++){
            if(!((ImageIcon) allButtons.get(i).getIcon()).getDescription().equals(String.valueOf(i))){
                win=false;
                break;
            }
        }
        return win;
    }
}