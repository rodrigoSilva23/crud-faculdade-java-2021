/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudEbooks.Dao;

import com.mysql.jdbc.Connection;
import crudEbooks.ConnectionFactory;
import java.sql.PreparedStatement;
import crudEbooks.model.Ebook;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author rodrigo
 */
public class EbooksDao {
    private Connection con;

    public EbooksDao() {
        this.con =  (Connection) new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Ebook ebooks) {
      String sql = "insert into ebooks " +
                  "(autor,isbn,titulo) " +
                  "values (?,?,?)";

      try {
          // prepared statement para inserção
          PreparedStatement stmt = con.prepareStatement(sql);

          // seta os valores
          
            stmt.setString(1,ebooks.getAutor());
            stmt.setInt(2,ebooks.getIsbn());
            stmt.setString(3,ebooks.getTitulo());
            stmt.execute();
            stmt.close();
            } catch (SQLException e) {
          throw new RuntimeException(e);
      }
    }
    
    
    public List<Ebook> getLista() {
      try {
          List<Ebook> ebooks = new ArrayList<Ebook>();
          PreparedStatement stmt = this.con.
                  prepareStatement("select * from ebooks");
           java.sql.ResultSet rs = stmt.executeQuery();

          while (rs.next()) {
              // criando o objeto Contato
              Ebook ebook = new Ebook();
              ebook.setId(rs.getLong("id"));
              ebook.setAutor(rs.getString("autor"));
              ebook.setIsbn(rs.getInt("isbn"));
              ebook.setTitulo(rs.getString("titulo"));

              

              // adicionando o objeto à lista
              ebooks.add(ebook);
          }
          rs.close();
          stmt.close();
          return ebooks;
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
  }
    public void altera(Ebook ebook) {
    String sql = "update ebooks set autor=?, isbn=?, titulo=?" +
            "where id=?";
    try {
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, ebook.getAutor());
        stmt.setInt(2, ebook.getIsbn());
        stmt.setString(3, ebook.getTitulo());
        stmt.setLong(4, ebook.getId());
        stmt.execute();
        stmt.close();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
  }
    
     public void remove(Ebook ebook) {
      try {
          PreparedStatement stmt = con
                  .prepareStatement("delete from ebooks where id=?");
          stmt.setLong(1, ebook.getId());
          stmt.execute();
          stmt.close();
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
  }
}
