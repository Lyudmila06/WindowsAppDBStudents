/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;


public class StudentData {
    String id, lastname, name, number, city, university;
    String msg = "";
    
    StudentData(String s1, String s2, String s3, String s4, String s5, String s6) {
        id = s1;
        lastname = s2;
        name = s3;
        number = s4;
        city = s5;
        university = s6;
        msg += checkId() + checkName() + checkLastname() + checkNumber() + checkCity() + checkUniversity();     
    };
        
    public String checkId() {
        String s = "";
        
        if (!id.matches("[0-9]{1,3}")) {
            s = "ID студента введен некорректно!\n";
            //Incorrect student ID
            
        }
        return s;
    }
    
    //проверяем фамилию
    public String checkLastname(){
        String s = "";
        boolean correct = true;
        if (!lastname.matches("^([А-ЯЁ][а-яё]{1,19})$")) {
            s = "Фамилия студента введена некорректно!\n";
            //Incorrect student surname!
            correct = false;
        }
        return s;
    }

    //проверяем имя
    public String checkName(){
        boolean correct = true;
        String s = "";
        if (!name.matches("^([А-ЯЁ][а-яё]{1,10})$")) {
            s = "Имя студента введено некорректно!\n";
            //Incorrect student name!
            correct = false;
        }
        return s;
        //return correct;
    }

    //проверяем номер телефона
    public String checkNumber(){
        boolean correct = true;
        String s = "";
        if (!number.matches("^[+]7[(][0-9]{3}[)][0-9]{3}[-][0-9]{2}[-][0-9]{2}$")) {
            //s = "Incorrect number phone!\n Example of a correct number: +7(111)111-11-11";
            s = "Номер телефона введен некорректно!\n Пример корректного номера телефона: +7(111)111-11-11\n";
            correct = false;
        }
        return s;
    }

    //проверка города
    public String checkCity(){
        boolean correct = true;
        String s = "";
        if (!city.matches("^[А-ЯЁ][а-яё]+([-][А-ЯЁ][а-яё]+)?$")) {
            s = "Город введен некорректно!\n";
            //Incorrect city!
            correct = false;
        }
        return s;
    }

    //проверка университета
    public String checkUniversity(){
        boolean correct = true;
        String s = "";
        if (!university.matches("^[А-ЯЁ]([А-ЯЁ]+|[а-яё]+)+$")) {
            s = "Наименование университета введено некорректно!\n";
            //Incorrect univercity!
            correct = false;
        }
        return s;
    }
   
     
    }

    

