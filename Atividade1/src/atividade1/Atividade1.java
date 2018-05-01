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
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cartoes.setTaxaConversaoDolar(4.00);
        
        Usuarios u1 = new Usuarios("Felipe", "gatinho.safado@vem.ka", "696.969.696-69", "24/24/24");
        Usuarios u2 = new Usuarios("Matheus", "tesudo.sarado@quero.vc", "101.101.101-69", "69/69/69");
        
        u1.setCarteira("bunda", "rola");
        u2.setCarteira("rola", "bunda");
        
        u1.getCarteira().setCartaoDebito("seila", "VISA", "01/01/01", "01/06", "669", "123", "6969 6969 6969 6969", "9999");
        u2.getCarteira().setCartaoDebito("seila2", "MASTER", "10/10/10", "10/16", "101", "789", "1010 1010 1010 1010", "6666");
        u2.getCarteira().setCartaoCredito("seila3", "MASTER", "02/02/02", "02/06", "699", "456", "2424 2424 2424 2424", "1111");
        
        u1.pagar("debito", "123");
        u2.pagar("debito", "789");
        u2.pagar("credito", "456");

        System.out.println("-----------------------------------\n");

        System.out.println(u1.getInfoUsuario());
        System.out.println(u2.getInfoUsuario());
        
        System.out.println("-----------------------------------\n");
        
        System.out.println(u1.getCarteira().getInfoCarteira());
        System.out.println(u2.getCarteira().getInfoCarteira());
        
        System.out.println("-----------------------------------\n");
        
        System.out.println(u1.getCarteira().getCartaoDebito().getInfoCartao());
        System.out.println(u2.getCarteira().getCartaoDebito().getInfoCartao());
        System.out.println(u2.getCarteira().getCartaoCredito().getInfoCartao());
        
        System.out.println("-----------------------------------\n");
        
        
    }
    
}
