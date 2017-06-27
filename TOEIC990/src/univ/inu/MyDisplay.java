package univ.inu;
 
import java.awt.Color;
import java.awt.event.*;
 
import javax.swing.*;
 
public class MyDisplay implements ActionListener
{
     
    JButton btn1 = null;
    JButton btn2 = null;
    JButton btn3 = null;
    JButton btn4 = null;
     
    JLabel engWord = null;
    JLabel[] korWords = null;
    JLabel scoreCard = null;
     
    MainController mainController = null;
     
    public void setMainController(MainController _mainController)
    {
        mainController = _mainController;
    }
     
     
    public void setExample()
    {
        EngKor word = mainController.getOneWord();
        String[] examples = mainController.getExamples(word);
        engWord.setText(word.eng);
         
        int loc = mainController.getLoc();
        int j = 0;
         
        for (int i = 0; i < 4; i++)
        {
            if (i == loc)
            {
                korWords[i].setText(word.kor);
                continue;
            }
            korWords[i].setText(examples[j]);
            j++;
        }
         
             
    }
 
    public void actionPerformed(ActionEvent e)
    {
        this.setExample();
    }
 
    public MyDisplay()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        engWord = new JLabel("Apple");
        engWord.setBounds(30, 20, 200, 30);
        engWord.setForeground(Color.RED);
         
        korWords = new JLabel[4];
         
        korWords[0] = new JLabel("한글예제 1");
        korWords[0].setBounds(70, 60, 180, 30);
        korWords[0].setForeground(Color.BLUE);
         
        korWords[1] = new JLabel("한글예제 2");
        korWords[1].setBounds(70, 100, 180, 30);
        korWords[1].setForeground(Color.BLUE);
         
        korWords[2] = new JLabel("한글예제 3");
        korWords[2].setBounds(70, 140, 180, 30);
        korWords[2].setForeground(Color.BLUE);
         
        korWords[3] = new JLabel("한글예제 4");
        korWords[3].setBounds(70, 180, 180, 30);
        korWords[3].setForeground(Color.BLUE);
         
        scoreCard = new JLabel("정답율");
        scoreCard.setBounds(300, 205, 50, 30);
        scoreCard.setForeground(Color.MAGENTA);
         
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
         
        // 버튼 붙여넣기
        frame.setLayout(null);
        btn1.setBounds(20, 60, 50, 30);
        btn1.addActionListener(this);
        btn2.setBounds(20, 100, 50, 30);
        btn2.addActionListener(this);
        btn3.setBounds(20, 140, 50, 30);
        btn4.setBounds(20, 180, 50, 30);        
         
        frame.add(engWord);
        frame.add(korWords[0]);
        frame.add(korWords[1]);
        frame.add(korWords[2]);
        frame.add(korWords[3]);
        frame.add(scoreCard);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
         
        frame.setSize(400,  300);
        frame.setVisible(true);
    }
}