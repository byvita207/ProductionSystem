package test;

import java.util.HashMap;

public class QuestionsTexts {

	 public static HashMap<String, String> quetions = new  HashMap<>();
    	{quetions.put("S1", "Заказчик видит цель во всех подробностях?" );
    	quetions.put("S2", "заказчик предполагает возможность изменений?" );
    	quetions.put("S3", "Риск изменений велик?" );
    	quetions.put("S4", "Планируется поддержка продукта после релиза?" );
    	quetions.put("S5", "кол-во исполнителей <7 чел?" );
    	quetions.put("S6", "Планируется поддержка продукта после релиза?" );
    	};
       
    public static  HashMap<String, String> answers = new  HashMap<>();
    {
    answers.put("RS1", "Waterfall");
    answers.put("RS2", "гибрид Waterfall + Agile с длинными спринтами");
    answers.put("RS3", "гибрид Waterfall + Agile с 2-3 недельными спринтами +Scrum");
    answers.put("RS4", "Agile+Kanban");
    answers.put("RS5", "поделить на команды 4-7 человек и использовать Agile+Kanban");
    answers.put("RS6", "гибрид Waterfall + Agile с двухнедельными спринтами");
    answers.put("RS7", "Agile + Scrum c двухнедельными спринтами");
    };
  
}
