/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_12;

import java.awt.Frame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class chapter_12_2 {
    public static void main(String args[]) {
        String images_filepath[] = {
                "D:\\JAVA\\experiment\\src\\chapter_12\\1.jpg",
                "D:\\JAVA\\experiment\\src\\chapter_12\\2.jpg",
                "D:\\JAVA\\experiment\\src\\chapter_12\\3.jpg",
        };
        ImageComponet images[] = new ImageComponet[images_filepath.length];
        for(int i=0;i<images_filepath.length;i++){
            images[i] = new ImageComponet(new ImageIcon(images_filepath[i]).getImage());
        }

        Frame frame = new Frame("Hello GUI");

        ImageSwiper swiper = new ImageSwiper(images, frame);
        JPanel buttonPanel = new JPanel();
        ClickButton btn_1 = new ClickButton("暂停播放图片", "开始播放图片");
        ClickButton btn_2 = new ClickButton("暂停播放音乐", "开始播放音乐");

        btn_1.setBounds(100, 100, 30, 20);
        btn_2.setBounds(140, 100, 30, 20);

        buttonPanel.add(btn_1);
        buttonPanel.add(btn_2);
        buttonPanel.setOpaque(false);

        frame.add(buttonPanel);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setResizable(true);

        new Thread(swiper).start();
    }
}

class ImageSwiper implements Runnable{
    private ImageComponet imagecomponents[];
    private Frame frame;
    private int currentImageIndex = 0;

    public ImageSwiper(ImageComponet images[], Frame frame){
        this.imagecomponents = images;
        this.frame = frame;
        this.frame.add(imagecomponents[currentImageIndex]);
    }

    public void run(){
        while(true){
            try{
                this.frame.remove(imagecomponents[currentImageIndex]);

                currentImageIndex++;
                currentImageIndex %= imagecomponents.length;

                this.frame.add(imagecomponents[currentImageIndex]);
                this.frame.repaint();
                System.out.println("runing...");
                Thread.sleep(5000);
            }
            catch (Exception e){
                System.out.println(e.getStackTrace());
            }
        }
    }
}

class ImageComponet extends JComponent{
    private Graphics g;
    private Image image;

    public ImageComponet(String filename){
        image = new ImageIcon(filename).getImage();
    }

    public ImageComponet(Image image){
        this.image = image;
    }

    public void paintComponent(Graphics g){
        g.drawImage(image, 0, 0, null);
        this.g = g;
    }

    public void setImage(Image image){
        this.image = image;
        this.g.drawImage(this.image, 0, 0, null);
    }
}

class ClickButton extends JButton{
    private String repl;

    class ClickAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String t = e.getActionCommand();
            setLabel(repl);
            repl = t;
            System.out.println("click...");
        }
    }

    public ClickButton(String default_, String repl){
        super(default_, null);
        this.repl = repl;
        this.addActionListener(new ClickAction());
    }
}


