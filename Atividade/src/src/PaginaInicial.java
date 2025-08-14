package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JSeparator;
import javax.swing.AbstractListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaginaInicial {

	private JFrame Principal;
	private JTextField txtMensagem;
	private JTable tabela;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicial window = new PaginaInicial();
					window.Principal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaginaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Principal = new JFrame();
		Principal.setBounds(100, 100, 660, 553);
		Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Principal.getContentPane().setLayout(null);
		
		JCheckBox ckMensagem = new JCheckBox("Abrir Mensagem             Ctrl+M ");
		buttonGroup_1.add(ckMensagem);
		ckMensagem.setBounds(12, 5, 208, 23);
		Principal.getContentPane().add(ckMensagem);
		
		JCheckBox ckCartao = new JCheckBox("Abrir Cartão de Visita     Ctrl+C");
		buttonGroup_1.add(ckCartao);
		ckCartao.setBounds(12, 26, 199, 23);
		Principal.getContentPane().add(ckCartao);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(3, 3, 220, 50);
		Principal.getContentPane().add(panel);
		
		JLabel lblDigiteMensagem = new JLabel("Digite uma Mensagem: ");
		lblDigiteMensagem.setBounds(15, 82, 157, 14);
		Principal.getContentPane().add(lblDigiteMensagem);
		
		txtMensagem = new JTextField();
		txtMensagem.setBounds(12, 106, 291, 20);
		Principal.getContentPane().add(txtMensagem);
		txtMensagem.setColumns(10);
		
		JButton btnMostraMensagem = new JButton("Mostra Mensagem");
		btnMostraMensagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, txtMensagem.getText(),"Mensagem", 1);
			}
		});
		btnMostraMensagem.setBounds(12, 137, 149, 23);
		Principal.getContentPane().add(btnMostraMensagem);
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
				{1, "Petri"},
				{2, "Francini"},
				{3, "Claudia"},
				{4, "Talita"},
			},
			new String[] {
				"C\u00F3digo", "Nome"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		tabela.setBounds(324, 11, 305, 115);
		
		JScrollPane scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(324, 11, 305, 106);
		Principal.getContentPane().add(scrollPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
				if(comboBox.getSelectedItem() == "Selecione uma cor para a Tabela") {
					tabela.setBackground(Color.WHITE);
					tabela.setForeground(Color.BLACK);
				}
				if(comboBox.getSelectedItem() == "Verde") {
					tabela.setBackground(Color.GREEN);
					tabela.setForeground(Color.BLACK);
				}
				
				if(comboBox.getSelectedItem() == "Azul") {
					tabela.setBackground(Color.BLUE);
					tabela.setForeground(Color.WHITE);
				}
				
				if(comboBox.getSelectedItem() == "Vermelho") {
					tabela.setBackground(Color.RED);
					tabela.setForeground(Color.BLACK);
				}
				
				if(comboBox.getSelectedItem() == "Laranja") {
					tabela.setBackground(Color.ORANGE);
					tabela.setForeground(Color.BLACK);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma cor para a Tabela", "Verde", "Azul", "Vermelho","Laranja"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(414, 137, 215, 23);
		Principal.getContentPane().add(comboBox);
		
		JCheckBox ckJornal = new JCheckBox("Jornal");
		ckJornal.setBounds(17, 190, 97, 23);
		Principal.getContentPane().add(ckJornal);
		
		JCheckBox ckRevista = new JCheckBox("Revista");
		ckRevista.setBounds(17, 216, 72, 23);
		Principal.getContentPane().add(ckRevista);
		
		JCheckBox ckCD = new JCheckBox("CD / DVD");
		ckCD.setBounds(17, 242, 97, 23);
		Principal.getContentPane().add(ckCD);
		
		JButton btnItens = new JButton("Itens Selecionados");
		btnItens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ckJornal.isSelected()) {
					JOptionPane.showMessageDialog(null, ckJornal.getText(),"Itens Selecionados", 1);
				}
			}
		});
		btnItens.setBounds(110, 216, 149, 23);
		Principal.getContentPane().add(btnItens);
		
		JRadioButton rdMasculino = new JRadioButton("Masculino");
		buttonGroup.add(rdMasculino);
		rdMasculino.setBounds(12, 321, 77, 23);
		Principal.getContentPane().add(rdMasculino);
		
		JRadioButton rdFeminino = new JRadioButton("Feminino");
		buttonGroup.add(rdFeminino);
		rdFeminino.setBounds(12, 352, 77, 23);
		Principal.getContentPane().add(rdFeminino);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setBounds(12, 382, 77, 23);
		Principal.getContentPane().add(btnInserir);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Teclado", "Mouse", "Monitor", "CPU"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(324, 193, 149, 162);
		Principal.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(483, 193, 146, 162);
		Principal.getContentPane().add(list_1);
		
		JButton btnConfirma = new JButton("Confirma");
		btnConfirma.setBounds(444, 364, 77, 23);
		Principal.getContentPane().add(btnConfirma);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(110, 320, 193, 85);
		Principal.getContentPane().add(textArea);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(552, 445, 77, 23);
		Principal.getContentPane().add(btnSair);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(0, 165, 645, 249);
		Principal.getContentPane().add(panel_1);
		
		JMenuBar menuBar = new JMenuBar();
		Principal.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem MenuItem = new JMenuItem("Item 1");
		mnArquivo.add(MenuItem);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem Ajuda = new JMenuItem("Suporte");
		mnAjuda.add(Ajuda);
	}
}
