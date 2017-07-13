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

import batle.RaidBattleBruteForce;

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
		// Define Components

		// Label Id Pokemon
		JLabel labelId = new JLabel("Raid Boss ID:");
		labelId.setFont(font);
		add(labelId);

		// Pokemon Image
		JLabel picPokemon = new JLabel(getImage(1));
		add(picPokemon);

		// Input ID Pokemon
		JFormattedTextField pokemonId = new JFormattedTextField();
		pokemonId.setValue(new Integer(1));
		pokemonId.setEditable(true);
		pokemonId.setFont(font);
		Dimension pokemonIdSize = new Dimension(50, 30);
		pokemonId.setPreferredSize(pokemonIdSize);

		// Alterar automaticamente a imagem do Pokemon
		pokemonId.getDocument().addDocumentListener(new DocumentListener() {

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
		});
		add(pokemonId);

		// Label Error Simulate
		JLabel labelError = new JLabel("");
		labelError.setFont(font);
		labelError.setPreferredSize(new Dimension(200, 20));
		add(labelError);

		// Button Simulate

		JButton simutaleButton = new JButton("Simulate");
		simutaleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					labelError.setText("");
					String idPokemon = pokemonId.getText();
					int i = Integer.parseInt(idPokemon);
					RaidBattleBruteForce bruteForce = new RaidBattleBruteForce(i);

					if (!bruteForce.raidBossFound()){
						labelError.setText("Invalid Raid Boss");
						return;
					}
						

					String result = bruteForce.doBattle();

				} catch (NumberFormatException e1) {
					labelError.setText("Invalid Raid Boss");
				}


			}
		});

		add(simutaleButton);

		// Define Position of Components
		Insets insets = getInsets();

		// Label Id
		Dimension size = labelId.getPreferredSize();
		labelId.setBounds(25 + insets.left, 5 + insets.top, size.width, size.height);


		// Input Id
		size = pokemonId.getPreferredSize();
		pokemonId.setBounds(150 + insets.left, 5 + insets.top, size.width, size.height);

		// Image Pokemmon
		size = picPokemon.getPreferredSize();
		picPokemon.setBounds(25 + insets.left, 50 + insets.top, size.width, size.height);

		// Button Simulate
		size = simutaleButton.getPreferredSize();
		simutaleButton.setBounds(25 + insets.left, 300 + insets.top, size.width, size.height);

		// Button Simulate
		size = labelError.getPreferredSize();
		labelError.setBounds(200 + insets.left, 300 + insets.top, size.width, size.height);

		setSize(700 + insets.left + insets.right, 500 + insets.top + insets.bottom);

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
			myPicture = ImageIO.read(new File("img/#" + String.format("%03d", id) + ".png"));
		} catch (IOException e) {
			try {
				myPicture = ImageIO.read(new File("img/NoImageFound.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		return new ImageIcon(myPicture);
	}

}
