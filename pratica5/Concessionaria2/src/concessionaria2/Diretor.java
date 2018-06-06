package concessionaria2;

/**
 *
 * @author Matheus
 */
public class Diretor extends Funcionario implements Autenticavel {
    
    private String senha;
    
    public Diretor(String nome, double salarioBase, String senha){
        super(nome,salarioBase);
        this.senha = senha;
        
    
    }

    @Override
    public boolean autentica(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado! ");
            return false;
        }
    }

}
