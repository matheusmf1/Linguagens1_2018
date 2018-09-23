package estudoerros;
/**
 *
 * @author Matheus
 */
public class EstudoErros {
    
    public static void main(String[] args) {
        System.out.println("Inicio da main");
        metodo1();
        System.out.println("Fim da main");
    }
    
    static void metodo1(){
        System.out.println("Inicio metodo 1");
        try{
            metodo2();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Falhou aqui!!");
            System.out.println(""+e);
        }
        System.out.println("Fim do metodo 1");
    }
    
    static void metodo2() throws ArrayIndexOutOfBoundsException{
        System.out.println("Inicio metodo 2");
        int [] array = new int[10];
        try{
            for (int i = 0 ; i < 15; i++){
                array[i] = i;
                System.out.println(""+i);
            }
        }
        catch(Exception e){
            System.out.println("Deu ruim!!");
            System.out.println(e.toString());
            throw(e);
        }
        System.out.println("Fim da Metodo 2");
    }
}
