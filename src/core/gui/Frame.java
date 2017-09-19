package core.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.Loader;
import core.MathHelper;

public class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int size;
	
	public Frame(){
		//Конструктор? Да так веселее, нефиг писать статичный код, конструктор позволит вам купить асбестовую прокладку на стул!
		super("У меня жопа горит");
		//Хитрожопый режим декорации
		JFrame.setDefaultLookAndFeelDecorated(Loader.decor);
		//Создаем фрейм
		JFrame frame = new JFrame(Loader.name);
		//стандартные операции
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //создаём первую панель
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());      
        //помещаем туда кнопки
        JButton button1 = new JButton("Кнопка нехуя на работает, так что пишите цифру и жмите ИНТЕР нахуй!");
        button1.setActionCommand("Button 1 was pressed!");
        panel1.add(button1);
        
        //и текст
        //Внимание! Говнокод!
        final JTextField imput1 = new JTextField("",15);
        panel1.add(imput1);
        
     // Слушатель окончания ввода(копипаста)
        imput1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста(тоже копипаста)
                JOptionPane.showMessageDialog(Frame.this, "пизда рулю === " + MathHelper.massa + " -Вес дискет"+ MathHelper.v3all + " -Обьем нахуй" + MathHelper.xernia + "Обьем");
                System.out.println("пизда рулю === " + MathHelper.massa + " -Вес дискет"+ MathHelper.v3all + " -Обьем нахуй" + MathHelper.xernia + "Обьем");
                e.getActionCommand();
                size = Integer.parseInt(imput1.getText());
                MathHelper.calcul();
            }
        });
        JLabel outputnaxui = new JLabel("пизда рулю === ");
       
        outputnaxui.setText("пизда рулю === " + MathHelper.massa + " -Вес дискет"+ MathHelper.v3all + " -Обьем нахуй" + MathHelper.xernia + "Обьем");
        panel1.add(outputnaxui);
        JLabel kopirasta = new JLabel("пизда рулю === Студия Минмакс, альфа версия, сори за мат, я очень довно не кодил!");
        panel1.add(kopirasta);
    
      //опять мой говнокод  
      //получим размер
       
     
        frame.getContentPane().add(panel1);
        //frame.getContentPane().add(panel2);
        frame.setPreferredSize(new Dimension(666, 666));        
        frame.pack();
        frame.setVisible(true);    
        return;
	}
	
public static int GetSize(){
	return size;
}
}
