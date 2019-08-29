package tws.entity;

public class Employee {

 private String name;
 private int age;
 private int id;
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 public Employee(String name, int age, int id) {
  super();
  this.name = name;
  this.age = age;
  this.id = id;
 }
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public Employee() {
  
 }
}