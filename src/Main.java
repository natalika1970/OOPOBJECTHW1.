public class Main {
    public static void main(String[] args) {
       int currentYear = 2022;

        Human maksim = new Human();
        maksim.age = 35;
        maksim.name = "Максим";
        maksim.city = "Минск";
        maksim.specialization = "бренд-менеджер";

        Human anya = new Human();
        anya.age = 29;
        anya.name = "Аня";
        anya.city = "Москва";
        anya.specialization = "методист образовательных программ";

        Human katya = new Human();
        katya.age = 28;
        katya.name = "Kaтя";
        katya.city = "Калининград";
        katya.specialization = "продакт-менеджер";

        Human artem = new Human();
        artem.age = 27;
        artem.name = "Артем";
        artem.city = "Москва";
        artem.specialization = "директором по развитию бизнеса";

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