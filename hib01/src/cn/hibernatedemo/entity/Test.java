package cn.hibernatedemo.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	Configuration con = new Configuration().configure();
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.getCurrentSession();
	Dept dept = (Dept) session.get(Dept.class, 7566);
    System.out.println(dept.getDname());
}
	
}