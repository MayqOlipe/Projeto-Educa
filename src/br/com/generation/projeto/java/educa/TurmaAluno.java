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
		System.out.println("Digite o Ciclo: ");
        ciclo = leia.nextLine();
        
        JOptionPane.showMessageDialog(null,"Qual o Nome da Turma?");
        System.out.println("Digite a Turma: ");
        turma = leia.nextLine();
		
		JOptionPane.showMessageDialog(null, "Quantos alunos você deseja inserir? ");
		System.out.println("\nDigite aqui a quantidade de alunos: ");

		int numeroAlunos = leia.nextInt();
				
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("\nDigite o nome do " + (i+1) + "º Aluno: ");
			String nome = leia.next();
			leia.nextLine();
						
			System.out.println("Digite o endereço do Aluno: ");
			String endereco = leia.next();
			leia.nextLine();
						
			System.out.println("O aluno entregou a atividade? ");
			String entregaAtividade = leia.next();
			leia.nextLine();
			
			System.out.println("Observações: ");
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
