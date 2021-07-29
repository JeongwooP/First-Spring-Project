package com.sparta.week01.prac;

public class Course {
    public String title;
    public String tutor;
    public int days;

    // 이렇게 아무런 파라미터가 없는 생성자를 기본생성자 라고 부릅니다.
    public Course() {

    }
    // this 는 "이것" 이죠? 클래스 변수를 가리킵니다.
    // Getter
    public String getTitle() {
        return this.title;
    }
    // Getter
    public String getTutor() {
        return this.tutor;
    }
    // Getter
    public int getDays() {
        return this.days;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }
    // Setter
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    // Setter
    public void setDays(int days) {
        this.days = days;
    }

    public Course(String title, String tutor, int days) {
        Course course = new Course();

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

        course.setTitle("웹개발의 봄 스프링");
        course.setTutor("남병관");
        course.setDays(35);

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());
    }
}