// Base class
class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Student: " + name + ", ID: " + id);
    }
}

class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, int id) {
        super(name, id);
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(String name, int id) {
        super(name, id);
    }
}

class Freshman extends UndergraduateStudent {
    public Freshman(String name, int id) {
        super(name, id);
    }

    public void yearInfo() {
        System.out.println(name + " is a Freshman.");
    }
}

class Sophomore extends UndergraduateStudent {
    public Sophomore(String name, int id) {
        super(name, id);
    }

    public void yearInfo() {
        System.out.println(name + " is a Sophomore.");
    }
}

class Junior extends UndergraduateStudent {
    public Junior(String name, int id) {
        super(name, id);
    }

    public void yearInfo() {
        System.out.println(name + " is a Junior.");
    }
}

class Senior extends UndergraduateStudent {
    public Senior(String name, int id) {
        super(name, id);
    }

    public void yearInfo() {
        System.out.println(name + " is a Senior.");
    }
}

class MastersStudent extends GraduateStudent {
    public MastersStudent(String name, int id) {
        super(name, id);
    }

    public void degreeInfo() {
        System.out.println(name + " is a Masters student.");
    }
}

class DoctoralStudent extends GraduateStudent {
    public DoctoralStudent(String name, int id) {
        super(name, id);
    }

    public void degreeInfo() {
        System.out.println(name + " is a Doctoral student.");
    }
}

public class StudentHierarchy {
    public static void main(String[] args) {
        Freshman f = new Freshman("Ali", 101);
        Senior s = new Senior("Ahmed", 104);
        MastersStudent ms = new MastersStudent("Sara", 201);
        DoctoralStudent ds = new DoctoralStudent("Hira", 202);

        f.display(); f.yearInfo();
        s.display(); s.yearInfo();

        ms.display(); ms.degreeInfo();
        ds.display(); ds.degreeInfo();
    }
}
