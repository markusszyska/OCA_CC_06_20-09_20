package vi;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import javax.swing.JToggleButton;

import java.awt.GridBagConstraints;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Yahtzee_game extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable upper_labels;
	private JTable upper_values;
	private JTable lower_labels;
	private JTable lower_values;
	private JTable mid_labels;
	private JTable mid_values;
	private JTable grand_label;
	private JTable grand_value;
	private JToggleButton tglbtnDice[];
	private JButton btnThrow;
	private JButton btnShowHide;
	private String dir_path = "images/";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yahtzee_game frame = new Yahtzee_game();
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
	public Yahtzee_game() {
		setTitle("Yahtzee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0 };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel = new JLabel("Yahtzee");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		upper_labels = new JTable();
		init_upper_l(upper_labels);
		GridBagConstraints gbc_upper_labels = new GridBagConstraints();
		gbc_upper_labels.fill = GridBagConstraints.HORIZONTAL;
		gbc_upper_labels.anchor = GridBagConstraints.NORTH;
		gbc_upper_labels.insets = new Insets(0, 0, 5, 5);
		gbc_upper_labels.gridx = 0;
		gbc_upper_labels.gridy = 1;
		contentPane.add(upper_labels, gbc_upper_labels);

		upper_values = new JTable();
		init_upper_v(upper_values);
		GridBagConstraints gbc_upper_values = new GridBagConstraints();
		gbc_upper_values.insets = new Insets(0, 0, 5, 5);
		gbc_upper_values.fill = GridBagConstraints.BOTH;
		gbc_upper_values.gridx = 1;
		gbc_upper_values.gridy = 1;
		contentPane.add(upper_values, gbc_upper_values);

		mid_labels = new JTable();
		init_mid_l(mid_labels);
		GridBagConstraints gbc_mid_labels = new GridBagConstraints();
		gbc_mid_labels.fill = GridBagConstraints.HORIZONTAL;
		gbc_mid_labels.anchor = GridBagConstraints.NORTH;
		gbc_mid_labels.insets = new Insets(0, 0, 5, 5);
		gbc_mid_labels.gridx = 0;
		gbc_mid_labels.gridy = 2;
		contentPane.add(mid_labels, gbc_mid_labels);

		mid_values = new JTable() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				Component c = super.prepareRenderer(renderer, row, column);
				if (c instanceof JLabel) {
					((JLabel) c).setHorizontalAlignment(JLabel.RIGHT);
				}
				return c;
			}
		};
		init_mid_v(mid_values);
		GridBagConstraints gbc_mid_values = new GridBagConstraints();
		gbc_mid_values.anchor = GridBagConstraints.NORTH;
		gbc_mid_values.insets = new Insets(0, 0, 5, 5);
		gbc_mid_values.fill = GridBagConstraints.HORIZONTAL;
		gbc_mid_values.gridx = 1;
		gbc_mid_values.gridy = 2;
		contentPane.add(mid_values, gbc_mid_values);

		lower_labels = new JTable();
		init_lower_l(lower_labels);
		GridBagConstraints gbc_lower_labels = new GridBagConstraints();
		gbc_lower_labels.insets = new Insets(0, 0, 5, 5);
		gbc_lower_labels.fill = GridBagConstraints.BOTH;
		gbc_lower_labels.gridx = 0;
		gbc_lower_labels.gridy = 3;
		contentPane.add(lower_labels, gbc_lower_labels);

		lower_values = new JTable();
		init_lower_v(lower_values);
		GridBagConstraints gbc_lower_values = new GridBagConstraints();
		gbc_lower_values.insets = new Insets(0, 0, 5, 5);
		gbc_lower_values.fill = GridBagConstraints.BOTH;
		gbc_lower_values.gridx = 1;
		gbc_lower_values.gridy = 3;
		contentPane.add(lower_values, gbc_lower_values);

		grand_label = new JTable();
		init_grand_l(grand_label);
		GridBagConstraints gbc_grand_label = new GridBagConstraints();
		gbc_grand_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_grand_label.anchor = GridBagConstraints.NORTH;
		gbc_grand_label.insets = new Insets(0, 0, 0, 5);
		gbc_grand_label.gridx = 0;
		gbc_grand_label.gridy = 4;
		contentPane.add(grand_label, gbc_grand_label);

		grand_value = new JTable() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				Component c = super.prepareRenderer(renderer, row, column);
				if (c instanceof JLabel) {
					((JLabel) c).setHorizontalAlignment(JLabel.RIGHT);
				}
				return c;
			}
		};
		init_grand_v(grand_value);
		GridBagConstraints gbc_grand_value = new GridBagConstraints();
		gbc_grand_value.fill = GridBagConstraints.HORIZONTAL;
		gbc_grand_value.anchor = GridBagConstraints.NORTH;
		gbc_grand_value.insets = new Insets(0, 0, 0, 5);
		gbc_grand_value.gridx = 1;
		gbc_grand_value.gridy = 4;
		contentPane.add(grand_value, gbc_grand_value);

		ImageIcon icon[] = new ImageIcon[6];
		ImageIcon icon_s[] = new ImageIcon[6];
		for (int i = 0; i < icon.length; i++) {
			String filepath = dir_path + (i + 1) + ".png";
			icon[i] = new ImageIcon(getClass().getResource(filepath));
			icon_s[i] = new ImageIcon(icon[i].getImage().getScaledInstance(65, 65, 0));
			icon[i] = new ImageIcon(icon[i].getImage().getScaledInstance(70, 70, 0));
		}

		tglbtnDice = new JToggleButton[5];

		tglbtnDice[0] = new JToggleButton(icon[0]);
		tglbtnDice[0].setSelectedIcon(icon_s[0]);
		tglbtnDice[0].setPreferredSize(new Dimension(70, 70));
		GridBagConstraints gbc_tglbtnDice = new GridBagConstraints();
		gbc_tglbtnDice.anchor = GridBagConstraints.WEST;
		gbc_tglbtnDice.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDice.gridx = 2;
		gbc_tglbtnDice.gridy = 1;

		tglbtnDice[1] = new JToggleButton(icon[0]);
		tglbtnDice[1].setSelectedIcon(icon_s[0]);
		tglbtnDice[1].setPreferredSize(new Dimension(70, 70));
		GridBagConstraints gbc_tglbtnDice_1 = new GridBagConstraints();
		gbc_tglbtnDice_1.insets = new Insets(0, 0, 5, 0);
		gbc_tglbtnDice_1.gridx = 4;
		gbc_tglbtnDice_1.gridy = 1;

		tglbtnDice[2] = new JToggleButton(icon[0]);
		tglbtnDice[2].setSelectedIcon(icon_s[0]);
		tglbtnDice[2].setPreferredSize(new Dimension(70, 70));
		GridBagConstraints gbc_tglbtnDice_2 = new GridBagConstraints();
		gbc_tglbtnDice_2.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDice_2.gridx = 3;
		gbc_tglbtnDice_2.gridy = 1;

		tglbtnDice[3] = new JToggleButton(icon[0]);
		tglbtnDice[3].setSelectedIcon(icon_s[0]);
		tglbtnDice[3].setPreferredSize(new Dimension(70, 70));
		GridBagConstraints gbc_tglbtnDice_3 = new GridBagConstraints();
		gbc_tglbtnDice_3.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDice_3.gridx = 2;
		gbc_tglbtnDice_3.gridy = 2;

		tglbtnDice[4] = new JToggleButton(icon[0]);
		tglbtnDice[4].setSelectedIcon(icon_s[0]);
		tglbtnDice[4].setPreferredSize(new Dimension(70, 70));
		GridBagConstraints gbc_tglbtnDice_4 = new GridBagConstraints();
		gbc_tglbtnDice_4.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDice_4.gridx = 3;
		gbc_tglbtnDice_4.gridy = 2;

