package br.com.github.rhenanrk.concorrencia;

/**
 *
 * @author rhenan
 */
public class Main {

    public static void main(String args[]) {
        
        //criacção dos paineis
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlaJogo().setVisible(true);
            }
        });
    }
}
