package fr.doranco.swing.main;

import java.awt.EventQueue;

import fr.doranco.swing.vue.FenetrePrincipale;

public class Applications {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
