package atividade1;

import java.util.List;

/**
 *
 * @author Nome: Felipe Andrade    RA: 15.00175-0
 * @author Nome: Matheus Mandotti  RA: 16.00177-0
 * 
 */
public class Usuarios {
    private String nome;
    private String email;
    private String cpf;
    private String nascimento;
    private Carteiras carteira;
    
    public Usuarios(String nome, String email, String cpf, String nascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }
    
    public String getInfoUsuario() {
        return String.format("Nome:\t\t%s\nEmail:\t\t%s\nCPF:\t\t%s\nNascimento:\t%s\n", this.nome, this.email, this.cpf, this.nascimento);
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /**
     * @return the carteira
     */
    public Carteiras getCarteira() {
        return carteira;
    }

    /**
     * @param carteira the carteira to set
     */
    public void setCarteira(String nome, String senha) {
        this.carteira = new Carteiras(nome, senha);
    }
    
    public boolean alterarSenha(int numeroCarteira, String senhaAtual, String novaSenha) {
        boolean resp = false;
        
        if (autenticar(senhaAtual)) {
            this.getCarteira().setSenhaAcesso(novaSenha);
            resp = true;
        }
        
        return resp;
    }
    
    public boolean autenticar(String senhaAtual) {
        boolean resp = false;
        
        if (this.getCarteira().getSenhaAcesso().equals(senhaAtual))
            resp = true;
        
        return resp;
    }
    
    // Este método apenas redireciona o 
    public void pagar(String metodo, String senhaCartao) {
        if(metodo.equalsIgnoreCase("debito"))
            if(this.carteira.getCartaoDebito().autenticar(senhaCartao))
                System.out.println("Cartão Débito: Pagamento realizado com sucesso.\n");
            else
                System.out.println("Cartão Débito: Senha inválida. Não foi possível realizar o pagamento.\n");
        else
            if(this.carteira.getCartaoCredito().autenticar(senhaCartao))
                System.out.println("Cartão Crédito: Pagamento realizado com sucesso.\n");
            else
                System.out.println("Cartão Crédito: Senha inválida. Não foi possível realizar o pagamento.\n");
    }
}
