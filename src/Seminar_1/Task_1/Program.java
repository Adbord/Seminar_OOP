package Task_1;

public class Program {
    public static void main(String[] args){
        // отец
        Human human1 = new Human("Михаил", "Иванович", "Петров", 44);
        // мать
        Human human2 = new Human("Валентина", "Егоровна", "Петрова", 43);
        // дочь
        Human human3 = new Human("Свелана", "Михайловна", "Петрова", 21);
        // дочь
        Human human4 = new Human("Ольга", "Михайловна", "Петрова", 19);
        // сын
        Human human5 = new Human("Сергей", "Михайлович", "Петров", 17);

        // создается Map родитель-ребенок
        Family parent1 = new Family();
        parent1.Parent(human1, human3);
        Family parent2 = new Family();
        parent2.Parent(human1, human4);
        Family parent3 = new Family();
        parent3.Parent(human1, human5);

        // создается Map ребенок-родитель
        Family children1 = new Family();
        children1.Children(human3, human2);
        Family children2 = new Family();
        children2.Children(human4, human2);
        Family children3 = new Family();
        children3.Children(human5, human2);

        // создается Map ребенок-ребенок
        Family sibling1 = new Family();
        sibling1.Sibling(human3, human4);
        Family sibling2 = new Family();
        sibling2.Sibling(human3, human5);
        Family sibling3 = new Family();
        sibling3.Sibling(human5, human4);

        // поиск родителей
        //Family.SearchParents(human3);

        // посик детей
        //Family.SearchChildren(human1);

        // поиск братьев (сестер)
        Family.SearchSibling(human3);

    }



}