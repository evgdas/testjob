package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String secondName;
    private String bithDate;
    private String adress;
    private String phone;
    private String fakultet;
    private String group;
    private String kurs;

    public static List<Student> getStudentOfFacultet (List<Student> students, String facultet){
    List<Student> studentsOfFacultet=new ArrayList<>();
        for(Student student:students){
        if (student.getFakultet().equals(facultet)){
            studentsOfFacultet.add(student);
        }
    }
    return studentsOfFacultet;
      }
    public static List<Student> getStudentOfKurs (List<Student> students, String kurs){
        List<Student> studentsOfKurs=new ArrayList<>();
        for(Student student:students){
            if (student.getKurs().equals(kurs)){
                studentsOfKurs.add(student);
            }
        }
        return studentsOfKurs;
    }

    public static List<Student> getStudentOfFacultetAndKurs (List<Student> students, String facultet, String kurs){
        List<Student> studentsOfKursAndFacultet=new ArrayList<>();
        for(Student student:students){
            if ((student.getKurs().equals(kurs))&&(student.getFakultet().equals(facultet))){
                studentsOfKursAndFacultet.add(student);
            }
        }
        return studentsOfKursAndFacultet;
    }

    public static List<Student> getStudentsOlderDate(List<Student> students, String dateOlder) throws ParseException {
        List<Student> studentsOlderYear = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy.mm.dd");
        for (Student student : students) {
            Date dateBith = dateFormat.parse(student.getBithDate());
            if (dateBith.getTime()>(dateFormat.parse(dateOlder).getTime())) {
            studentsOlderYear.add(student);
            }
        }
        return studentsOlderYear;
    }
    public Student(int id, String surname, String name, String secondName, String bithDate, String adress, String phone, String fakultet, String group, String kurs) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.bithDate = bithDate;
        this.adress = adress;
        this.phone = phone;
        this.fakultet = fakultet;
        this.group = group;
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", bithDate='" + bithDate + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", fakultet='" + fakultet + '\'' +
                ", group='" + group + '\'' +
                ", kurs='" + kurs + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBithDate() {
        return bithDate;
    }

    public void setBithDate(String bithDate) {
        this.bithDate = bithDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }
}
