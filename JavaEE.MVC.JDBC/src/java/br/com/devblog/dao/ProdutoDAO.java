/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devblog.dao;

import br.com.devblog.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rkiguti
 */
public class ProdutoDAO extends BaseDAO {
    
    public List<Produto> listarDestaque() {
        ArrayList<Produto> produtos = new ArrayList<>();
        
        try {
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement("SELECT * FROM PRODUTO WHERE DESTAQUE = ?");
            stm.setInt(1, 1);
            
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                Produto p = new Produto();
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setImagem(rs.getString("FOTO"));
                
                produtos.add(p);
            }
            
            rs.close();
            stm.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        
        return produtos;
    }
}
