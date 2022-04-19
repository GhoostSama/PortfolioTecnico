package autoria2;

import javax.swing.JOptionPane;


public class Autoria2 {

    public static void main(String[] args) {
        
        String s = JOptionPane.showInputDialog("Diga-me seu nome!");
        JOptionPane.showMessageDialog(null, "Olá "+s + " tudo bom?");
        String a = JOptionPane.showInputDialog("Agora diga-me sua idade!");
        int i = Integer.parseInt(a);
        JOptionPane.showMessageDialog(null, "então a idade de " + s + " é " + i);
        

    }
    
}
