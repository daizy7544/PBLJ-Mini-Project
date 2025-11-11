import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExpenseSplitter
{

	private JFrame frame;
	private JTextField txtAmount;
	private JTextField txtBari;
	private JTextField txtUzair;
	private JTextField txtShahbaz;
	private JTextField txtMusab;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					ExpenseSplitter window = new ExpenseSplitter();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExpenseSplitter()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame("Expense Splitter");
		frame.setSize(629, 511);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(12, 12, 264, 448);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 73, 106, -21);
		panel.add(btnNewButton);
		
		txtAmount = new JTextField();
		txtAmount.setText("0.00");
		txtAmount.setBounds(51, 40, 154, 45);
		panel.add(txtAmount);
		txtAmount.setColumns(10);
		
		
		JRadioButton btnBari = new JRadioButton("Daizy");
		btnBari.setBounds(51, 158, 144, 23);
		panel.add(btnBari);
		
		JRadioButton btnUzair = new JRadioButton("Harsh");
		btnUzair.setBounds(51, 198, 144, 23);
		panel.add(btnUzair);
		
		JRadioButton btnShahbaz = new JRadioButton("Shikha");
		btnShahbaz.setBounds(51, 238, 144, 23);
		panel.add(btnShahbaz);
		
		JRadioButton btnMusab = new JRadioButton("Jatin");
		btnMusab.setBounds(51, 278, 144, 23);
		panel.add(btnMusab);
		
		JRadioButton btnEveryone = new JRadioButton("Everyone");
		btnEveryone.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnEveryone.isSelected())
				{
					btnBari.setSelected(true);
					btnUzair.setSelected(true);
					btnShahbaz.setSelected(true);
					btnMusab.setSelected(true);
				}
				else
				{
					btnBari.setSelected(false);
					btnUzair.setSelected(false);
					btnShahbaz.setSelected(false);
					btnMusab.setSelected(false);
				}
			}
		});
		//btnEveryone.setSelected(true);
		btnEveryone.setBounds(51, 118, 144, 23);
		panel.add(btnEveryone);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				double amount, amountPerPerson;
				int totalPersons = 0;
				
				if (btnBari.isSelected())
				{
					totalPersons++;
				}
				if (btnUzair.isSelected())
				{
					totalPersons++;
				}
				if (btnShahbaz.isSelected())
				{
					totalPersons++;
				}
				if (btnMusab.isSelected())
				{
					totalPersons++;
				}
				
				amount = Double.parseDouble(txtAmount.getText());
				amountPerPerson = amount / totalPersons;
				
				double BariAmount, UzairAmount, ShahbazAmount, MusabAmount;
				double totalPerPerson = 0.0;
				String totalPerPString, TotalAmountString = "";
				
				if (btnBari.isSelected())
				{
					BariAmount = Double.parseDouble(txtBari.getText());
					totalPerPerson = BariAmount + amountPerPerson;
					totalPerPString = String.format("%.2f", totalPerPerson);
					txtBari.setText(totalPerPString);
					totalPerPerson = 0.0;
					totalPerPString = "";
				}
				if (btnUzair.isSelected())
				{
					UzairAmount = Double.parseDouble(txtUzair.getText());
					totalPerPerson = UzairAmount + amountPerPerson;
					totalPerPString = String.format("%.2f", totalPerPerson);
					txtUzair.setText(totalPerPString);
					totalPerPerson = 0.0;
					totalPerPString = "";
				}
				if (btnShahbaz.isSelected())
				{
					ShahbazAmount = Double.parseDouble(txtShahbaz.getText());
					totalPerPerson = ShahbazAmount + amountPerPerson;
					totalPerPString = String.format("%.2f", totalPerPerson);
					txtShahbaz.setText(totalPerPString);
					totalPerPerson = 0.0;
					totalPerPString = "";
				}
				if (btnMusab.isSelected())
				{
					MusabAmount = Double.parseDouble(txtMusab.getText());
					totalPerPerson = MusabAmount + amountPerPerson;
					totalPerPString = String.format("%.2f", totalPerPerson);
					txtMusab.setText(totalPerPString);
					totalPerPerson = 0.0;
					totalPerPString = "";
				}
				
				totalPersons = 0;
				
				double TotalAmount = Double.parseDouble(txtTotal.getText()) + amount;
				TotalAmountString = String.format("%.2f", TotalAmount);
				txtTotal.setText(TotalAmountString);
			}
		});
		btnCalculate.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCalculate.setBackground(new Color(0, 255, 0));
		btnCalculate.setBounds(70, 330, 114, 25);
		panel.add(btnCalculate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(255, 255, 0));
		btnReset.setBounds(70, 375, 114, 25);
		panel.add(btnReset);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 196));
		panel_1.setBounds(288, 12, 312, 448);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBari = new JLabel("Daizy");
		lblBari.setBounds(50, 55, 66, 15);
		panel_1.add(lblBari);
		
		JLabel lblUzair = new JLabel("Harsh");
		lblUzair.setBounds(50, 105, 66, 15);
		panel_1.add(lblUzair);
		
		JLabel lblShahbaz = new JLabel("Shikha");
		lblShahbaz.setBounds(50, 155, 66, 15);
		panel_1.add(lblShahbaz);
		
		JLabel lblMusab = new JLabel("Jatin");
		lblMusab.setBounds(50, 205, 66, 15);
		panel_1.add(lblMusab);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTotal.setBounds(50, 295, 65, 15);
		panel_1.add(lblTotal);
		
		txtBari = new JTextField();
		txtBari.setText("0.00");
		txtBari.setBounds(125, 55, 125, 20);
		panel_1.add(txtBari);
		txtBari.setColumns(10);
		
		txtUzair = new JTextField();
		txtUzair.setText("0.00");
		txtUzair.setColumns(10);
		txtUzair.setBounds(125, 105, 125, 20);
		panel_1.add(txtUzair);
		
		txtShahbaz = new JTextField();
		txtShahbaz.setText("0.00");
		txtShahbaz.setColumns(10);
		txtShahbaz.setBounds(125, 155, 125, 20);
		panel_1.add(txtShahbaz);
		
		txtMusab = new JTextField();
		txtMusab.setText("0.00");
		txtMusab.setColumns(10);
		txtMusab.setBounds(125, 205, 125, 20);
		panel_1.add(txtMusab);
		
		txtTotal = new JTextField();
		txtTotal.setText("0.00");
		txtTotal.setColumns(10);
		txtTotal.setBounds(125, 295, 125, 20);
		panel_1.add(txtTotal);
	}
}