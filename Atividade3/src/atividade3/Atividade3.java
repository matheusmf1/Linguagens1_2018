/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atividade3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author FELIPE ANDRADE - RA:15.00175-0
 * @author MATHEUS MANDOTTI - RA:16.00177-0
 */
public class Atividade3 {

    private static boolean ADMIN = false;
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = -1;
        String code;
        String name;
        double price;
        int quant;
        String fab;
        String categ;
        
        if (!login()) {
            System.out.println("\nUsuário inválido!");
            return;
        }
        
        do {
            displayMenu();
            opt = sc.nextInt();
            System.out.println();
            
            switch (opt) {
                case 0:
                    break;
                case 1:
                    System.out.print("Código do produto: ");
                    code = sc.next();
                    System.out.print("Nome do produto: ");
                    name = sc.next();
                    System.out.print("Preço do produto: ");
                    price = sc.nextDouble();
                    System.out.print("Quantidade do produto: ");
                    quant = sc.nextInt();
                    System.out.print("Fabricante do produto: ");
                    fab = sc.next();
                    System.out.print("Categoria do produto: ");
                    categ = sc.next();
                    
                    System.out.println("\nProduto cadastrado com sucesso!");
                    ProductController.instance().insert(new Produto(code, name, price, quant, fab, categ));
                    break;
                case 2:
                    System.out.print("Categoria do produto: ");
                    categ = sc.next();
                    System.out.print("Código do produto: ");
                    code = sc.next();
                    
                    if (ProductController.instance().search(categ, code) == null) {
                        System.out.println("\nProduto não encontrado!");
                        break;
                    }
                    
                    System.out.print("Nome do produto: ");
                    name = sc.next();
                    System.out.print("Preço do produto: ");
                    price = sc.nextDouble();
                    System.out.print("Quantidade do produto: ");
                    quant = sc.nextInt();
                    System.out.print("Fabricante do produto: ");
                    fab = sc.next();
                    
                    System.out.println("\nProduto alterado com sucesso!");
                    ProductController.instance().update(new Produto(code, name, price, quant, fab, categ));
                    break;
                case 3:
                    System.out.println("1 - Pesquisar todos os produtos");
                    System.out.println("2 - Pesquisar produtos por categoria");
                    System.out.print("\nEscolha uma opção: ");
                    int searchOpt  = sc.nextInt();
                    
                    switch(searchOpt) {
                        case 1:
                            System.out.println("\nProdutos encontrados:");
                            System.out.println(ProductController.instance().getAll());
                            break;
                        case 2:
                            System.out.print("Categoria do produto: ");
                            categ = sc.next();
                            
                            System.out.println("\nProdutos encontrados:");
                            System.out.println(ProductController.instance().getAllByCategory(categ));
                            break;
                        default:
                            System.out.println("\nOpção inválida!");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Categoria do produto: ");
                    categ = sc.next();
                    System.out.print("Código do produto: ");
                    code = sc.next();
                    
                    Produto product = ProductController.instance().search(categ, code);
                    
                    if (product == null) {
                        System.out.println("\nProduto não encontrado!");
                        break;
                    }
                    
                    System.out.print("Quantidade do produto: ");
                    int sellQuant = sc.nextInt();
                    
                    if (product.getQuant() < sellQuant) {
                        System.out.println("\nQuantidade acima do permitido");
                        System.out.println("Quantidade disponível: " + product.getQuant());
                        break;
                    }
                    
                    ProductController.instance().update(new Produto(code, product.getName(),
                            product.getPrice(), product.getQuant() - sellQuant, product.getFab(), categ));
                    
                    System.out.println("Venda realizada com sucesso!");
                    break;
                case 5:
                    if (ADMIN) {
                        System.out.print("Nome do usuário: ");
                        String userName = sc.next();
                        System.out.print("Senha do usuário: ");
                        String userPass = sc.next();
                    
                        if (UserController.instance().insert(new Usuario(userName, userPass))) {
                            System.out.println("\nUsuário adicionado com sucesso!");
                        }
                    }
                    else {
                        System.out.println("\nOpção inválida!");
                    }
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opt != 0);
    }
    
    public static boolean login() {
        Scanner sc = new Scanner(System.in);
        boolean result = false;
        
        System.out.print("Usuário: ");
        String userName = sc.next();
        
        System.out.print("Senha: ");
        String userPass = sc.next();
        
        Usuario user = UserController.instance().get(userName, userPass);
        
        if (user != null) {
            if (user.getName().equals("admin") && user.getPass().equals("admin")) { // SOLUÇÃO BEM SOBRINHO!!! :)
                ADMIN = true;
            }
            
            result = true;
        }
        
        return result;
    }
    
    public static void displayMenu() {
        System.out.println("\nMenu");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Alterar/Inserir produto");
        System.out.println("3 - Pesquisar produto");
        System.out.println("4 - Vender produto");
        
        if (ADMIN) {
            System.out.println("5 - Adicionar novos usuários");
        }
        
        System.out.println("0 - Sair");
        System.out.print("\nEscolha uma opção: ");

    }
}
