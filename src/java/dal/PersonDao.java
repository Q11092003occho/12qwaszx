/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Person;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class PersonDao extends DBContext{
     public void add(Person person){
        try {
            String sql="insert into Person (age,first,last) values (?,?,?);";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1, person.getAge());
            ps.setString(2, person.getFirst());
            ps.setString(3, person.getLast());
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ArrayList<Person> getAll(){
         try {
             String sql="select *from Person";
             PreparedStatement ps=connection.prepareStatement(sql);
             ResultSet rs=ps.executeQuery();
             ArrayList<Person> list=new ArrayList<>();
             while(rs.next()){
                 Person p=new Person();
                 p.setId(rs.getInt("id"));
                 p.setAge(rs.getInt("age"));
                 p.setFirst(rs.getString("first"));
                 p.setLast(rs.getString("last"));
                 list.add(p);
             }
             return list;
         } catch (SQLException ex) {
             Logger.getLogger(PersonDao.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
         
     }
     public void delete(int id){
         try {
             String sql="delete from Person where id=?";
             PreparedStatement ps=connection.prepareStatement(sql);
             ps.setInt(1, id);
             ps.execute();
         } catch (SQLException ex) {
             Logger.getLogger(PersonDao.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     public Person getOne(int id){
         try {
             String sql="select * from Person WHERE id=?";
             PreparedStatement ps=connection.prepareStatement(sql);
             ps.setInt(1, id);
             //truyen vao vi tri  thu nhat gia tri id
             ResultSet rs=ps.executeQuery();
             rs.next();
             Person person=new Person();
             person.setId(rs.getInt("id"));
             person.setAge(rs.getInt("age"));
             person.setFirst(rs.getString("first"));
             person.setLast(rs.getString("last"));
             return person;
             
         } catch (SQLException ex) {
             Logger.getLogger(PersonDao.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
         
     }
     public void update(Person person){
         try {
             String sql="update Person set age=?,first=?,last=? where id=?";
             PreparedStatement ps=connection.prepareStatement(sql);
             ps.setInt(1, person.getAge());
             ps.setString(2, person.getFirst());
             ps.setString(3, person.getLast());
             ps.setInt(4, person.getId());
             ps.execute();
         } catch (SQLException ex) {
             Logger.getLogger(PersonDao.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
}
