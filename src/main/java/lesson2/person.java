package lesson2;

public class person {
    private int age;
    private String name;
    private String nameUpper;
    private String ageGroup;

    public person() {
    }

    public boolean checkAge(int age){
        if (age >= 0 && age <= 100) {
            return true;
        } else {return false;}
    }

    public void setAge(int age) {
        if (this.checkAge(age)) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setName (String name) {
        name = name.trim();
        if (name.length()>=3 && name.length()<=50){
            String nameUpper = name.substring(0, 1).toUpperCase() + name.substring(1);
            this.name = nameUpper;
        }

         else
            this.name = "Please write correct name";

    }

    public String getName () {
        return this.name;
    }

    private void setAgeGroup (){
        if (this.age < 15) {
             this.ageGroup = "child";
        }
        else if (this.age <= 25){
             this.ageGroup = "student";
        }
        else if (this.age <= 65){
             this.ageGroup = "worker";
        }
        else
             this.ageGroup = "pensioner";
    }

    public String getAgeGroup (){
        this.setAgeGroup();
        return this.ageGroup;
    }


}
