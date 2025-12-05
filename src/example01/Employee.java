package example01;

import javax.naming.Name;
import java.util.concurrent.Phaser;

public class Employee {
    //1.상태 만들기
    private String name;
    private String phone; //전화번호의 010은 int로 넣을경우 그냥 10으로 인식해버림
    private String dept;
    private String account;
    private String position;
    private int salary;
    private int empNo;


    //생성자 3개
    Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.dept = "미정";
        this.empNo = 0;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
    }

    Employee(String name, String phone, String dept) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = 0;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
    }

    Employee(String name,
             String phone,
             String dept,
             int empNo,
             int salary,
             String account,
             String position) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = empNo;
        this.salary = salary;
        this.account = account;
        this.position = position;
    }


    void printInfo(){
        System.out.print("이름 :"+name+" / ");
        System.out.print("전화번호 :"+phone+" / ");
        System.out.print("사원번호 :"+empNo+" / ");
        System.out.print("부서명 :"+dept+" / ");
        System.out.print("직급 :"+position+" / ");
        System.out.print("월급 :"+salary+" / ");
        System.out.print("계좌 :"+account+" ");
        System.out.println();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }


    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    //연봉계산 메서드

    public int calcYearSalary(){
        return salary*12;

    }

}
