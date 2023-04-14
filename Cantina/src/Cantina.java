import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Cantina {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = JOptionPane.showInputDialog("Infome o nome do Cliente");

        Massa massa = new Massa();
        massa.tipo = JOptionPane.showInputDialog("Informe o tipo da Massa");
        massa.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Massa"));
        Pedido pedido = new Pedido();



        Ingrediente ingredientes = new Ingrediente();

        int opcao = 0;
        while (opcao!=5) {
            opcao = JOptionPane.showInputDialog("Informe os ingredientes escolhidos:"
                    + "\n1-Bacon\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Sair");
            if(opcao == 1){
                 ingredientes.nome= "Bacon";

            }



        }
    }
}