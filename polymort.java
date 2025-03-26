class House {
    public void Blue() {
        System.out.println("The house is blue \n");
    }
}

class School extends House {
    public void Blue() {
        System.out.println("The school is blue \n");
    }
}

class Hospital extends House {
    public void Blue() {
        System.out.println("The hospital is blue \n");
    }
}

public class polymort {
    public static void main(String[] args) {
        House myHouse = new House();
        House mySchool = new School();
        House myHospital = new Hospital();
        myHouse.Blue();
        mySchool.Blue();
        myHospital.Blue();
    }
}