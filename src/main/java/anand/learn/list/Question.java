package anand.learn.list;

import java.util.List;  

public class Question {  
private int id;  
private String questName;  
private List<String> answers;//List can be of any type  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestName() {
	return questName;
}
public void setQuestName(String questName) {
	this.questName = questName;
}
public List<String> getAnswers() {
	return answers;
}
public void setAnswers(List<String> answers) {
	this.answers = answers;
}
    
}  