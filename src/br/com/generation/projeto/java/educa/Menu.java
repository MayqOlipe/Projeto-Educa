package br.com.generation.projeto.java.educa;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
	void bemvindo() {
		
		JOptionPane.showMessageDialog(null,"              BEM-VINDO" + "\n                     AO " + "\n                 EDUCA");   
}


public void opcoes() {
    Scanner scan = new Scanner(System.in);
    TurmaAluno t = new TurmaAluno();
    AlunosMargarida al = new AlunosMargarida();
    
    while(true) {
        
    	JOptionPane.showMessageDialog(null, "O que você deseja fazer? " + "\n1 - Criar Turma " + "\n2 - Ver Turmas" + "\n3 - Sair");
        
        
    	int opcao = scan.nextInt();
        switch(opcao) {
        
        case 1:
            t.turmaAlunos();
            break;
            
        case 2:
            al.saudar();
            al.apresentarAluno1();
            al.apresentarAluno2();
            al.apresentarAluno3();
            break;
        
        case 3:
        	JOptionPane.showMessageDialog(null, "   Programa Encerrado... \nObrigado por usar o Educa!");
        	scan.close();
            System.exit(0);
        default:
        	JOptionPane.showMessageDialog(null,"   Opção Inválida. \nTente Novamente");
        	//System.out.println("\nOpção Inválida");
           // System.out.println("\nTente Novamente");
            System.out.println();
            break;
            
        }    
    }
}


}