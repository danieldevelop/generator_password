package generator_password;

import java.util.Random;

import javax.swing.JOptionPane;

public class Generator_password {

	private static char[] generarClave(int longitud) {
		Random azar = new Random();
		char[] clave = new char[longitud];

		String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letrasMinusculas = letrasMayusculas.toLowerCase();
		String numeros = "0123456789";
		String carateresEspeciales = "!@#$%";

		String contrasenha = letrasMayusculas + letrasMinusculas + numeros + carateresEspeciales;

		for (int i = 0; i < longitud; i++) {
			clave[i] = contrasenha.charAt(azar.nextInt(contrasenha.length()));
		}
		return clave;
	}

	public static void main(String[] args) {
		Integer largoContrasenha = 15;
		String password = new String(generarClave(largoContrasenha));

		JOptionPane.showMessageDialog(null, String.format("CONTRASEÑA SEGURA: %s", password),
				"Generator of password", JOptionPane.INFORMATION_MESSAGE);
	}

}
