package Ex1;

public class Execute {
	
	public static void main(String[] args) {
		setColor(257, 222, 3);
		System.out.println("eh Numero 432 = " + ehInteiro("432"));
		System.out.println("eh Numero 2a2 = " + ehInteiro("2a2"));
		System.out.println("eh Numero 2.6f = " + ehInteiro("2.6f"));
	}
	
	/*
	 * IllegalArgumentException é um tipo de erro usado pra dizer que um dado parametro de uma funcao nao eh compativel
	 * com os valores aceitos pela mesma.
	 * Como exemplo, trago uma funcao de setar cores RGB, cujos valores precisam estar entre 0-255;
	 * */
	
	public static void setColor(int red, int green, int blue) {
		try {
			if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
				throw new IllegalArgumentException();
			}
			System.out.println("Cor setada para " + red + ", " + green + ", " + blue);
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgument capturado!");
		}
	}
	
	/*
	 * NumberFormatException eh chamado quando ha um erro ao converter, ou seja, que o numero esta em formato diferente
	 * do esperado para um cast.
	 * Exemplo, uma funcao que verifica se um numero eh inteiro(ou seja, se pode fazer o cast pra inteiro).
	 * */
	
	public static boolean ehInteiro(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
	
}
