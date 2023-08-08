package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class frmLoginView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenhaUsuario;

	/**
	 * Launch the application app.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLoginView frame = new frmLoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmLoginView() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 232, 255));
		
		setUndecorated(true); //TIRAR A BORDA DA TELINHA DE LOGIN - OCULTAR MENU JFRAME
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\letra-x.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //BOTÃO DE SAIR
				dispose();
			}
		});
		btnNewButton.setBounds(418, 23, 22, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\do-utilizador.png"));
		lblNewLabel.setForeground(new Color(128, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 107, 97, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\cadeado.png"));
		lblNewLabel_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(23, 165, 84, 16);
		contentPane.add(lblNewLabel_1);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setForeground(new Color(0, 0, 0));
		txtNomeUsuario.setBounds(117, 107, 223, 20);
		contentPane.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);
		
		JButton btnEntrarSistema = new JButton("Entrar");
		btnEntrarSistema.setBackground(new Color(255, 255, 255));
		btnEntrarSistema.setForeground(new Color(84, 95, 186));
		btnEntrarSistema.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEntrarSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Teste Botão");
				
				try {
					String nome_usuario, senha_usuario;
					
					nome_usuario = txtNomeUsuario.getText(); //PEGANDO NOME DO USUÁRIO QUE ESTÁ DENTRO DO CAMPO
					senha_usuario = txtSenhaUsuario.getText(); //PEGANDO A SENHA DO USUÁRIO QUE ELE INSERIU NO CAMPO
					
					UsuarioDTO objusuariodto = new UsuarioDTO(); //UsuarioDTO - CHAMANDO A CLASSE 
					//CRIEI UM OBJETO QUE IRÁ RECEBER OS DADOS E DEPOIS ENVIAR
					
					//PEGUEI OS VALORES DAS VARIÁVEUS nome_usuario/senha_usuario E ESTÁ SETANDO
					objusuariodto.setNome_usuario(nome_usuario);
					objusuariodto.setSenha_usuario(senha_usuario);
					
					//JOptionPane.showMessageDialog(null, objusuariodto.getNome_usuario());
					
					
					//System.out.println(nome_usuario);
					//System.out.println(senha_usuario);
					
					//IMPORTAR A CLASSE DAO (DE AUTENTICAÇÃO) PARA ESTA CLASSE
					UsuarioDAO objusuariodao = new UsuarioDAO();
					ResultSet rsusuario = objusuariodao.autenticacaoUsuario(objusuariodto);
					
					if(rsusuario.next()) {
						//JOptionPane.showMessageDialog(null, "FUNCIONOU!");
						
						//CONECTANDO O LOGINVIEW COM O PRINCIPALVIEW - AO LOGAR, VAI PARA A PRINCIPAL
						frmPrincipalView objfrmprincipalview = new frmPrincipalView();
						objfrmprincipalview.setVisible(true);
						
						dispose();
						
					} else {
						JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválida!");
					}
					
					
				}catch(Exception error) {
					JOptionPane.showMessageDialog(null, "FRMLOGINVIEW: " + error);
				}
				
			}
		});
		btnEntrarSistema.setBounds(168, 221, 97, 23);
		contentPane.add(btnEntrarSistema);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN DA MAMARIA");
		lblNewLabel_2.setForeground(new Color(128, 128, 255));
		lblNewLabel_2.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(127, 24, 167, 41);
		contentPane.add(lblNewLabel_2);
		
		txtSenhaUsuario = new JPasswordField();
		txtSenhaUsuario.setBounds(117, 165, 223, 20);
		contentPane.add(txtSenhaUsuario);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\assistencia-medica (1).png"));
		lblNewLabel_3.setBounds(366, 189, 84, 100);
		contentPane.add(lblNewLabel_3);
	}
}
