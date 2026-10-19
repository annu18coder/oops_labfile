class Student {
    int rollNo;
    String name;
    float marks1;
    float marks2;
    float marks3;

    Student(int rollNo, String name, float marks1, float marks2, float marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    double CalculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double CalculatePercentage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    void displayDetails() {
        System.out.println("Roll Number of Student: " + rollNo);
        System.out.println("Name of Student: " + name);
        System.out.println("Marks of Subject 1: " + marks1);
        System.out.println("Marks of Subject 2: " + marks2);
        System.out.println("Marks of Subject 3: " + marks3);
        System.out.println("Total Marks of Student: " + CalculateTotal());
        System.out.println("Percentage of Student: " + CalculatePercentage() + "%");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Nitya", 90, 89, 88);
        s1.displayDetails();

        Student s2 = new Student(102, "Ansh Singh", 97, 79, 78);
        s2.displayDetails();
    }
}
