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
public class Cartoes {
    private static Double taxaConversaoDolar;
    private static int _idCartao;
    private int idCartao;
    private String label;
    private String emissorCartao;
    private String tipo;
    private String dataEmissao;
    private String validade;
    private String ccv;
    private String senha;
    private String numeroCartao;
    private String numeroConta;
    
    public Cartoes(String label, String emissorCartao,
            String tipo, String dataEmissao, String validade, String ccv,
            String senha, String numeroCartao, String numeroConta) {
        this.idCartao = _idCartao++;
        this.label = label;
        this.emissorCartao = emissorCartao;
        this.tipo = tipo;
        this.dataEmissao = dataEmissao;
        this.validade = validade;
        this.ccv = ccv;
        this.senha = senha;
        this.numeroCartao = numeroCartao;
        this.numeroConta = numeroConta;
    }
    
    public String getInfoCartao() {
        return String.format("ID Cartao:\t\t%d\nLabel:\t\t\t%s\nEmissor:\t\t%s\n"
                + "Tipo:\t\t\t%s\nData de Emissão:\t%s\nValidade:\t\t%s\nCCV:\t\t\t%s\n"
                + "Número do Cartão:\t%s\nNúmero da Conta:\t%s\n", getIdCartao(),
                this.label, this.emissorCartao, this.tipo, this.dataEmissao,
                this.validade, this.ccv, this.numeroCartao, this.numeroConta);
    }
    
    /**
     * @return the taxaConversaoDolar
     */
    public static Double getTaxaConversaoDolar() {
        return taxaConversaoDolar;
    }

    /**
     * @param valor the valor to set
     */
    public static void setTaxaConversaoDolar(Double valor) {
        taxaConversaoDolar = valor;
    }

    /**
     * @return the idCartao
     */
    public int getIdCartao() {
        return idCartao;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the emisorCartao
     */
    public String getEmissorCartao() {
        return emissorCartao;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the dataEmissao
     */
    public String getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @return the validade
     */
    public String getValidade() {
        return validade;
    }

    /**
     * @return the ccv
     */
    public String getCcv() {
        return ccv;
    }

    /**
     * @return the numeroCartao
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * @return the numeroConta
     */
    public String getNumeroConta() {
        return numeroConta;
    }
    
    
    public void pagar(String senha) {     
        if (autenticar(senha))
            System.out.println("Pagamento realizado com sucesso.");
        else
            System.out.println("Senha inválida. Não foi possível realizar o pagamento.");
    }
    
    public boolean autenticar(String senha) {
        boolean resp = false;
        
        if (this.senha.equals(senha))
            resp = true;
        
        return resp;
    }
}
