package media.executavel;

import javax.swing.JOptionPane;

public class ProjetoMediaEscolar {

	public static void main(String[] args) {

		System.out.println("Programa Média Escolar");

		String prova1 = JOptionPane.showInputDialog("Digite a nota da prova 1: ");
		String prova2 = JOptionPane.showInputDialog("Digite a nota da prova 2: ");
		String trabalho = JOptionPane.showInputDialog("Digite a nota do Trabalho: ");

		double nota1 = Double.parseDouble(prova1);
		double nota2 = Double.parseDouble(prova2);
		double trab = Double.parseDouble(trabalho);

		System.out.println("A nota da Prova 1 é: " + nota1);
		System.out.println("A nota da Prova 2 é: " + nota2);
		System.out.println("A nota do Trabalho é: " + trab);

		double media = (nota1 + nota2 + trab) / 3;

		if (media >= 7) {
			System.out.println("Você está APROVADO");
			JOptionPane.showMessageDialog(null, "Você está APROVADO");
		} else if (media >= 5 && media < 7) {
			int pergunta = JOptionPane.showConfirmDialog(null, "você fez a PROVA DE RECUPERAÇÂO?");
			if (pergunta == 0) {
				String notaRec = JOptionPane.showInputDialog("Nota da RECUPERAÇÃO:");
				double recupera = Double.parseDouble(notaRec);
				System.out.println("Nota da Recuperação: " + recupera);
				double notaFinal = (nota1 + nota2 + trab + recupera) / 4;
				if (notaFinal >= 6) {
					System.out.println("Aprovado no Conselho de Professores");
					JOptionPane.showMessageDialog(null, "Você está APROVADO");
				} else {
					System.out.println("Reprovado");
					JOptionPane.showMessageDialog(null, "Você está REPROVADO");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Você está REPROVADO");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Você está REPROVADO");
		}
		System.out.println("Fim do Programa");
	}

}
