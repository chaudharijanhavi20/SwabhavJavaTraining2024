package Models;

public class Student {
	private int rollNo;
    private String name;
    private int age;
    private double percentage;
    
    public Student(int rollNo,String name,int age,double percentage) {
    	this.rollNo=rollNo;
    	this.name=name;
    	this.age=age;
    	this.percentage=percentage;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        percentage = percentage;
    }

    public String grade() {
        if (percentage >= 75) {
            return "A grade";
        } else if (percentage > 60 && percentage < 75) {
            return "B grade";
        } else if (percentage > 50 && percentage < 60) {
            return "C grade";
        } else if (percentage > 40 && percentage < 50) {
            return "D grade";
        } else {
            return "F grade";
        }
    }
}
