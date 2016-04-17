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
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

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
		setBounds(100, 100, 951, 751);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMap = new JLabel("");
		lblMap.setIcon(new ImageIcon("C:\\Users\\PC1\\workspace\\HowToGetThere\\src\\resource\\map.PNG"));
		lblMap.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblMap.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMap.setHorizontalAlignment(SwingConstants.CENTER);
		lblMap.setBounds(10, 81, 521, 604);
		contentPane.add(lblMap);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u041D\u0410\u0427\u0410\u041B\u041D\u0410 \u0421\u041F\u0418\u0420\u041A\u0410", "\u0411\u043B\u043E\u043A 26", "\u0411\u043B\u043E\u043A 41", "\u041F\u0430\u0437\u0430\u0440\u0447\u0435", "\u0421\u0442\u0435\u0444\u0430\u043B", "\u0413\u0430\u0432\u0440\u0438\u043B \u0413\u0435\u043D\u043E\u0432", "\u0421\u0442\u0430\u0440 \u043F\u0430\u0437\u0430\u0440", "\u0411\u043B\u0430\u0433\u043E\u0435\u0432", "\u0421\u0443\u043C\u0438", "\u041A\u043E\u0441\u043C\u043E\u0441", "\u0410\u0445\u0430\u0442", "\u0411\u043E\u043B\u043D\u0438\u0446\u0430\u0442\u0430", "OMV", "\u041C\u0435\u0434\u043A\u043E\u0432\u0435\u0446", "\u0422\u0435\u0445\u043D\u043E\u043F\u043E\u043B\u0438\u0441", "\u0425\u0438\u043C\u043A\u043E"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(554, 81, 139, 37);
		
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u041A\u0420\u0410\u0419\u041D\u0410 \u0421\u041F\u0418\u0420\u041A\u0410", "\u0411\u043B\u043E\u043A 26", "\u0411\u043B\u043E\u043A 41", "\u041F\u0430\u0437\u0430\u0440\u0447\u0435", "\u0421\u0442\u0435\u0444\u0430\u043B", "\u0413\u0430\u0432\u0440\u0438\u043B \u0413\u0435\u043D\u043E\u0432", "\u0421\u0442\u0430\u0440 \u043F\u0430\u0437\u0430\u0440", "\u0411\u043B\u0430\u0433\u043E\u0435\u0432", "\u0421\u0443\u043C\u0438", "\u041A\u043E\u0441\u043C\u043E\u0441", "\u0410\u0445\u0430\u0442", "\u0411\u043E\u043B\u043D\u0438\u0446\u0430\u0442\u0430", "OMV", "\u041C\u0435\u0434\u043A\u043E\u0432\u0435\u0446", "\u0422\u0435\u0445\u043D\u043E\u043F\u043E\u043B\u0438\u0441", "\u0425\u0438\u043C\u043A\u043E"}));
		comboBox_1.setBounds(554, 129, 139, 37);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(554, 310, 363, 375);
		contentPane.add(scrollPane);
		
	        }
	}

