/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;


public class StudentData {
    String id, lastname, name, number, city, university;
    String msg = null;
    StudentData(String s1, String s2, String s3, String s4, String s5, String s6){
        id = s1;
        lastname = s2;
        name = s3;
        number = s4;
        city = s5;
        university = s6;
        msg += checkId() + checkName() + checkLastname() + checkNumber() + checkCity() + checkUniversity();
        //checkNumber(); //формат корректного номера +7(994)016-44-26
        
    };
    
    
    public String checkId() {
        String s = null;
        if (!id.matches("[0-9]{1,3}")) {
            s = "Incorrect ID!\n";
        }
        return s;
    }
    
    //проверяем фамилию
    public String checkLastname(){
        String s = null;
        boolean correct = true;
        if (!lastname.matches("^([А-ЯЁ][а-яё]{1,19})$")) {
            s = "Incorrect surname!\n";
            correct = false;
        }
        return s;
    }

    //проверяем имя
    public String checkName(){
        boolean correct = true;
        String s = null;
        if (!name.matches("^([А-ЯЁ][а-яё]{1,10})$")) {
            s = "Incorrect name!\n";
            correct = false;
        }
        return s;
        //return correct;
    }

    //проверяем номер телефона
    public String checkNumber(){
        boolean correct = true;
        String s = null;
        if (!number.matches("^[+]7[(][0-9]{3}[)][0-9]{3}-[0-9]{2}-[0-9]{2}$")) {
            s = "Incorrect number phone!\n";
            correct = false;
        }
        return s;
    }

    //проверка города
    public String checkCity(){
        boolean correct = true;
        String s = null;
        if (!city.matches("^[А-ЯЁ][а-яё]+([-][А-ЯЁ][а-яё]+)?$")) {
            s = "Incorrect city!\n";
            correct = false;
        }
        return s;
    }

    //проверка университета
    public String checkUniversity(){
        boolean correct = true;
        String s = null;
        if (!university.matches("^[А-ЯЁ]([А-ЯЁ]+|[а-яё]+)+$")) {
            s = "Incorrect univercity!\n";
            correct = false;
        }
        return s;
    }
   
     
    }

    

