package main.java.eg.edu.guc.yugioh.gui.boardframe;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class BoardFrameHelper extends JFrame {
    
    public BoardFrameHelper(){}

    public void addPanels(opponentHandPanel, fieldPanel, activeHandPanel, eastButtonsPanel, westImagesPanel, BorderLayout){
		setContentPane(new JLabel(new ImageIcon("images/background.jpg")));
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new BorderLayout());
		dataPanel.setOpaque(false);
		dataPanel.setSize(1366,768);
		dataPanel.add(opponentHandPanel,BorderLayout.NORTH);
		dataPanel.add(fieldPanel, BorderLayout.CENTER);
		dataPanel.add(activeHandPanel,BorderLayout.SOUTH);
		dataPanel.add(eastButtonsPanel,BorderLayout.EAST);
		dataPanel.add(westImagesPanel,BorderLayout.WEST);
		add(dataPanel);
	}
}
