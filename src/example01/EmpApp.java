package example01;

public class EmpApp {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        Employee e1 = new Employee("홍길동", "01053427161");
        Employee e2 = new Employee("임꺽정", "0105347161", "디자인팀");
        Employee e3 = new Employee("김시루", "0105734161", "디자인팀", 5, 500000, "1311554242", "과장");
        Employee e4 = new Employee("김뚜이", "01057377161", "디자인팀", 6, 5000000, "1311554242", "이사");
        Employee e5 = new Employee("김만두", "01054327161", "디자인팀", 7, 500000, "1311554242", "사원");
        Employee e6 = new Employee("김밤톨", "0105754161", "디자인팀", 8, 500000, "1311554242", "대리");
        Employee e7 = new Employee("김봄", "01057231261", "디자인팀", 3, 5000000, "1311554242", "팀장");
        Employee e8 = new Employee("김사랑", "0153347161", "디자인팀", 2, 5000000, "1311554242", "사장");
        Employee e9 = new Employee("김뻔순", "0153347161", "디자인팀", 1, 5000000, "1311554242", "사장");
        Employee e10 = new Employee("김망고", "0153347161", "디자인팀", 7, 5000000, "1311554242", "사장");

        employee[0] = e1;
        employee[1] = e2;
        employee[2] = e3;
        employee[3] = e4;
        employee[4] = e5;
        employee[5] = e6;
        employee[6] = e7;
        employee[7] = e8;
        employee[8] = e9;
        employee[9] = e10;

        for (int i = 0; i < employee.length; i++) {
            employee[i].printInfo();
        }

    }
}
