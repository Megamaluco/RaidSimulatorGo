import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.NumberFormatter;

import battle.RaidBattleBruteForce;

public class WindowGo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WindowGo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		// Font to be used
		Font font = new Font("Dialog", Font.PLAIN, 20);
		Font fontSmall = new Font("Dialog", Font.PLAIN, 10);
		// Define Components

		// Label Id Boss Pokemon
		JLabel labelIdBoss = new JLabel("Raid Boss ID:");
		labelIdBoss.setFont(font);
		add(labelIdBoss);

		// Pokemon Image
		JLabel picPokemonBoss = new JLabel(getImage(1));
		add(picPokemonBoss);

		// Input ID Pokemon
		NumberFormatter nf = new NumberFormatter();
		nf.setMinimum(new Integer(1));
		JFormattedTextField inputPokemonIdBoss = new JFormattedTextField(nf);
		inputPokemonIdBoss.setValue(new Integer(1));
		inputPokemonIdBoss.setEditable(true);
		inputPokemonIdBoss.setFont(font);
		Dimension pokemonIdSize = new Dimension(50, 30);
		inputPokemonIdBoss.setPreferredSize(pokemonIdSize);

		// Alterar automaticamente a imagem do Boss
		inputPokemonIdBoss.getDocument().addDocumentListener(new EditBossIdListener(picPokemonBoss));
		add(inputPokemonIdBoss);

		// Label Id Pokemon To Fight
		JLabel labelIdPokemonToUse = new JLabel("Pokemon To Use ID:");
		labelIdPokemonToUse.setFont(font);
		add(labelIdPokemonToUse);

		// Label Id Pokemon To Fight Note
		JLabel labelIdPokemonToUseNote = new JLabel("(0 = Use All)");
		labelIdPokemonToUseNote.setFont(fontSmall);
		add(labelIdPokemonToUseNote);

		// Pokemon To Use Image
		JLabel picPokemonToUse = new JLabel(getImage(0));
		add(picPokemonToUse);

		// Input ID Pokemon
		nf = new NumberFormatter();
		nf.setMinimum(new Integer(0));
		JFormattedTextField inputPokemonIdToUse = new JFormattedTextField(nf);
		inputPokemonIdToUse.setValue(new Integer(0));
		inputPokemonIdToUse.setEditable(true);
		inputPokemonIdToUse.setFont(font);
		pokemonIdSize = new Dimension(50, 30);
		inputPokemonIdToUse.setPreferredSize(pokemonIdSize);

		// Alterar automaticamente a imagem do Boss
		inputPokemonIdToUse.getDocument().addDocumentListener(new EditBossIdListener(picPokemonToUse));
		add(inputPokemonIdToUse);

		// Label Number of Participants
		JLabel labelParticipants = new JLabel("Max Number of Participants:");
		labelParticipants.setFont(font);
		add(labelParticipants);
		
		// Input Number of Participants
		nf = new NumberFormatter();
		nf.setMinimum(new Integer(1));
		nf.setMaximum(new Integer(20));
		JFormattedTextField inputParticipants = new JFormattedTextField(nf);
		inputParticipants.setValue(new Integer(1));
		inputParticipants.setEditable(true);
		inputParticipants.setFont(font);
		pokemonIdSize = new Dimension(50, 30);
		inputParticipants.setPreferredSize(pokemonIdSize);
		add(inputParticipants);

		// Label Error Simulate
		JLabel labelError = new JLabel("");
		labelError.setFont(font);
		labelError.setPreferredSize(new Dimension(400, 20));
		add(labelError);

		// Button Simulate

		JButton simutaleButton = new JButton("Simulate");
		simutaleButton.addActionListener(new SimulateButtonClick(labelError, inputPokemonIdBoss,inputPokemonIdToUse,inputParticipants));

		add(simutaleButton);

		// Define Position of Components
		Insets insets = getInsets();

		// Label Id Boss
		Dimension size = labelIdBoss.getPreferredSize();
		labelIdBoss.setBounds(25 + insets.left, 5 + insets.top, size.width, size.height);

		// Input Id Boss
		size = inputPokemonIdBoss.getPreferredSize();
		inputPokemonIdBoss.setBounds(150 + insets.left, 5 + insets.top, size.width, size.height);

		// Image Pokemmon Boss
		size = picPokemonBoss.getPreferredSize();
		picPokemonBoss.setBounds(25 + insets.left, 50 + insets.top, size.width, size.height);

		// Label Id Pokemon To Use
		size = labelIdPokemonToUse.getPreferredSize();
		labelIdPokemonToUse.setBounds(300 + insets.left, 5 + insets.top, size.width, size.height);

		// Label Id Pokemon To Use Note
		size = labelIdPokemonToUseNote.getPreferredSize();
		labelIdPokemonToUseNote.setBounds(300 + insets.left, 30 + insets.top, size.width, size.height);

		// Input Id Pokemon To Use
		size = inputPokemonIdToUse.getPreferredSize();
		inputPokemonIdToUse.setBounds(490 + insets.left, 5 + insets.top, size.width, size.height);

		// Image Pokemmon Pokemon To Use
		size = picPokemonToUse.getPreferredSize();
		picPokemonToUse.setBounds(300 + insets.left, 50 + insets.top, size.width, size.height);

		// Label Participants
		size = labelParticipants.getPreferredSize();
		labelParticipants.setBounds(600 + insets.left, 5 + insets.top, size.width, size.height);
		
		// Input Participants
		size = inputParticipants.getPreferredSize();
		inputParticipants.setBounds(850 + insets.left, 5 + insets.top, size.width, size.height);
		
		// Button Simulate
		size = simutaleButton.getPreferredSize();
		simutaleButton.setBounds(25 + insets.left, 300 + insets.top, size.width, size.height);

		// Label Error
		size = labelError.getPreferredSize();
		labelError.setBounds(200 + insets.left, 300 + insets.top, size.width, size.height);

		setSize(950 + insets.left + insets.right, 500 + insets.top + insets.bottom);

		setTitle("Raid Simulator Go");
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WindowGo wg = new WindowGo();

	}

	private ImageIcon getImage(int id) {

		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("img/" + id + ".png"));
		} catch (IOException e) {
			try {
				myPicture = ImageIO.read(new File("img/NoImageFound.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		return new ImageIcon(myPicture);
	}

	private class EditBossIdListener implements DocumentListener {

		JLabel picPokemon;

		public EditBossIdListener(JLabel picPokemon) {
			super();
			this.picPokemon = picPokemon;
		}

		@Override
		public void changedUpdate(DocumentEvent arg0) {

			UpdateImage(arg0);
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {

			UpdateImage(arg0);
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {

			UpdateImage(arg0);
		}

		private void UpdateImage(DocumentEvent arg0) {

			try {
				String idPokemon = arg0.getDocument().getText(0, arg0.getDocument().getLength());
				int i = Integer.parseInt(idPokemon);
				picPokemon.setIcon(getImage(i));

			} catch (BadLocationException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {

			}
		}
	}

	private class SimulateButtonClick implements ActionListener {

		JLabel labelError;
		JFormattedTextField pokemonBossId;
		JFormattedTextField pokemonToUseId;
		JFormattedTextField numberOfParticipants;
		public SimulateButtonClick(JLabel labelError, JFormattedTextField pokemonBossId, JFormattedTextField pokemonToUseId, JFormattedTextField numberOfParticipants) {
			super();
			this.labelError = labelError;
			this.pokemonBossId = pokemonBossId;
			this.pokemonToUseId = pokemonToUseId;
			this.numberOfParticipants = numberOfParticipants;
		}

		public void actionPerformed(ActionEvent e) {

			try {
				labelError.setText("");
				String idPokemon = pokemonBossId.getText();
				int i = Integer.parseInt(idPokemon);
				RaidBattleBruteForce bruteForce = new RaidBattleBruteForce(i);
				if (!bruteForce.raidBossFound()) {
					labelError.setText("Invalid Raid Boss");
					return;
				}
				boolean pokemonToUseFound = bruteForce.setPokemonToUseId(Integer.parseInt(pokemonToUseId.getText()));
				if (!pokemonToUseFound) {
					labelError.setText("Invalid Pokemon To Use ID");
					return;
				}
				bruteForce.setMaxParticipants(Integer.parseInt(numberOfParticipants.getText()));
				String result = bruteForce.doBattle();

			} catch (NumberFormatException e1) {
				labelError.setText("Invalid Raid Boss");
			}

		}
	}
}
