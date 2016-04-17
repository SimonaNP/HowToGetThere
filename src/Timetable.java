import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.toedter.calendar.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.DefaultComboBoxModel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.toedter.components.JLocaleChooser;
import com.toedter.components.JSpinField;

public class Timetable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timetable frame = new Timetable();
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
	public Timetable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMap = new JLabel("MAP");
		lblMap.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblMap.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMap.setHorizontalAlignment(SwingConstants.CENTER);
		lblMap.setBounds(40, 27, 537, 604);
		contentPane.add(lblMap);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"blq", "blqq", "blqqqwe"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(642, 391, 139, 37);
		
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(868, 391, 139, 37);
		contentPane.add(comboBox_1);
		
		JLabel label = new JLabel("");
		label.setBounds(657, 401, 56, 16);
		contentPane.add(label);
		
		JLabel label_1 = DefaultComponentFactory.getInstance().createLabel("");
		label_1.setBounds(763, 149, 110, 16);
		contentPane.add(label_1);
		
		JDayChooser dayChooser = new JDayChooser();
		dayChooser.setBounds(709, 81, 208, 218);
		contentPane.add(dayChooser);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(929, 83, 112, 22);
		contentPane.add(monthChooser);
		
		JLocaleChooser localeChooser = new JLocaleChooser();
		localeChooser.setBounds(681, 48, 252, 22);
		contentPane.add(localeChooser);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(737, 461, 163, 155);
		contentPane.add(calendar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(944, 143, 93, 22);
		contentPane.add(dateChooser);
		
		JSpinField spinField = new JSpinField();
		spinField.setBounds(977, 206, 30, 22);
		contentPane.add(spinField);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(956, 256, 51, 22);
		contentPane.add(yearChooser);
		
	        }
	}