//		contentPane.add(tglbtnDice[0], gbc_tglbtnDice);
//		contentPane.add(tglbtnDice[1], gbc_tglbtnDice_1);
//		contentPane.add(tglbtnDice[2], gbc_tglbtnDice_2);
//		contentPane.add(tglbtnDice[3], gbc_tglbtnDice_3);
//		contentPane.add(tglbtnDice[4], gbc_tglbtnDice_4);

		btnThrow = new JButton("Go");
		btnThrow.addActionListener(new ActionListener() {

			private int roll_count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < tglbtnDice.length; i++) {
					
					if (roll_count == 0 || tglbtnDice[i].isSelected()) {
						int number = roll_dice();
						tglbtnDice[i].setIcon(icon[number]);
						tglbtnDice[i].setSelectedIcon(icon_s[number]);
						tglbtnDice[i].setSelected(false);
					}
					
				}
				roll_count++;
				if (roll_count > 2) {
					roll_count = 0;
					btnThrow.setText("Go");
				} else {
					btnThrow.setText("" + roll_count + "/2");
				}

			}

		});

		btnThrow.setPreferredSize(new Dimension(60, 40));
		GridBagConstraints gbc_btnThrow = new GridBagConstraints();
		gbc_btnThrow.insets = new Insets(0, 0, 5, 0);
		gbc_btnThrow.gridx = 4;
		gbc_btnThrow.gridy = 2;
