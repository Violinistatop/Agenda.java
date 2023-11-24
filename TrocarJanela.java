import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrocarJanela extends JFrame {
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public TrocarJanela() {
        setTitle("Trocar janela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        // Criação dos painéis
        JPanel painel1 = new JPanel();
        painel1.setBackground(Color.LIGHT_GRAY);
        painel1.add(new JLabel("Janela 1"));

        JPanel painel2 = new JPanel();
        painel2.setBackground(Color.WHITE);
        painel2.add(new JLabel("Janela 2"));

        // Configuração do CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.add(painel1, "Janela 1");
        cardPanel.add(painel2, "Janela 2");

        // Adiciona o cardPanel ao JFrame
        add(cardPanel, BorderLayout.CENTER);

        // Criação do botão para alternar entre as janelas
        JButton botaoTrocar = new JButton("Trocar Janela");
        botaoTrocar.setBackground(Color.CYAN);
        botaoTrocar.setForeground(Color.BLACK);
        //botaoTrocar.setIcon(new ImageIcon("OIP.JFIF"));
        

        botaoTrocar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        // Adiciona o botão ao JFrame
        add(botaoTrocar, BorderLayout.SOUTH);
    }

    public static void main(String args[]) {
        TrocarJanela tj = new TrocarJanela();
        tj.setVisible(true);
    }
}

