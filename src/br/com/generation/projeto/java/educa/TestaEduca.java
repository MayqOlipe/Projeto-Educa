package br.com.generation.projeto.java.educa;

public class TestaEduca {

    public static void main(String[] args) {
        
        Login log = new Login();
        Menu men = new Menu();
                       
        men.bemvindo();
        log.login();
        men.opcoes();                    
    }    
}