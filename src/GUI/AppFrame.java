package src.GUI;

import src.COMP_DECOMP.compressor;
import src.COMP_DECOMP.decompressor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;

    AppFrame() {
        this.setDefaultCloseOperation(3);

        compressButton = new JButton("Compress");
        compressButton.setBounds(20, 20, 150, 30);
        compressButton.addActionListener(this);

        decompressButton = new JButton("Decompress");
        decompressButton.setBounds(250, 20, 150, 30);
        decompressButton.addActionListener(this);

        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(1000, 500);
        this.getContentPane().setBackground(Color.CYAN);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==compressButton){
            JFileChooser filechooser=new JFileChooser();
            int response=filechooser.showOpenDialog(null);
            if (response==JFileChooser.APPROVE_OPTION){
                File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    compressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
        if(e.getSource()==decompressButton){
            JFileChooser filechooser=new JFileChooser();
            int response=filechooser.showOpenDialog(null);
            if (response==JFileChooser.APPROVE_OPTION){
                File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    decompressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }
}
