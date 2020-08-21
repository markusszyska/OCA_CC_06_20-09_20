package gui.components;

import java.awt.FlowLayout;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Demo08JSlider {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		frame.setTitle("Demo08JSlider");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		/*
		 * A component that lets the user graphically select a value by sliding a knob
		 * within a bounded interval. The knob is always positioned at the points that
		 * match integer values within the specified interval.
		 */
		JSlider sliderOhneLabel = new JSlider(SwingConstants.VERTICAL);
		sliderOhneLabel.setMajorTickSpacing(10);
		sliderOhneLabel.setPaintTicks(true);
		sliderOhneLabel.setMinimum(20);
		sliderOhneLabel.setMaximum(50);
				
		sliderOhneLabel.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				Object src = e.getSource();
				if (src instanceof JSlider) {
					System.out.println("Value: " + ((JSlider) src).getValue());
				}
			}
		});

		JSlider sliderMitLabel = new JSlider(SwingConstants.VERTICAL);
		sliderMitLabel.addChangeListener(e->{System.out.println(((JSlider)e.getSource()).getValue());});
		//Labeltabelle erstellen
		Hashtable<Integer, JLabel> lableTabelle = new Hashtable<>();
		lableTabelle.put(0, new JLabel("Stop"));
		lableTabelle.put(50, new JLabel("Mittel"));
		lableTabelle.put(100, new JLabel("Schnell"));
		//Dem Slider die Tabelle hitufuegen
		sliderMitLabel.setLabelTable(lableTabelle);
		//Labels sollen gemalt werden
		sliderMitLabel.setPaintLabels(true);
				
		panel.add(sliderOhneLabel);
		panel.add(sliderMitLabel);
		frame.setVisible(true);
	}
}