//		contentPane.add(btnThrow, gbc_btnThrow);

		btnShowHide = new JButton("Show");
		btnShowHide.setPreferredSize(new Dimension(140, 30));
		btnShowHide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (btnShowHide.getText().equals("Show")) {
					contentPane.add(tglbtnDice[0], gbc_tglbtnDice);
					contentPane.add(tglbtnDice[0], gbc_tglbtnDice);
					contentPane.add(tglbtnDice[1], gbc_tglbtnDice_1);
					contentPane.add(tglbtnDice[2], gbc_tglbtnDice_2);
					contentPane.add(tglbtnDice[3], gbc_tglbtnDice_3);
					contentPane.add(tglbtnDice[4], gbc_tglbtnDice_4);
					contentPane.add(btnThrow, gbc_btnThrow);
					btnShowHide.setText("Hide");
					setBounds(getBounds().x, getBounds().y, getBounds().width + 200, getBounds().height);
				} else {
					contentPane.remove(tglbtnDice[0]);
					contentPane.remove(tglbtnDice[1]);
					contentPane.remove(tglbtnDice[2]);
					contentPane.remove(tglbtnDice[3]);
					contentPane.remove(tglbtnDice[4]);
					contentPane.remove(btnThrow);
					btnShowHide.setText("Show");
					setBounds(getBounds().x, getBounds().y, getBounds().width - 200, getBounds().height);
				}

			}
		});
		GridBagConstraints gbc_btnShowHide = new GridBagConstraints();
		gbc_btnShowHide.anchor = GridBagConstraints.NORTH;
		gbc_btnShowHide.insets = new Insets(0, 0, 5, 0);
		gbc_btnShowHide.gridx = 0;
		gbc_btnShowHide.gridy = 5;
		contentPane.add(btnShowHide, gbc_btnShowHide);

	}

	private static int roll_dice() {
		int random = (int) (Math.random() * 6);
		return random;
	}

	private void init_upper_l(JTable upper_labels) {

		upper_labels.setRowHeight(30);
		upper_labels.setFont(new Font("Tahoma", Font.PLAIN, 16));
		upper_labels.setBorder(new LineBorder(null, 1, true));
		upper_labels.setEnabled(false);
		upper_labels.setRowSelectionAllowed(false);
		upper_labels.setModel(new DefaultTableModel(
				new String[][] { { "Ones" }, { "Twos" }, { "Threes" }, { "Fours" }, { "Fives" }, { "Sixes" }, },
				new String[] { "upper_titles" }));
		upper_labels.getColumnModel().getColumn(0).setPreferredWidth(200);

	}

	private void init_upper_v(JTable upper_values) {

		upper_values.setRowHeight(30);
		upper_values.setFont(new Font("Tahoma", Font.PLAIN, 16));
		upper_values.setBorder(new LineBorder(null, 1, true));
		upper_values.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		upper_values.setRowSelectionAllowed(false);
		upper_values.setModel(new DefaultTableModel(
				new Integer[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
				new String[] { "1", "2", "3", "4", "5", "6" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] { Integer.class, Integer.class, Integer.class, Integer.class,
					Integer.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			@Override
			public boolean isCellEditable(int row, int column) {
				return true;
			}

			@Override
			public void setValueAt(Object aValue, int row, int column) {
				super.setValueAt(aValue, row, column);
				update_mid(column);
				update_grand(column);
			}

			private void update_mid(int column) {

				int total = 0;
				for (int i = 0; i < getRowCount(); i++) {
					if (getValueAt(i, column) == null) {
						continue;
					}
					total += (Integer) getValueAt(i, column);
				}
				int bonus = 63 - total;
				if (bonus < 1) {
					bonus = 35;
					mid_values.getModel().setValueAt(bonus, 0, column);
				} else {
					mid_values.getModel().setValueAt("0 (-" + bonus + ")", 0, column);
					bonus = 0;
				}

				mid_values.getModel().setValueAt("" + (total + bonus), 1, column);

			}

		});

	}

	private void init_mid_l(JTable mid_labels) {

		mid_labels.setRowHeight(30);
		mid_labels.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mid_labels.setEnabled(false);
		mid_labels.setBorder(new LineBorder(null, 1, true));
		mid_labels.setModel(new DefaultTableModel(new String[][] { { "Bonus (+35 at score > 62)" }, { "Total" }, },
				new String[] { "1" }));
		mid_labels.getColumnModel().getColumn(0).setPreferredWidth(200);

	}

	private void init_mid_v(JTable mid_values) {

		mid_values.setRowHeight(30);
		mid_values.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mid_values.setEnabled(false);
		mid_values.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mid_values.setModel(new DefaultTableModel(
				new String[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null }, },
				new String[] { "1", "2", "3", "4", "5", "6" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

		});
		mid_values.setBorder(new LineBorder(null, 1, true));
		mid_values.setRowSelectionAllowed(false);

	}

	private void init_lower_l(JTable lower_labels) {

		lower_labels.setRowHeight(30);
		lower_labels.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lower_labels.setBorder(new LineBorder(null, 1, true));
		lower_labels.setEnabled(false);
		lower_labels.setRowSelectionAllowed(false);
		lower_labels.setModel(new DefaultTableModel(new String[][] { { "3 of a kind" }, { "4 of a kind" },
				{ "Full house (+25)" }, { "Small straight (+30)" }, { "Large straight (+40)" }, { "Yahtzee (+50)" },
				{ "Chance" }, { "Yahtzee Bonus (+100)" }, }, new String[] { "lower_titles" }));
		lower_labels.getColumnModel().getColumn(0).setPreferredWidth(200);

	}

	private void init_lower_v(JTable lower_values) {

		lower_values.setRowHeight(30);
		lower_values.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lower_values.setRowSelectionAllowed(false);
		lower_values.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lower_values.setBorder(new LineBorder(null, 1, true));
		lower_values.setModel(new DefaultTableModel(
				new Integer[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] { Integer.class, Integer.class, Integer.class, Integer.class,
					Integer.class, Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			public boolean isCellEditable(int row, int column) {
				return (row > 7 ? false : true);
			}

			@Override
			public void setValueAt(Object aValue, int row, int column) {
				super.setValueAt(aValue, row, column);
				update_grand(column);
			}

		});

	}

	private void init_grand_l(JTable grand_label) {

		grand_label.setRowHeight(30);
		grand_label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		grand_label.setEnabled(false);
		grand_label.setBorder(new LineBorder(null, 1, true));
		grand_label
				.setModel(new DefaultTableModel(new String[][] { { "Grand Total" }, }, new String[] { "New column" }) {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
					Class[] columnTypes = new Class[] { String.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
		grand_label.getColumnModel().getColumn(0).setPreferredWidth(200);
	}

	private void init_grand_v(JTable grand_value) {

		grand_value.setRowHeight(30);
		grand_value.setFont(new Font("Tahoma", Font.PLAIN, 16));
		grand_value.setBorder(new LineBorder(null, 1, true));
		grand_value.setEnabled(false);
		grand_value.setModel(new DefaultTableModel(new Integer[][] { { null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] { Integer.class, Object.class, Object.class, Object.class, Object.class,
					Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

	}

	private void update_grand(int column) {
		int grand = 0;
		TableModel mid_m = mid_values.getModel();
		TableModel lower_m = lower_values.getModel();

		if (mid_m.getValueAt(1, column) != null) {
			try {
				grand = Integer.parseInt((String) mid_m.getValueAt(1, column));
			} catch (NumberFormatException e) {
				grand = 0;
			}
		}

		for (int i = 0; i < lower_m.getRowCount(); i++) {
			if (lower_m.getValueAt(i, column) == null) {
				continue;
			}
			grand += (Integer) lower_m.getValueAt(i, column);
		}

		grand_value.getModel().setValueAt(grand, 0, column);

	}

}
