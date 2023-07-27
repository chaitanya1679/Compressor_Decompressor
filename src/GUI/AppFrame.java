package src.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;
    AppFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compressButton=new JButton("Compress");
        compressButton.setBounds(20,100,200,30);
        decompressButton=new JButton("Decompress");
        decompressButton.setBounds(250,200,200,30);
        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(100,500);
        this.getContentPane().setBackground(Color.CYAN);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e){

    }
}
