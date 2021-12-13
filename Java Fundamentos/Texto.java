public class Texto {
    public static void main(String[] args) {

        // variavel de texto
        String texto = "computação";
        
        //Quantidade de caractéres
        System.out.println("O texto: "+ texto +" possui " + texto.length()+ " caracteres.");

        //Indice

        int indice = 0;

        // Laço
        do{
            System.out.println(indice + "-" + texto.charAt(indice));
            indice++;
        }while(indice < texto.length());
        
    }
}
