package teste;
import javax.swing.JOptionPane;

public class TEste {

    
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Qual sua idade?");
        int i = Integer.parseInt(s);
        if (i > 17){
        JOptionPane.showMessageDialog(null, "você é maior de idade");        
        }
        else{
        JOptionPane.showMessageDialog(null, "Você não é maior de idade");
        }
    }
    
}
