package org.example.Course.Module2.Task8.HappyFamily3;

public class HappyFamilyApp {

    public static void main(String[] args) {

        Pet pet1 = new Pet();
            pet1.setSpecies(Species.DOG);
            pet1.setNickname("Rex");
            pet1.setAge(3);
            pet1.setTrickLevel(45);
            pet1.setHabits(new String[]{"bark", "run"});

        Pet misty = new Pet("Misty", Species.CAT);
        Pet coco = new Pet("Coco", Species.PARROT, 2, 60, new String[]{"talk", "fly"});

        Human michael = new Human("Michael", "Doe", 2000);
        Human anna = new Human("Anna", "Doe", 2001);
        Human john = new Human("John", "Doe", 2022);
        Human emma = new Human("Emma", "Doe", 2024);

        Human lara = new Human();
            lara.setName("Lara");
            lara.setSurname("Green");
            lara.setBirthYear(1959);
            lara.setIq(90);
            lara.setSchedule(new String[][]{
                    {"Monday", "gardening"},
                    {"Tuesday", "knitting"},
                    {"Wednesday", "watch classic movies"},
                    {"Thursday", "visit friends"},
                    {"Friday", "bake cookies"}
                    {DayOfWeek.MONDAY.name(), "gardening"},
                    {DayOfWeek.THURSDAY.name(), "knitting"},
                    {DayOfWeek.WEDNESDAY.name(), "watch classic movies"},
                    {DayOfWeek.THURSDAY.name(), "visit friends"},
                    {DayOfWeek.FRIDAY.name(), "bake cookies"}
            });

        Human david = new Human(
                "David",
                "Green",
                1959,
                95,
                new String[][]{
                        {DayOfWeek.THURSDAY.name(), "go swimming"},
                        {DayOfWeek.FRIDAY.name(), "watch movie"}
                }
        );

        Human sophia = new Human();
            sophia.setName("Sophia");
            sophia.setSurname("Green");
            sophia.setBirthYear(1995);
            sophia.setIq(70);
            sophia.setSchedule(new String[][]{
                    {DayOfWeek.THURSDAY.name(), "practice piano"},
                    {DayOfWeek.FRIDAY.name(), "go hiking"}
            });

        Family doeFamily = new Family(michael, anna);
        Family greenFamily = new Family(david, lara);

 System.out.println("\n============ Demonstrating toString() Output for Human Class ============");        System.out.println(lara);
        System.out.println(sophia);
        System.out.println(david);
        System.out.println(anna);
        System.out.println(john);
        System.out.println(michael);
        System.out.println(emma);
        System.out.println(lara);
        System.out.println("==============================================================================\n");


        System.out.println("\n============ Demonstrating toString() Output for Family Class ============");
        System.out.println(doeFamily);
        System.out.println(greenFamily);
        System.out.println("==============================================================================\n");

        System.out.println("============ Demonstrating All Methods for a Family methods ============");
        System.out.println("\n--- Child ---");
        doeFamily.addChild(john);
        doeFamily.addChild(emma);
        doeFamily.setPet(coco);
        greenFamily.addChild(sophia);
        greenFamily.setPet(misty);

        System.out.println("\n============ Family toString() Output AFTER Adding Children ============");
        System.out.println(doeFamily);
        System.out.println(greenFamily);
        System.out.println("==============================================================================\n");

        if(greenFamily.deleteChild(sophia)){
            System.out.println("Child has been deleted");
        }
        else{
            System.out.println("Child has NOT been deleted");
        }

        if(greenFamily.deleteChild(sophia)){
            System.out.println("Child has been deleted");
        }
        else{
            System.out.println("Child has NOT been deleted");
        }

        if(doeFamily.deleteChild(0)){
            System.out.println("Child has been deleted");
        }
        else{
            System.out.println("Child has NOT been deleted");
        }


        System.out.println("\n============ Family toString() Output AFTER Deleting a Child ============");
        System.out.println(doeFamily);
        System.out.println(greenFamily);
        System.out.println("==============================================================================\n");


        System.out.println("\n--- Pet's Behaviors ---");
        doeFamily.getPet().respond();
        doeFamily.getPet().eat();
        doeFamily.getPet().foul();

        System.out.println("\n--- Testing the feedPet() Method ---");
        doeFamily.feedPet(false);
        doeFamily.feedPet(true);

        System.out.println("===========================================================================================");
    }
}
