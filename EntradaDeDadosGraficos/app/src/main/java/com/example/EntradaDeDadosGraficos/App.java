package com.example.EntradaDeDadosGraficos;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        //Entrada de Dados com o JOptionPane
        
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a"
                + " idade da pessoa"));
        System.out.println("A pessoa tem "+ idade + " anos de idade");
        JOptionPane.showMessageDialog(null,"A pessoa tem "+ idade + " anos de idade");
        JOptionPane.showMessageDialog(null,"Teste","Atenção!!",1);
    }
}
