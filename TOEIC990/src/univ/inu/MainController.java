package univ.inu;
 
import java.util.*;
 
public class MainController 
{
    private MagicVoca magicVoca = null;
    private MyDisplay myDisplay = null;
    private Random rdm = null;
     
    // ������ ��ġ�� ��ȯ
    public int getLoc()
    {
        return rdm.nextInt(4);  // 0 ~ 3������ ��ȯ
    }
     
    public EngKor getOneWord()
    {
        return magicVoca.getOneEngKor();
    }
     
    public String[] getExamples(EngKor engKor)
    {
        return magicVoca.getThreeExamples(engKor);
    }
     
    public MainController()
    {
        rdm = new Random();
        magicVoca = new MagicVoca();
        magicVoca.populateMagicVoca();
         
        myDisplay = new MyDisplay();
        myDisplay.setMainController(this);
        myDisplay.setExample();
    }
}

/*
�� Ŭ�������� ������(magicVoca)��
GUI(myDisplay) �� ��� ��Ʈ��.
�߰����� ���� �̾��ִ� ¡�˴ٸ� ����
*/