package fr.doranco.swing.vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

import fr.doranco.swing.entity.Adresse;
import fr.doranco.swing.enums.PosteEnum;
import fr.doranco.swing.enums.SpecialiteEnums;
import javax.swing.JButton;
import fr.doranco.swing.enums.VilleEnum;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetrePrincipale extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNom;
	private JTextField textFieldPrenom;
	private JTextField textFieldNum;
	private JTextField textFieldRue;
	private JTextField textFieldCp;
	private ButtonGroup radioButtonsGenre;

	/**
	 * Create the frame.
	 */
	public FenetrePrincipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 893);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel categorieLabel = new JLabel("Catégorie :");
		categorieLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		categorieLabel.setBounds(10, 24, 71, 23);
		contentPane.add(categorieLabel);

		// radio button group
		radioButtonsGenre = new ButtonGroup();

		JRadioButton etudiantRadioButton = new JRadioButton("Etudiant");

		etudiantRadioButton.setBounds(94, 24, 71, 23);
		radioButtonsGenre.add(etudiantRadioButton);
		contentPane.add(etudiantRadioButton);

		JRadioButton enseignantRadioButton = new JRadioButton("Enseignant");

		enseignantRadioButton.setBounds(194, 24, 86, 23);
		radioButtonsGenre.add(enseignantRadioButton);
		contentPane.add(enseignantRadioButton);

		JLabel nomLabel = new JLabel("Nom :");
		nomLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nomLabel.setBounds(10, 71, 39, 23);
		contentPane.add(nomLabel);

		textFieldNom = new JTextField();
		textFieldNom.setBounds(10, 102, 134, 30);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);

		JLabel prenomLabel = new JLabel("Prenom :");
		prenomLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		prenomLabel.setBounds(177, 71, 71, 23);
		contentPane.add(prenomLabel);

		textFieldPrenom = new JTextField();
		textFieldPrenom.setColumns(10);
		textFieldPrenom.setBounds(177, 102, 134, 30);
		contentPane.add(textFieldPrenom);

		JLabel specialiteLabel = new JLabel("Spécialité :");
		specialiteLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		specialiteLabel.setBounds(355, 71, 80, 23);
		contentPane.add(specialiteLabel);

		JComboBox comboBoxSpecialite = new JComboBox();
		comboBoxSpecialite.setBounds(355, 102, 141, 30);
		contentPane.add(comboBoxSpecialite);

		JLabel nLabel = new JLabel("N° :");
		nLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nLabel.setBounds(10, 160, 39, 23);
		contentPane.add(nLabel);

		textFieldNum = new JTextField();
		textFieldNum.setColumns(10);
		textFieldNum.setBounds(10, 194, 45, 30);
		contentPane.add(textFieldNum);

		JLabel rueLabel = new JLabel("Rue/Avenue/Bd/Impasse :");
		rueLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		rueLabel.setBounds(94, 160, 172, 23);
		contentPane.add(rueLabel);

		textFieldRue = new JTextField();
		textFieldRue.setColumns(10);
		textFieldRue.setBounds(94, 194, 234, 30);
		contentPane.add(textFieldRue);

		JLabel villeLabel = new JLabel("Ville :");
		villeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		villeLabel.setBounds(391, 160, 44, 23);
		contentPane.add(villeLabel);

		JLabel cpLabel = new JLabel("CP :");
		cpLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		cpLabel.setBounds(600, 160, 44, 23);
		contentPane.add(cpLabel);

		textFieldCp = new JTextField();
		textFieldCp.setColumns(10);
		textFieldCp.setBounds(600, 194, 157, 30);
		contentPane.add(textFieldCp);

		JButton initialiserButton = new JButton("Initialiser");
		initialiserButton.setBounds(10, 246, 102, 35);
		contentPane.add(initialiserButton);

		JButton ajouterButton = new JButton("Ajouter");
	
		ajouterButton.setBounds(146, 246, 102, 35);
		contentPane.add(ajouterButton);

		JComboBox comboBoxVille = new JComboBox();
		comboBoxVille.addItem("");
		for (VilleEnum element : VilleEnum.values()) {
			comboBoxVille.addItem(element.getValue());
		}
		comboBoxVille.setBounds(391, 194, 141, 30);
		contentPane.add(comboBoxVille);

		// les evenements
		etudiantRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				specialiteLabel.setText("Specialité :");
				comboBoxSpecialite.removeAllItems();
				comboBoxSpecialite.addItem("");
				for (SpecialiteEnums element : SpecialiteEnums.values()) {
					comboBoxSpecialite.addItem(element.getValue());
				}

			}
		});
		enseignantRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				specialiteLabel.setText("Poste :");
				comboBoxSpecialite.removeAllItems();
				comboBoxSpecialite.addItem("");
				for (PosteEnum element : PosteEnum.values()) {
					comboBoxSpecialite.addItem(element.getValue());
				}
			}
		});
		ajouterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//verifier si tt les champs sont remplis
				if (textFieldNom.getText().equals("") || textFieldPrenom.getText().equals("")
						|| textFieldNum.getText().equals("") || textFieldRue.getText().equals("")
						|| textFieldCp.getText().equals("") || comboBoxSpecialite.getSelectedItem()!=null
						|| comboBoxVille.getSelectedItem()!=null) {
					JOptionPane.showMessageDialog(null, "les champs sont obligatoires", "Erreur de saisie",
							JOptionPane.ERROR_MESSAGE);
				} 
				//Ajouter un etudiant ou bien un enseignant
				if(etudiantRadioButton.isSelected()) {
					Adresse adresse= new Adresse(numer, rue, ville, cp);
				}
			}
		});

	}
}
