package br.com.generation.projeto.java.educa;

import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TurmaAluno {

	//public static void main(String[] args) {
	
		public void turmaAlunos() {
			
		Scanner leia = new Scanner(System.in);
		String ciclo, turma;
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		JOptionPane.showMessageDialog(null,"Qual o Ciclo da Turma?");
        ciclo = leia.nextLine();
        
        JOptionPane.showMessageDialog(null,"Qual o Nome da Turma?");
        turma = leia.nextLine();
		
		JOptionPane.showMessageDialog(null, "Quantos alunos voc� deseja inserir? ");
		System.out.println("\nDigite aqui a quantidade de alunos: ");

		int numeroAlunos = leia.nextInt();
				
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("\nDigite o nome do " + (i+1) + "� Aluno: ");
			String nome = leia.next();
			leia.nextLine();
						
			System.out.println("Digite o endere�o do Aluno: ");
			String endereco = leia.next();
			leia.nextLine();
						
			System.out.println("O aluno entregou a atividade? ");
			String entregaAtividade = leia.next();
			leia.nextLine();
			
			System.out.println("Observa��es: ");
			String observacoes = leia.next();
			leia.nextLine();
								
			alunos.add(new Aluno(nome, endereco, entregaAtividade, observacoes));
		}
		
		for(Aluno al : alunos) {
			System.out.println(al);
			
		leia.close();
		
		}
	}
	
}
