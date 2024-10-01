public class Main {
    public static void main(String[] args) {
// задание 1
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName.concat(" ") + firstName.concat(" ") + middleName.concat(" ");
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        // задание 2
        String fullName1 = "Иванов Иван Иванович";
        System.out.println(fullName1.toUpperCase());
        // задание 3
        String fullName2 = "Иванов Семён Семёнович";
        String change = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + change);

    }
}

