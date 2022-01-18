package day39.StatesTask;

public class StateObject {
    public static void main(String[] args) {


        Virginia virginia = new Virginia("Virginia", "VA", "Democrats", "Ralph Northam", "Richard Stuart", 8631000, 5.3);

        California california = new California("California", "CA", "Republican", "Gavin Newsom", "Alex Padilla", 39538223, 1.0);

        Texas texas = new Texas("Texas", "TX", "Republicans", "Greg Abbott", "John Cornyn, Ted Cruz", 29183290, 6.25);

        Florida florida = new Florida("Florida", "FL", "Republicans", "Ron DeSantis", "Marco Rubio, Rick Scott", 21538187, 6);

        System.out.println(virginia);
        System.out.println(california);
        System.out.println(texas);
        System.out.println(florida);

    }

}
/*
3. Create a class named StateObjects
					Create the objects of each subclasses

					test all the functions of each objects

            		Analyze the relationships between the classes

 */