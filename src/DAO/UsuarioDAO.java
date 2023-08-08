package DAO;
//FAZ A AUTENTICAÇÃO

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import DTO.UsuarioDTO;

public class UsuarioDAO {

	Connection conexao;
	//pegando informações do banco
	public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
		
		//CRIANDO CONEXÃO COM O BANCO DE DADOS
		conexao = new ConnectionFactoryDAO().createConnection();
		
		try {
			//VERIFICAÇÃO SE O USUÁRIO EXISTE NO BANCO DE DADOS - IRÁ SELECIONAR UM USUÁRIO (FILTRO)
			String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ? AND status = 1;";// O * TRÁS TODOS OS CAMPOS
			
			//PREPARANDO OS DADOS PARA FAZER O SELECET (INSERIR) OS DADOS NO BANCO
			PreparedStatement cmd = conexao.prepareStatement(sql);
			
			//PEGANDO AS INFORMAÇÕES DO USUARIODTO
			cmd.setString(1, objusuariodto.getNome_usuario()); //PEGA DA TELA DE LOGIN (frmLoginView)
			cmd.setString(2, objusuariodto.getSenha_usuario());
			
			ResultSet rs = cmd.executeQuery();
			return rs;
			
			//SE A INFORMAÇÃO INSERIDA FOR INCORRETA
		}catch (Exception error) {
			JOptionPane.showMessageDialog(null, "UsuárioDAO : " + error); //IRÁ EXIBIR O ERRO
			return null;
		}
		
	} 
	
}
