class CelsiusConverter {
    public double convert(double celsius, String target) {
        switch (target.toLowerCase()) {
            case "kelvin":
                return celsius + 273.15;
            case "fahrenheit":
                return celsius * 9/5 + 32;
            case "reaumur":
                return celsius * 0.8;
            case "rankine":
                return (celsius + 273.15) * 9/5;
            default:
                throw new IllegalArgumentException("Неизвестная цель конвертации: " + target);
        }
    }
}

class CentimeterConverter {
    public double convert(double cm, String target) {
        switch (target.toLowerCase()) {
            case "inch":
                return cm / 2.54;
            case "foot":
                return cm / 30.48;
            case "meter":
                return cm / 100;
            case "yard":
                return cm / 91.44;
            default:
                throw new IllegalArgumentException("Неизвестная цель конвертации: " + target);
        }
    }
}


class KilogramConverter {
    public double convert(double kg, String target) {
        switch (target.toLowerCase()) {
            case "ounce":
                return kg * 35.274;
            case "pud":
                return kg / 16.38;
            case "catty":
                return kg * 2;
            case "gram":
                return kg * 1000;
            default:
                throw new IllegalArgumentException("Неизвестная цель конвертации: " + target);
        }
    }
}

class Employee {

    private String fullName;
    private int age;
    private String position;
    private String department;

    public Employee(String fullName, int age, String position, String department) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.department = department;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + position);
        System.out.println("Отдел: " + department);
    }
}


class EmployeeHierarchy {

    private String position;
    private String department;
    private String boss;
    private String[] subordinates;

    public EmployeeHierarchy(String position, String department,
                             String boss, String[] subordinates) {
        this.position = position;
        this.department = department;
        this.boss = boss;
        this.subordinates = subordinates;
    }

    public void printHierarchy() {
        System.out.println("Должность: " + position);
        System.out.println("Отдел: " + department);
        System.out.println("Начальник: " + boss);

        System.out.println("Подчинённые:");
        for (String emp : subordinates) {
            System.out.println(" - " + emp);
        }
    }
}
