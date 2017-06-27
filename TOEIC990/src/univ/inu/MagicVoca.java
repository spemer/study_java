package univ.inu;
 
import java.util.*;
import java.io.*;
 
public class MagicVoca {
 
    ArrayList<EngKor> words = null;
    Random rdm = null;
     
    public MagicVoca()
    {
        rdm = new Random();
        words = new ArrayList<EngKor>();
    }
     
    public void populateMagicVoca()
    {
        // 파일을 읽어서 ArrayList를 채운다.
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("toeicvoca.txt"));
             
            while (true)
            {
                String buf = br.readLine();
                if (buf == null)
                {
                    break;
                }
                int blankIndex = buf.indexOf(' ');
                int colonIndex = buf.indexOf(':');
                 
                String eng = buf.substring(blankIndex+1, colonIndex-1).trim();
                String kor = buf.substring(colonIndex+3).trim();
                 
                //System.out.println("<"+eng+">---------------<"+kor+">");
                EngKor engKor = new EngKor(eng, kor);
                words.add(engKor);
            }
            br.close();
             
        } 
        catch (Exception e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     
    public EngKor getOneEngKor()
    {
        int idx = rdm.nextInt(4006);
        return (EngKor)words.get(idx);
    }
     
    public String[] getThreeExamples(EngKor toBeExcluded)
    {
        int cnt = 0;  // 3개를 뽑아야 한다.
        String[] examples = new String[3];
         
         
        while (cnt < 3)
        {
            int idx = rdm.nextInt(4006); // 0 ~ 4005
            EngKor engKor = (EngKor)words.get(idx);
             
            if (engKor.eng.equals(toBeExcluded.eng) == true)
            {
                continue;
            }
            examples[cnt] = engKor.kor;
            cnt++;
        }
         
        return examples;
    }
     
}