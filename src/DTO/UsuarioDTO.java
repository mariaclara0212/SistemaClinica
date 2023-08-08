package DTO;

import java.util.Date;

public class UsuarioDTO {

	private int idusuario;
	private String nome_usuario, senha_usuario, status_usuario;
	private Date create_usuario, update_usuario;
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario; //THIS ESTÁ ARMAZENANDO VALOR DENTRO DA VARIÁVEL
	}
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	
	public String getSenha_usuario() {
		return senha_usuario;
	}
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	public String getStatus_usuario() {
		return status_usuario;
	}
	public void setStatus_usuario(String status_usuario) {
		this.status_usuario = status_usuario;
	}
	public Date getCreate_usuario() {
		return create_usuario;
	}
	public void setCreate_usuario(Date create_usuario) {
		this.create_usuario = create_usuario;
	}
	public Date getUpdate_usuario() {
		return update_usuario;
	}
	public void setUpdate_usuario(Date update_usuario) {
		this.update_usuario = update_usuario;
	}
	
	
	
	
	
	
}
