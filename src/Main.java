public class Main {
    public static void main(String[] args) {
       int currentYear = 2022;


     Human maksim = new Human(35, "Максим", "Минск", "бренд-менеджер");
     Human anya = new Human(-29, "Аня", "Москва", "методист образовательных программ");
     Human katya = new Human(28, null, "Калининград", "продакт-менеджер");
     Human artem = new Human(35, "Артем", "Москва", null);


        System.out.println("Привет! Меня зовут " +maksim.name+" Я из города " +maksim.city+
                " Я родился в " +(currentYear - maksim.age) + " году. Я работаю на должности "+maksim.specialization+", Будем знакомы!");
        System.out.println("Привет! Меня зовут " +anya.name+" Я из города " +anya.city+
                " Я родилась в " +(currentYear - anya.age) + " году. Я работаю на должности "+anya.specialization+", Будем знакомы!");
        System.out.println("Привет! Меня зовут " +katya.name+" Я из города " +katya.city+
                " Я родилась в " +(currentYear - katya.age) + " году. Я работаю на должности "+katya.specialization+ ", Будем знакомы!");
        System.out.println("Привет! Меня зовут " +artem.name+" Я из города " +artem.city+
                " Я родился в " +(currentYear - artem.age) + " году. Я работаю на должности "+artem.specialization+ ", Будем знакомы!");
    }
}