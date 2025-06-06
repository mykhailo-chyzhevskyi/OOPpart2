import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Розрахунок максимальної висоти польоту");
        frame.setSize(420, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // Центрування вікна

        JLabel v0Label = new JLabel("Початкова швидкість v₀ (м/с):");
        v0Label.setBounds(20, 20, 200, 25);
        frame.add(v0Label);

        JTextField v0Field = new JTextField();
        v0Field.setBounds(230, 20, 150, 25);
        frame.add(v0Field);

        JLabel angleLabel = new JLabel("Кут α (градуси):");
        angleLabel.setBounds(20, 60, 200, 25);
        frame.add(angleLabel);

        JTextField angleField = new JTextField();
        angleField.setBounds(230, 60, 150, 25);
        frame.add(angleField);

        JButton calculateButton = new JButton("Розрахувати");
        calculateButton.setBounds(130, 110, 150, 30);
        frame.add(calculateButton);

        JLabel resultLabel = new JLabel("Макс. висота hₘₐₓ: ");
        resultLabel.setBounds(20, 160, 360, 30);
        frame.add(resultLabel);

        calculateButton.addActionListener(e -> {
            try {
                double v0 = Double.parseDouble(v0Field.getText());
                double alphaDeg = Double.parseDouble(angleField.getText());
                double g = 9.81;

                if (v0 < 0 || alphaDeg < 0 || alphaDeg > 90) {
                    throw new IllegalArgumentException();
                }

                double alphaRad = Math.toRadians(alphaDeg);
                double hMax = Math.pow(v0 * Math.sin(alphaRad), 2) / (2 * g);

                resultLabel.setText(String.format("Макс. висота hₘₐₓ: %.2f м", hMax));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Помилка: введіть числові значення!");
            } catch (IllegalArgumentException ex) {
                resultLabel.setText("Помилка: значення повинні бути додатні, α — від 0 до 90°.");
            }
        });

        frame.setVisible(true);
    }
}
