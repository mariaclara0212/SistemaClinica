package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmPessoaView extends JFrame {

	private JPanel contentPane;
	private JTextField txtcodigo_pessoa;
	private JTextField txtnome_pessoa;
	private JTextField txtcpfcnpj_pessoa;
	private JTextField txtrgie_pessoa;
	private JTextField txtemail_pessoa;
	private JTable table;
	private JTextField txttelefone_pessoa;
	private JTextField txtcontato_pessoa;
	private JTable jTablePessoa;
	private JTextField textField;

	/**
	 * Launch the application app.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPessoaView frame = new frmPessoaView();
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
	public frmPessoaView() {
		setTitle("Cadastro de Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Pessoa");
		lblNewLabel.setBackground(new Color(240, 240, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 764, 41);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(20, 63, 743, 487);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblcodigo = new JLabel("Codigo:");
		lblcodigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblcodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcodigo.setBounds(91, 47, 46, 14);
		panel.add(lblcodigo);
		
		JLabel lblpessoa = new JLabel("Tipo Pessoa:");
		lblpessoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblpessoa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblpessoa.setBounds(59, 86, 78, 14);
		panel.add(lblpessoa);
		
		JLabel lblnome = new JLabel("Nome:");
		lblnome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblnome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblnome.setBounds(91, 131, 46, 14);
		panel.add(lblnome);
		
		JLabel lblcpfcnpj = new JLabel("CPF/CNPJ:");
		lblcpfcnpj.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblcpfcnpj.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcpfcnpj.setBounds(73, 168, 64, 14);
		panel.add(lblcpfcnpj);
		
		JLabel lblrgie = new JLabel("RG/I. ESTADUAL: ");
		lblrgie.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblrgie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblrgie.setBounds(19, 207, 118, 14);
		panel.add(lblrgie);
		
		JLabel lblemail = new JLabel("E-mail:");
		lblemail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblemail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblemail.setBounds(59, 248, 78, 14);
		panel.add(lblemail);
		
		txtcodigo_pessoa = new JTextField();
		txtcodigo_pessoa.setEnabled(false);
		txtcodigo_pessoa.setBounds(170, 44, 140, 20);
		panel.add(txtcodigo_pessoa);
		txtcodigo_pessoa.setColumns(10);
		
		//COMBOBOX DE OPÇÃO - FÍSICA JURÍDICA - TIPO DE PESSOA
		JComboBox cmbtipo_pessoa = new JComboBox();
		cmbtipo_pessoa.setEnabled(false);
		cmbtipo_pessoa.setBackground(new Color(255, 255, 255));
		cmbtipo_pessoa.addItem("Física");
		cmbtipo_pessoa.addItem("Jurídica");
		cmbtipo_pessoa.setSelectedItem(null);
		cmbtipo_pessoa.setBounds(170, 82, 140, 22);
		panel.add(cmbtipo_pessoa);
		
		txtnome_pessoa = new JTextField();
		txtnome_pessoa.setEnabled(false);
		txtnome_pessoa.setBounds(170, 128, 379, 20);
		panel.add(txtnome_pessoa);
		txtnome_pessoa.setColumns(10);
		
		txtcpfcnpj_pessoa = new JTextField();
		txtcpfcnpj_pessoa.setEnabled(false);
		txtcpfcnpj_pessoa.setBounds(170, 165, 216, 20);
		panel.add(txtcpfcnpj_pessoa);
		txtcpfcnpj_pessoa.setColumns(10);
		
		txtrgie_pessoa = new JTextField();
		txtrgie_pessoa.setEnabled(false);
		txtrgie_pessoa.setBounds(170, 204, 216, 20);
		panel.add(txtrgie_pessoa);
		txtrgie_pessoa.setColumns(10);
		
		txtemail_pessoa = new JTextField();
		txtemail_pessoa.setEnabled(false);
		txtemail_pessoa.setBounds(170, 245, 379, 20);
		panel.add(txtemail_pessoa);
		txtemail_pessoa.setColumns(10);
		
		table = new JTable();
		table.setBounds(73, 462, 634, -64);
		panel.add(table);
		
		JLabel lbltelefone = new JLabel("Telefone:");
		lbltelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbltelefone.setBounds(73, 284, 64, 14);
		panel.add(lbltelefone);
		
		txttelefone_pessoa = new JTextField();
		txttelefone_pessoa.setEnabled(false);
		txttelefone_pessoa.setBounds(170, 281, 216, 20);
		panel.add(txttelefone_pessoa);
		txttelefone_pessoa.setColumns(10);
		
		JLabel lblcontato = new JLabel("Contato:");
		lblcontato.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblcontato.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcontato.setBounds(73, 321, 64, 14);
		panel.add(lblcontato);
		
		txtcontato_pessoa = new JTextField();
		txtcontato_pessoa.setEnabled(false);
		txtcontato_pessoa.setBounds(170, 321, 216, 20);
		panel.add(txtcontato_pessoa);
		txtcontato_pessoa.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 352, 702, 124);
		panel.add(scrollPane);
		
		jTablePessoa = new JTable();
		jTablePessoa.setModel(new DefaultTableModel(
				new Object[][] {
						
				},
				new String [] {
						"Código", "Pessoa", "Nome", "CPF/CNPJ", "RG/I.E.", "Email", "Telefone", "Contato"
				}
				
				));
		
		jTablePessoa.getColumnModel().getColumn(0).setPreferredWidth(50);
		jTablePessoa.getColumnModel().getColumn(0).setResizable(true);
		jTablePessoa.getColumnModel().getColumn(1).setPreferredWidth(100);
		jTablePessoa.getColumnModel().getColumn(1).setResizable(true);
		jTablePessoa.getColumnModel().getColumn(2).setPreferredWidth(200);
		jTablePessoa.getColumnModel().getColumn(2).setResizable(true);
		jTablePessoa.getColumnModel().getColumn(3).setPreferredWidth(100);
		jTablePessoa.getColumnModel().getColumn(3).setResizable(true);
		jTablePessoa.getColumnModel().getColumn(4).setPreferredWidth(100);
		jTablePessoa.getColumnModel().getColumn(4).setResizable(true);
		jTablePessoa.getColumnModel().getColumn(5).setPreferredWidth(95);
		jTablePessoa.getColumnModel().getColumn(5).setResizable(true);
		jTablePessoa.getColumnModel().getColumn(6).setPreferredWidth(95);
		jTablePessoa.getColumnModel().getColumn(6).setResizable(true);
		jTablePessoa.getColumnModel().getColumn(7).setPreferredWidth(95);
		jTablePessoa.getColumnModel().getColumn(7).setResizable(true);

		
		jTablePessoa.getTableHeader().setReorderingAllowed(false);
		jTablePessoa.setAutoResizeMode(jTablePessoa.AUTO_RESIZE_OFF);
		jTablePessoa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//scrollPane.setColumnHeaderView(jTablePessoa);
		scrollPane.setViewportView(jTablePessoa);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\assistencia-medica (1).png"));
		lblNewLabel_1.setBounds(639, 11, 68, 68);
		panel.add(lblNewLabel_1);
		
		JButton jButtonNovo_Pessoa = new JButton("Novo");
		jButtonNovo_Pessoa.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\novo-usuario.png"));
		jButtonNovo_Pessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //BOTÃO DE NOVO
				
				cmbtipo_pessoa.setSelectedItem(null);
				txtcodigo_pessoa.setText(null);
				txtnome_pessoa.setText(null);
				txtcpfcnpj_pessoa.setText(null);
				txtrgie_pessoa.setText(null);
				txtemail_pessoa.setText(null);
				txttelefone_pessoa.setText(null);
				txtcontato_pessoa.setText(null);
				
				
				//HABILITAR OS CAMPOS
				 cmbtipo_pessoa.setEnabled(true);
				 txtnome_pessoa.setEnabled(true);
				 txtcpfcnpj_pessoa.setEnabled(true);
				 txtrgie_pessoa.setEnabled(true);
				 txtemail_pessoa.setEnabled(true);
				 txttelefone_pessoa.setEnabled(true);
				 txtcontato_pessoa.setEnabled(true);
				
			}
		});
		jButtonNovo_Pessoa.setBackground(new Color(255, 255, 255));
		jButtonNovo_Pessoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		jButtonNovo_Pessoa.setBounds(620, 99, 101, 23);
		panel.add(jButtonNovo_Pessoa);
		
		textField = new JTextField();
		textField.setBounds(632, 178, -802, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton jButtonSalvar_Pessoa = new JButton("Salvar");
		jButtonSalvar_Pessoa.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\confirme.png"));
		jButtonSalvar_Pessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //BOTÃO DE SALVAR
				
				String nomepessoa, cpfcnpjpessoa, rgiepessoa, emailpessoa, telefonepessoa, tipopessoa, contatopessoa;
				
				tipopessoa = (String) cmbtipo_pessoa.getSelectedItem();
				nomepessoa = txtnome_pessoa.getText();
				cpfcnpjpessoa = txtcpfcnpj_pessoa.getText();
				rgiepessoa = txtrgie_pessoa.getText();
				emailpessoa = txtemail_pessoa.getText();
				telefonepessoa = txttelefone_pessoa.getText();
				contatopessoa =  txtcontato_pessoa.getText();
				
				
				//PESSOADTO
				
				
			}
		});
		jButtonSalvar_Pessoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		jButtonSalvar_Pessoa.setBackground(new Color(255, 255, 255));
		jButtonSalvar_Pessoa.setBounds(620, 133, 101, 23);
		panel.add(jButtonSalvar_Pessoa);
		
		JButton jButtonEditar_Pessoa = new JButton("Editar");
		jButtonEditar_Pessoa.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\contrato.png"));
		jButtonEditar_Pessoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		jButtonEditar_Pessoa.setBackground(new Color(255, 255, 255));
		jButtonEditar_Pessoa.setBounds(620, 164, 101, 23);
		panel.add(jButtonEditar_Pessoa);
		
		JButton jButtonExcluir_Pessoa = new JButton("Excluir");
		jButtonExcluir_Pessoa.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\lixo.png"));
		jButtonExcluir_Pessoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		jButtonExcluir_Pessoa.setBackground(new Color(255, 255, 255));
		jButtonExcluir_Pessoa.setBounds(620, 198, 101, 23);
		panel.add(jButtonExcluir_Pessoa);
		
		JButton jButtonCancelar_Pessoa = new JButton("Cancelar");
		jButtonCancelar_Pessoa.setHorizontalAlignment(SwingConstants.RIGHT);
		jButtonCancelar_Pessoa.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\ponto-de-exclamacao.png"));
		jButtonCancelar_Pessoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		jButtonCancelar_Pessoa.setBackground(new Color(255, 255, 255));
		jButtonCancelar_Pessoa.setBounds(620, 232, 101, 23);
		panel.add(jButtonCancelar_Pessoa);
		
		JButton jButtonFechar = new JButton("Fechar");
		jButtonFechar.setIcon(new ImageIcon("C:\\Users\\892178\\Downloads\\fechadas.png"));
		jButtonFechar.setFont(new Font("Tahoma", Font.BOLD, 11));
		jButtonFechar.setBackground(new Color(255, 255, 255));
		jButtonFechar.setBounds(620, 266, 101, 23);
		panel.add(jButtonFechar);
		
		
	
		
	}
}
