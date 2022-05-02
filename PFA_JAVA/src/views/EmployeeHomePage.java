package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import services.Consts;
import services.DbConnector;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.sql.DatabaseMetaData;

public class EmployeeHomePage {
	private ArrayList<String> TABLE_COLUMNS;
	private JFrame frame;
	private JTable table;
	private int ROW_HEIGHT = 30;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeHomePage window = new EmployeeHomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeHomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		TABLE_COLUMNS = new ArrayList<>();
		frame = new JFrame();
		frame.setBounds(Consts.x, Consts.y, Consts.z, Consts.w);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 924, 587);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(36, 30, 865, 534);
		panel.add(panel_1);
		panel_1.setLayout(null);
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(EmployeeHomePage.class.getResource("/images/bg3.jpg")).getImage().getScaledInstance(460,460 , Image.SCALE_DEFAULT));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(271, 144, 551, 289);
		panel_1.add(scrollPane);
		
		
		
		
		table = new JTable();
		
		
		
		
		JLabel lblPhoto = new JLabel("Photo");
		lblPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPhoto.setBounds(10, 11, 81, 80);
		panel_1.add(lblPhoto);
		
		JButton button = new JButton("Sign out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 18));
		button.setBounds(752, 11, 103, 52);
		panel_1.add(button);
		
		JLabel lblNewLabel = new JLabel("Employee Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(92, 34, 138, 37);
		panel_1.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No Item Selected", "group", "event", "child"}));
		comboBox.setBounds(47, 203, 146, 52);
		panel_1.add(comboBox);
		
		JButton btnGetData = new JButton("Get Data");
		btnGetData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == -1) {
		            return;
		        }
		        try {
		        	DbConnector database=new DbConnector();
		        	database.seConnecter();		        	
		            ResultSet rs = database.getMetadata().getColumns(null, null, comboBox.getSelectedItem().toString(), "%");
		            while (rs.next()) {
		                String column = rs.getString("COLUMN_NAME");
		                TABLE_COLUMNS.add(column);
		            }
		            prepTableSpec(table,comboBox,database);
		            scrollPane.setViewportView(table);
		        } catch (Exception ex) {
		        }
		    }
			
		});
		btnGetData.setForeground(Color.WHITE);
		btnGetData.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnGetData.setBackground(new Color(100, 149, 237));
		btnGetData.setBounds(58, 266, 125, 37);
		panel_1.add(btnGetData);
		
	
	}
	public void prepTableSpec(JTable jtable1,JComboBox comboBox,DbConnector database) {
        DefaultTableModel model = (DefaultTableModel) jtable1.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableStructureChanged();
        if (jtable1.getCellEditor() != null) {
            jtable1.getCellEditor().stopCellEditing();
        }
        String[] columns = TABLE_COLUMNS.stream().toArray(size -> new String[size]);
        model = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jtable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jtable1.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
            }
        });
        jtable1.setModel(model);

        try {
            String SQL = "SELECT * FROM coea." + comboBox.getSelectedItem().toString();
            database.executerRequete(SQL);
            ResultSet resset = database.getRs();
            setData(jtable1, resset);
            TABLE_COLUMNS.clear();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void setData(JTable jTable, ResultSet resultSet) {
        ArrayList<ArrayList<Object>> result = toArrayList(resultSet);
        DefaultTableModel aModel = (DefaultTableModel) jTable.getModel();
        aModel.getDataVector().removeAllElements();
        aModel.fireTableStructureChanged();
        for (int i = 0; i < result.size(); i++) {
            Object[] object = result.get(i).toArray();
            aModel.addRow(object);
            jTable.setRowHeight(i, ROW_HEIGHT);

        }
        jTable.setModel(aModel);
    }

    public ArrayList<ArrayList<Object>> toArrayList(ResultSet resultSet) {
        try {
            ArrayList<ArrayList<Object>> table;
            int columnCount = resultSet.getMetaData().getColumnCount();
            if (resultSet.getType() == ResultSet.TYPE_FORWARD_ONLY) {
                table = new ArrayList<>();
            } else {
                resultSet.last();
                table = new ArrayList<>(resultSet.getRow());
                resultSet.beforeFirst();
            }
            for (ArrayList<Object> row; resultSet.next(); table.add(row)) {
                row = new ArrayList<>(columnCount);
                for (int c = 1; c <= columnCount; ++c) {
                    row.add(resultSet.getString(c).intern());
                }
            }
            return table;
        } catch (SQLException e) {
            return null;
        }
    }

}
