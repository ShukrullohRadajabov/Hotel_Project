package org.example.repository;

import org.example.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class AuthRepository {
    private SessionFactory sessionFactory;
    public Employee login(String phoneNumber) {
        Session session = sessionFactory.openSession();
        Query<Employee> query = session.createQuery("from Employee where phone = :phone", Employee.class);
        query.setParameter("phone", phoneNumber);

        Employee employee = session.find(Employee.class, phoneNumber);
        session.close();
        return employee;
    }
}
