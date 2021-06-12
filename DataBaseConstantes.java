package crudEbooks;

public interface DataBaseConstantes {
	//public final static String DRV =	"org.firebirdsql.jdbc.FBDriver";
//	public final static String DRV = "sun.jdbc.odbc.JdbcOdbcDriver";
//	public final static String DRV = "oracle.jdbc.driver.OracleDriver";
//	public final static String DRV = "com.microsoft.jdbc.sqlserver.SQLServerDriver";

//	public final static String URL2 =	"jdbc:firebirdsql://localhost/" +
       //                             "c:/TE.GDB";
                                    
//public final String URL2 = "jdbc:odbc:db";                                    
//	public final static String URL =	"jdbc:oracle:thin:@localhost:1521:ORCL";
//	public final static String URL =	"jdbc:microsoft:sqlserver://localhost:1433";

  //public final static String USUARIO = "SYSDBA";
	//public final static String SENHA = "masterkey";
    //public final String arquivoSQL = "C:\\TomcatEmbasa\\webapps\\pos\\WEB-INF\\sql\\ci.sql";
    public final String DRV     = "org.gjt.mm.mysql.Driver";
    public final String URL2        = "jdbc:mysql://localhost:3306/Cadastros_ebooks?characterEncoding=utf8";
    public final String USUARIO      = "root";
    public final String SENHA   = "King1425@";

    /*public final String DRV     = "org.postgresql.Driver";
    public final String CAMINHOBANCO        = "jdbc:postgresql://localhost/postgres";
    public final String USUARIO      = "postgres";
    public final String SENHA   = "123456";*/

}