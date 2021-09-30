import javax.swing.JOptionPane;

public class CadastroClientes {
    public static void main(String[] args) {
        
        //vetor
        String[] clientes = new String[10];

        //contador
        int contador = 0;

        //Laço
        do{
            clientes[contador] = JOptionPane.showInputDialog(null, "Informe o nome do cliente.");

            int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if( continuar==0){
                contador++;
            }else{
                contador = 10;
            }
        }while(contador <10);

        //Listar Clientes
        String mensagem = "Clientes cadastrados: \n";
        for( int i=0; i<clientes.length; i++){
            if (clientes[i] != null){
                mensagem += clientes [i] + "\n";

            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
