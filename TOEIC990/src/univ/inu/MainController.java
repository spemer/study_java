package univ.inu;
 
import java.util.*;
 
public class MainController 
{
    private MagicVoca magicVoca = null;
    private MyDisplay myDisplay = null;
    private Random rdm = null;
     
    // 정답의 위치를 반환
    public int getLoc()
    {
        return rdm.nextInt(4);  // 0 ~ 3까지를 반환
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
이 클래스에서 데이터(magicVoca)와
GUI(myDisplay) 를 모두 컨트롤.
중간에서 둘을 이어주는 징검다리 역할
*/