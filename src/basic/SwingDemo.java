package basic;
import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {
        // 1. 建立視窗
        JFrame frame = new JFrame("我的第一個 Java GUI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. 建立組件
        JButton button = new JButton("點擊我");
        JLabel label = new JLabel("點擊次數：0");

        // 3. 事件監聽 (當按鈕被按下時)
        final int[] count = {0};
        button.addActionListener(e -> {
            count[0]++;
            label.setText("點擊次數：" + count[0]);
        });

        // 4. 配置版面
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        // 5. 顯示視窗
        frame.setVisible(true);
    }
}
