package main.java.eg.edu.guc.yugioh.gui.boardframe;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;

import eg.edu.guc.yugioh.gui.boardframe.FieldPanel;
import main.java.eg.edu.guc.yugioh.configsGlobais.Logger;

import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class BoardFrameHelper extends JFrame {
    
    public BoardFrameHelper(){

	}

    public JPanel addPanels(HandPanel opponentHandPanel, FieldPanel fieldPanel, HandPanel activeHandPanel, EastButtonsPanel eastButtonsPanel, WestImagesPanel westImagesPanel, BorderLayout){
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
		
		return dataPanel;
	}

	public void updateBoardFrame(HandPanel activeHandPanel, HandPanel opponentHandPanel, FieldPanel fieldPanel) {

		Logger.startLogs().info("BoardFrame - updateBoardFrame");

		activeHandPanel.updateHand();
		opponentHandPanel.updateHand();
		fieldPanel.getActivePlayerPanel().getDeckGraveyardPanel().getDeck().updateDeck();
		fieldPanel.getOpponentPlayerPanel().getDeckGraveyardPanel().getDeck().updateDeck();
		fieldPanel.getActivePlayerPanel().getDeckGraveyardPanel().getGraveyard().updateGraveyard();
		fieldPanel.getOpponentPlayerPanel().getDeckGraveyardPanel().getGraveyard().updateGraveyard();
		fieldPanel.getActivePlayerPanel().getMonsterSpellPanel().getMonstersGrid().updateMonstersArea();
		fieldPanel.getOpponentPlayerPanel().getMonsterSpellPanel().getMonstersGrid().updateMonstersArea();
		fieldPanel.getActivePlayerPanel().getMonsterSpellPanel().getSpellsGrid().updateSpellsArea();
		fieldPanel.getOpponentPlayerPanel().getMonsterSpellPanel().getSpellsGrid().updateSpellsArea();
		fieldPanel.getActivePlayerPanel().getPlayerNamePanel().updateLifePoints();
		fieldPanel.getOpponentPlayerPanel().getPlayerNamePanel().updateLifePoints();
		//repaint();
		//validate();

	}
}
