package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactoryDAO {
	
	public static Connection createConnection() {
		String stringDeConexao = "jdbc:mysql://localhost:3306/db_clinica"; //link de conexão com o banco
		String usuario = "root"; //USUÁRIO PADRÃO ADMIN
		String senha = "";
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}

}

//DBA É O CARA - QUE VAI AVALIAR O TRÁFEGO DE BANCO, O BACKUP