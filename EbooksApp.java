package crudEbooks;


import crudEbooks.Dao.EbooksDao;
import crudEbooks.model.Ebook;
import java.util.List;



public class EbooksApp implements DataBaseConstantes {

    public static void main(String[] args) {
        
        //Comando para inserir no bando de dados
        /*Ebook ebook = new Ebook();
          //Comando para inserir no bando de dados
          ebook.setAutor("rodrigo");
          ebook.setIsbn(2);
          ebook.setTitulo("rodrigo 2");

          EbooksDao Dao = new EbooksDao();


          Dao.adiciona(ebook);
            System.out.println("Gravado");*/
        
        
        
            // sorte!!
       //comando para lista no banco de dados BUSCAR
       
         /*EbooksDao dao = new EbooksDao();

            List<Ebook> ebooks = dao.getLista();
            for (Ebook ebook : ebooks) {
       System.out.println("id: " + ebook.getId());
          System.out.println("Autor: " + ebook.getAutor());
          System.out.println("isbn: " + ebook.getIsbn());
          System.out.println("Titulo: " + ebook.getTitulo());

      }*/
          
          
          
          
          
          //Comando para Editar no bando de dados
          
       /*Ebook ebook = new Ebook();
          
          ebook.setAutor("rodrigo alterar");
          ebook.setIsbn(10);
          ebook.setTitulo("rodrigo 2 alterar");
          ebook.setId(14); //id que sera editado
         

          EbooksDao dao = new EbooksDao();


          dao.altera(ebook);
            System.out.println("UPDATE");*/
      
        
        
        // remove do banco
        Ebook ebook = new Ebook();
        ebook.setId(14); //id para remover
      

            EbooksDao dao = new EbooksDao();
          dao.remove(ebook);
            System.out.println("Removeu o id:"+ ebook.getId());
    }
}

 