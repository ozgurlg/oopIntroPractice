package oopIntroPractice;

public class CourseManager {
	public void startCourse(Course course) {
		System.out.println("Kursa ba�land�: " + course.name);
	}
	
	public void nextLesson(Course course) {
		System.out.println("Ders: " + course.lesson + ".Ders " + course.name);
	}
}
