/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author 15.00175-0
 */
public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private String cep;
    private String email;
    
    public Cliente(String cpf, String nome, String endereco, String cep, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
}
