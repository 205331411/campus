package	cn.edu.jxnu.rj.domain;


import java.util.Date;


public class Clock_in_target {
	private int clock_in_target_id;
	private String clock_in_target_title;
	private String clock_in_target_content;
	private Date gmt_create;
	private Date gmt_modified;
	private int user_id;
	public void setClock_in_target_id(int clock_in_target_id){
		this.clock_in_target_id = clock_in_target_id;
	}
	public int getClock_in_target_id(){
		return clock_in_target_id;
	}
	public void setClock_in_target_title(String clock_in_target_title){
		this.clock_in_target_title = clock_in_target_title;
	}
	public String getClock_in_target_title(){
		return clock_in_target_title;
	}
	public void setClock_in_target_content(String clock_in_target_content){
		this.clock_in_target_content = clock_in_target_content;
	}
	public String getClock_in_target_content(){
		return clock_in_target_content;
	}
	public void setGmt_create(Date gmt_create){
		this.gmt_create = gmt_create;
	}
	public Date getGmt_create(){
		return gmt_create;
	}
	public void setGmt_modified(Date gmt_modified){
		this.gmt_modified = gmt_modified;
	}
	public Date getGmt_modified(){
		return gmt_modified;
	}
	public void setUser_id(int user_id){
		this.user_id = user_id;
	}
	public int getUser_id(){
		return user_id;
	}
}
