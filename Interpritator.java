package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Interpritator {
	public static void Start() throws NumberFormatException, IOException, ClassNotFoundException, SQLException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		QuestionsTexts quetion= new QuestionsTexts ();
		String rs="S1";
		boolean start=true;
		
		while (start) {
            FactBase.AddToChain(rs);
			if (quetion.quetions.get(rs)!=null )System.out.println(quetion.quetions.get(rs));
			if (quetion.answers.get(rs)!=null )
				{System.out.println(quetion.answers.get(rs)); start=false;}
		String anser=reader.readLine();
		String r=" ";
		if (anser.equals("да")) 
			r="R1";
		else if (anser.equals("нет"))
			r="R0";
		 rs=KnowlageBase.GetKB(rs, r);
		}}}

