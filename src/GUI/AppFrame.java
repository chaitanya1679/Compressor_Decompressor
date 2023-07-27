package src.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;

    AppFrame() {
        this.setDefaultCloseOperation(3);
        this.compressButton = new JButton("Compress");
        this.compressButton.setBounds(20, 100, 200, 30);
        this.decompressButton = new JButton("Decompress");
        this.decompressButton.setBounds(250, 200, 200, 30);
        this.add(this.compressButton);
        this.add(this.decompressButton);
        this.setSize(100, 500);
        this.getContentPane().setBackground(Color.CYAN);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    }
}
