package problem3;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sketch {

    public static void main(String[] args) {
        // 创建相框
        JFrame jFrame = new JFrame();
        // 创建画板
        JPanel jpanel = new JPanel() {

            // 重写paint方法
            @Override
            public void paint(Graphics graphics) {
                // 必须先调用父类的paint方法
                super.paint(graphics);
                graphics.drawOval(100, 70, 30, 30);
                graphics.drawRect(105, 100, 20, 30);
                graphics.drawLine(105, 100, 200, 120);
                char text[]= {'a','a','a','a','a'};
                graphics.drawChars(text, 0, 5, 100, 50);
                for(int i=0;i<=10;i++) {
                		graphics.drawRect(100+10*i,100+9*i, 12, 12);
                }

            }
        };
        jFrame.add(jpanel);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}