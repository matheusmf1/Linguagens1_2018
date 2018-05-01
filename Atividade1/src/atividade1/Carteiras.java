/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author Nome: Felipe Andrade    RA: 15.00175-0
 * @author Nome: Matheus Mandotti  RA: 16.00177-0
 * 
 */
public class Carteiras {
    private static int _idCarteira;
    private int idCarteira;
    private String nomeCarteira;
    private String senhaAcesso;
    private Cartoes cartaoDebito;
    private Cartoes cartaoCredito;
    
    public Carteiras(String nomeCarteira, String senhaAcesso) {
        idCarteira = _idCarteira++;
        this.nomeCarteira = nomeCarteira;
        this.senhaAcesso = senhaAcesso;
    }
    
    public String getInfoCarteira() {
        return String.format("ID Carteira:\t%d\nNome Carteira:\t%s\n",
                idCarteira, this.nomeCarteira);
    }
    
    /**
     * @return the idCarteira
     */
    public int getIdCarteira() {
        return idCarteira;
    }

    /**
     * @return the nomeCarteira
     */
    public String getNomeCarteira() {
        return nomeCarteira;
    }

    /**
     * @param nomeCarteira the nomeCarteira to set
     */
    public void setNomeCarteira(String nomeCarteira) {
        this.nomeCarteira = nomeCarteira;
    }

    /**
     * @return the senhaAcesso
     */
    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    /**
     * @param senhaAcesso the senhaAcesso to set
     */
    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    /**
     * @return the cartaoDebito
     */
    public Cartoes getCartaoDebito() {
        return cartaoDebito;
    }

    public void setCartaoDebito(String label, String emissorCartao,
            String dataEmissao, String validade, String ccv,
            String senha, String numeroCartao, String numeroConta) {
        this.cartaoDebito = new Cartoes(label, emissorCartao,
            "debito", dataEmissao, validade, ccv,
            senha, numeroCartao, numeroConta);
    }

    /**
     * @return the cartaoCredito
     */
    public Cartoes getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(String label, String emissorCartao,
            String dataEmissao, String validade, String ccv,
            String senha, String numeroCartao, String numeroConta) {
        this.cartaoCredito = new Cartoes(label, emissorCartao,
            "credito", dataEmissao, validade, ccv,
            senha, numeroCartao, numeroConta);
    }
}
