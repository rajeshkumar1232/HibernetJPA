package com.java.net;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentTest")
public class Student {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "sid")
	    private int id;

	    @Column(name = "sname")
	    private String name;

	    @Column(name = "Addr")
	    private String addr;
	    
	    public void student() {
	    	
	    }

		
	  public Student( String name, String addr) {
			super();
			//this.id = id;
			this.name = name;
			this.addr = addr;
		}


	public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAddr() {
			return addr;
		}


		public void setAddr(String addr) {
			this.addr = addr;
		}


	@Override
	    public String toString() {
	        return "Student [id=" + id + ", Name=" + name + ", Addrress =" + addr + "]";
	    }

}
