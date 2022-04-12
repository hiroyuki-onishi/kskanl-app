package com.example.demo.model;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="dwh_ticket", schema="zendesk")
public class DwhTicket {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Integer ticket_id;
	private String type;
    private String subject;
    private String description;
    private String priority;
    private String status;
    private String products;
    private String products_1;
    private String products_2;
    private String products_3;
    private String satisfaction;
    private String comment;
    private Timestamp created_date;
    private Timestamp updated_date;
    private String sosiki_name;
    private String user_name;
    private String email;
    private String syain_name;
    private String syain_group_name;
    private String syain_role;
    private String user_status;
    private Timestamp user_created_date;
    private Timestamp sosiki_created_date;
    private Timestamp user_updated_date;
    private Timestamp sosiki_updated_date;
    private Integer open_duration_days;
    private Timestamp user_last_login_date;
    private Timestamp syain_last_login_date;

    public Integer getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(Integer ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public String getProducts_1() {
		return products_1;
	}
	public void setProducts_1(String products_1) {
		this.products_1 = products_1;
	}
	public String getProducts_2() {
		return products_2;
	}
	public void setProducts_2(String products_2) {
		this.products_2 = products_2;
	}
	public String getProducts_3() {
		return products_3;
	}
	public void setProducts_3(String products_3) {
		this.products_3 = products_3;
	}
	public String getSatisfaction() {
		return satisfaction;
	}
	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public Timestamp getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}
	public String getSosiki_name() {
		return sosiki_name;
	}
	public void setSosiki_name(String sosiki_name) {
		this.sosiki_name = sosiki_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSyain_name() {
		return syain_name;
	}
	public void setSyain_name(String syain_name) {
		this.syain_name = syain_name;
	}
	public String getSyain_group_name() {
		return syain_group_name;
	}
	public void setSyain_group_name(String syain_group_name) {
		this.syain_group_name = syain_group_name;
	}
	public String getSyain_role() {
		return syain_role;
	}
	public void setSyain_role(String syain_role) {
		this.syain_role = syain_role;
	}
	public String getUser_status() {
		return user_status;
	}
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	public Timestamp getUser_created_date() {
		return user_created_date;
	}
	public void setUser_created_date(Timestamp user_created_date) {
		this.user_created_date = user_created_date;
	}
	public Timestamp getSosiki_created_date() {
		return sosiki_created_date;
	}
	public void setSosiki_created_date(Timestamp sosiki_created_date) {
		this.sosiki_created_date = sosiki_created_date;
	}
	public Timestamp getUser_updated_date() {
		return user_updated_date;
	}
	public void setUser_updated_date(Timestamp user_updated_date) {
		this.user_updated_date = user_updated_date;
	}
	public Timestamp getSosiki_updated_date() {
		return sosiki_updated_date;
	}
	public void setSosiki_updated_date(Timestamp sosiki_updated_date) {
		this.sosiki_updated_date = sosiki_updated_date;
	}
	public Integer getOpen_duration_days() {
		return open_duration_days;
	}
	public void setOpen_duration_days(Integer open_duration_days) {
		this.open_duration_days = open_duration_days;
	}
	public Timestamp getUser_last_login_date() {
		return user_last_login_date;
	}
	public void setUser_last_login_date(Timestamp user_last_login_date) {
		this.user_last_login_date = user_last_login_date;
	}
	public Timestamp getSyain_last_login_date() {
		return syain_last_login_date;
	}
	public void setSyain_last_login_date(Timestamp syain_last_login_date) {
		this.syain_last_login_date = syain_last_login_date;
	}

    
   
}