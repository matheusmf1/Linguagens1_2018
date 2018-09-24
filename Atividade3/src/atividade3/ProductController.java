/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atividade3;

/**
 *
 * @author 15.00175-0
 */
public class ProductController extends ProdutoDao {
    private static ProdutoDao instance = null;    
    
    public static ProdutoDao instance() {
        if (instance == null)
            instance = new ProdutoDao();
        
        return instance;
    }
}
