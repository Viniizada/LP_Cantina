import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
public class Pedido {

    Massa massa;
    Cliente cliente;
    ArrayList<Ingrediente> ingredientes;


    public double calculaValor(){
        double Valor = massa.valor;
        Valor += ingredientes.size()*2.0;
        return Valor;
    }
}
