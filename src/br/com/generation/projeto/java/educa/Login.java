package br.com.generation.projeto.java.educa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login {

	    Scanner scan = new Scanner(System.in);
	    String usuario, senha;
	    int tentativas = 0;
	    	    
	    public void login() {
	    	JOptionPane.showMessageDialog(null, "Digite abaixo as suas informações de login:");
	        	        	        
	        while(tentativas <= 2) {
	            System.out.println("Usuário: ");
	            usuario = scan.next();
	            System.out.println("Senha: ");
	            senha = scan.next();
	            
	            if(usuario.equals("Mayquel") && senha.equals("123456")) {
	                tentativas = 3;
	                JOptionPane.showMessageDialog(null, "   Bem-Vindo " + usuario);
	                System.out.println("Digite aqui a sua opção: ");
	            }
	            else {
	            	JOptionPane.showMessageDialog(null, "   Usuario ou senha incorretos. " );
	                tentativas++;
	                if(tentativas == 3) {
	                	JOptionPane.showMessageDialog(null, "Numero de tentativas esgotadas!" + "\n   Finalizando Programa..." );
	                    System.exit(0);    
	                }
	            }
	        }
	    }
	}	