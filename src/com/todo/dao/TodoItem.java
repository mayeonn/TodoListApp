package com.todo.dao;

import java.util.Date;

public class TodoItem {
    private String title;
    private String desc;
    private String current_date;


    public TodoItem(String title, String desc){
        this.title=title;
        this.desc=desc;
        this.current_date=new Date().toString();
    }
    
    public TodoItem(String title, String desc, String currentdate) {
    	this.title=title;
        this.desc=desc;
        this.current_date=currentdate;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }

	@Override
	public String toString() {
		return "[" + title + "] " + desc+" ("+current_date+")";
	}
	
	public String toSaveString() {
		return title + "##" + desc + "##" + current_date ;
	}
    
}
