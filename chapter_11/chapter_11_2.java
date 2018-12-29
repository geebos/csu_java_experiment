/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_11;

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class chapter_11_2 extends Applet implements ActionListener{
    private JButton playClip;
    private JButton stopClip;
    //private boolean clipsPlaying;
    private AudioClip clips;
    private JLabel res;
    public void init() {
        setBackground(Color.LIGHT_GRAY);
        res =new JLabel("最炫民族风.wav");
        playClip = new JButton("播放");
        stopClip = new JButton("停止");
        setLayout(new FlowLayout());
        add(res);
        add(playClip);
        add(stopClip);

        playClip.addActionListener(this);
        stopClip.addActionListener(this);
        stopClip.setEnabled(false);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==playClip) {
            clips.play();
            stopClip.setEnabled(true);
        }
        else {
            clips.stop();
            stopClip.setEnabled(false);
        }
    }
}

