package core.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import core.Loader;
import core.MathHelper;

public class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static double size;
	private static boolean debug = Loader.debug;
	public static JTextField imput1;
	
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
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());      
        //помещаем туда кнопки
        final JButton button1 = new JButton("Вычислить");
        button1.setActionCommand("Button 1 was pressed!");
        panel1.add(button1);        
        //и текст
        //Внимание! Говнокод!
        imput1 = new JTextField("0",15);
        panel1.add(imput1);
        final JTextArea outputnahui = new JTextArea("Результат", 25, 30);
        // Шрифт и табуляция
        outputnahui.setFont(new Font("Dialog", Font.PLAIN, 14));
        outputnahui.setTabSize(10);
        //перенос слов
        outputnahui.setLineWrap(true);
        outputnahui.setWrapStyleWord(true);
        panel1.add(outputnahui);
        //подтверждение закрытия окна!
        frame.addWindowListener(new WindowAdapter() {     
        public void windowClosing(WindowEvent event) {
            Object[] options = { "Да", "Нет!" };
            int n = JOptionPane
                    .showOptionDialog(event.getWindow(), "Вы уверены, что хотите выйти?",
                            "", JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options,
                            options[0]);
            if (n == 0) {
                event.getWindow().setVisible(false);
                System.exit(0);
            }
        }		
        });
        // Слушатель окончания ввода(копипаста)
        imput1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста(тоже копипаста)
            	if(debug==true){
                    System.out.println("Воод через Enter. Только для отладки");
                    JOptionPane.showMessageDialog(Frame.this, "пизда рулю === " + MathHelper.massa + " -Вес дискет"+ MathHelper.v3all + " -Обьем нахуй" + MathHelper.xernia + "ШТ");
                    System.out.println("пизда рулю === " + MathHelper.massa + " -Вес дискет"+ MathHelper.v3all + " -Обьем нахуй" + MathHelper.xernia + " Обьем");
                    e.getActionCommand();
                    MathHelper.Init();
                    if(size != 0 && size > 0){
                    MathHelper.calcul();
                    }
                	}  
                               
            }
        }); 
       
	
     //опять мой говнокод  
       //исходя из копипасты делаем вывод
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(debug==true){
                System.out.println("Кнопка нажата.");
            	}
                e.getActionCommand();
                //первым делом сделаем проверку на ноль, ибо можем получить краш, но чтобы сделать проверку, нужно преобразовать числа...Ой все!
                //Инициализация и обновление переменных.
                MathHelper.Init();
                if(size != 0 && size > 0){
                	if(debug==true){
                        System.out.println("size > 0");
                        MathHelper.calcul();
                        outputnahui.setText("Количество дискет(ШТ) - " + MathHelper.xernia + " Обьем(М.куб) - " + MathHelper.v3all + "  Масса(кг)" + MathHelper.massa);
                    	}
                }
                
            }
        }); 
        
     //Авторство и т.д.
        JLabel name = new JLabel(Loader.name +" version - "+ Loader.version);       
        panel1.add(name);        
        JLabel kopirasta = new JLabel("Студия Минмакс, World of MinmaX, Asd1995sse.");
        panel1.add(kopirasta);
     //Фрейм, добавление панели, размер окна и видимость.
        frame.getContentPane().add(panel1);        
        frame.setPreferredSize(new Dimension(666, 666));        
        frame.pack();
        frame.setVisible(true);    
        return;
	}
	
public static double GetSize(){
	if(debug==true){
        System.out.println("Объем данных - " + size);
    	}
	return size = Double.parseDouble(imput1.getText());	
}
}
