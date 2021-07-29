package com.sparta.week01.prac;

public class Tutor {
    private String name;
    private String bio;

    public Tutor(String name, String bio){
        this.name = name;
        this.bio = bio;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBio(String bio){
        this.bio = bio;
    }

    public String getName(){
        return this.name;
    }

    public String getBio(){
        return this.bio;
    }

    public static void main(String[] args) {
        Tutor tutor = new Tutor("박정우", "웹개발");
        System.out.println(tutor.getName());
    }
}
