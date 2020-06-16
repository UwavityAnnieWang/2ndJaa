import java.util.ArrayList;
public class MusicSchool {
	private ArrayList<Lesson> lessonList;
	public void updateCosts(double piano, double voice, double reg) {
		for(Lesson lesson: lessonList) {
			if(lesson.getType().equals("piano")) {
				
				lesson.setCost(lesson.getCost()+=piano);
				
			}
			else if(lesson.getType().equals("voice")) {
				lesson.setCost(lesson.getCost()+=voice);
			}else {
				lesson.setCost(lesson.getCost()+=reg);
			}
			
		}
		
	}
	public double getDiscountedLessonCost(double discount) {
		int times =0;
		public Lesson[]temp = new Lesson[times];
		for(Lesson lesson: lessonList) {
			if(lesson.getType().equals("piano")&&lesson.isRegEarly()) {
				temp[times]=lesson;
				times++;
				
				
				
				
			}
		}
		Lesson x = temp[(int)(Math.random()*temp.length)+1];
		x.setCost(x.getCost-=discount);
		return x.getCost();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
