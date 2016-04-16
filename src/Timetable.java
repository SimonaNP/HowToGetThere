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
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

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
		
		JLabel lblMap = new JLabel("");
		lblMap.setIcon(new ImageIcon("C:\\Users\\PC1\\Documents\\HowToGetThere\\src\\resource\\map.PNG"));
		lblMap.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMap.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMap.setHorizontalAlignment(SwingConstants.CENTER);
		lblMap.setBounds(10, 50, 521, 604);
		contentPane.add(lblMap);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u041D\u0410\u0427\u0410\u041B\u041D\u0410 \u0421\u041F\u0418\u0420\u041A\u0410", "\u0411\u043B\u043E\u043A 26", "\u0411\u043B\u043E\u043A 41", "\u041F\u0430\u0437\u0430\u0440\u0447\u0435", "\u0421\u0442\u0435\u0444\u0430\u043B", "\u0413\u0430\u0432\u0440\u0438\u043B \u0413\u0435\u043D\u043E\u0432", "\u0421\u0442\u0430\u0440 \u043F\u0430\u0437\u0430\u0440", "\u0411\u043B\u0430\u0433\u043E\u0435\u0432", "\u0421\u0443\u043C\u0438", "\u041A\u043E\u0441\u043C\u043E\u0441", "\u0410\u0445\u0430\u0442", "\u0411\u043E\u043B\u043D\u0438\u0446\u0430\u0442\u0430", "OMV", "\u041C\u0435\u0434\u043A\u043E\u0432\u0435\u0446", "\u0422\u0435\u0445\u043D\u043E\u043F\u043E\u043B\u0438\u0441", "\u0425\u0438\u043C\u043A\u043E"}));
		comboBox.setBounds(851, 64, 139, 37);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u041A\u0420\u0410\u0419\u041D\u0410 \u0421\u041F\u0418\u0420\u041A\u0410", "\u0411\u043B\u043E\u043A 26", "\u0411\u043B\u043E\u043A 41", "\u041F\u0430\u0437\u0430\u0440\u0447\u0435", "\u0421\u0442\u0435\u0444\u0430\u043B", "\u0413\u0430\u0432\u0440\u0438\u043B \u0413\u0435\u043D\u043E\u0432", "\u0421\u0442\u0430\u0440 \u043F\u0430\u0437\u0430\u0440", "\u0411\u043B\u0430\u0433\u043E\u0435\u0432", "\u0421\u0443\u043C\u0438", "\u041A\u043E\u0441\u043C\u043E\u0441", "\u0410\u0445\u0430\u0442", "\u0411\u043E\u043B\u043D\u0438\u0446\u0430\u0442\u0430", "OMV", "\u041C\u0435\u0434\u043A\u043E\u0432\u0435\u0446", "\u0422\u0435\u0445\u043D\u043E\u043F\u043E\u043B\u0438\u0441", "\u0425\u0438\u043C\u043A\u043E"}));
		comboBox_1.setBounds(851, 137, 139, 37);
		contentPane.add(comboBox_1);
		
		JDayChooser dayChooser = new JDayChooser();
		dayChooser.setBounds(632, 64, 119, 133);
		contentPane.add(dayChooser);
		
	        }
	}

