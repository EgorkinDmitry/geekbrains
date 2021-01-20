package ru.geekbrains.lesson5;

public class HomeworkLesson5 {

    public static void main(String[] args){

        Person[] persArray = new Person[5];
        persArray[0] = new Person
                ("Иванов Иван Петрович", "Инженер", "892312312", 50000, 30);
        persArray[1] = new Person
                ("Петров Вячеслав Сергеевич", "Директор", "89204457890", 100000, 55);
        persArray[2] = new Person
                ("Семёнов Дмитрий Николаевич", "Охранник", "89167767645", 35000, 60);
        persArray[3] = new Person
                ("Сидорова Мария Сергеевна", "Менеджер", "89138539285", 40000, 27);
        persArray[4] = new Person
                ("Васина Зоя Александровна", "Менеджер", "89034453182", 450000, 45);

        int i;

        for (i = 0; i < persArray.length; i++) {
            if (persArray[i].age >= 40) {
            System.out.println(persArray[i].toString());
            }
        }
    }


}
