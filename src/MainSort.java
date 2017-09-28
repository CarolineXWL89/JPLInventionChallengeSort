import java.util.ArrayList;

/**
 * Created by princ on 27/09/2017.
 */
public class MainSort {
    public static void main(String args[]) {
        /*ArrayList<JPLInterest> ppl = new ArrayList<>();
        UserInput user = new UserInput();
        int i = 18;
        while (i > 0) {
            System.out.println("Name? --> ");
            String name = UserInput.getString();
            System.out.println("Grade? --> ");
            int grade = UserInput.getInt();
            JPLInterest person = new JPLInterest(name, grade);
            ppl.add(person);
            i--;
        }

        ArrayList<JPLInterest> team1 = new ArrayList<>();
        ArrayList<JPLInterest> team2 = new ArrayList<>();
        ArrayList<JPLInterest> team3 = new ArrayList<>();
        int j = 18;
        while (j > 18) {
            int x = (int) (Math.random() * 18);
            int I = 6;
            int II = 6;
            int III = 6;
            while (I > 0) {
                team1.add(new JPLInterest(ppl.get(x).getName(), ppl.get(x).getGrade()));
                I--;
                ppl.remove(x);
                x--;
            }
            while (II > 0) {
                team2.add(new JPLInterest(ppl.get(x).getName(), ppl.get(x).getGrade()));
                I--;
                ppl.remove(x);
                x--;
            }
            while (III > 0) {
                team3.add(new JPLInterest(ppl.get(x).getName(), ppl.get(x).getGrade()));
                I--;
                ppl.remove(x);
                x--;
            }
        }

        for(JPLInterest jpl : team1){
            System.out.print(jpl.getName() + ", ");
        }
        for(JPLInterest jpl : team2){
            System.out.print(jpl.getName() + ", ");
        }
        for(JPLInterest jpl : team3){
            System.out.print(jpl.getName() + ", ");
        }*/

        ArrayList<String> ppl = new ArrayList<>();
        ArrayList<String> team1 = new ArrayList<>();
        ArrayList<String> team2 = new ArrayList<>();
        ArrayList<String> team3 = new ArrayList<>();
        ppl.add("Jolene Lee");
        ppl.add("Luyang Zhang");
        ppl.add("Jula Rosenbluh");
        ppl.add("Dana Lin");
        ppl.add("Elene Wu");
        ppl.add("Elizabeth Bock");
        ppl.add("Caroline Liu");
        ppl.add("Michael Xiong");
        ppl.add("Adam Yang");
        ppl.add("Bryan Rini");
        ppl.add("Alekz Grijalva");
        ppl.add("Sam Clark");
        ppl.add("Nicolo Porcu");
        ppl.add("Daniel Kim");
        ppl.add("Kai Dettman");
        ppl.add("Jaemyung Choi");
        ppl.add("Ben Kim");
        ppl.add("Michael Jia");
        int x = 17;
        while(x >= 12){
            int i = (int)(Math.random()*x);
            String s = ppl.get(i);
            ppl.remove(i);
            team1.add(s);
            x--;
        }
        x = 11;
        while(x >= 6){
            int i = (int)(Math.random()*x);
            String s = ppl.get(i);
            ppl.remove(i);
            team2.add(s);
            x--;
        }
        x = 5;
        while(x >= 0){

            int i = (int)(Math.random()*x);
            String s = ppl.get(i);
            ppl.remove(i);
            team3.add(s);
            x--;
        }
        int y = 5;
        System.out.print("Team 1: ");
        while(y >= 0){
            System.out.println(team1.get(y));
            y--;
        }

        int z = 5;
        System.out.print("Team 2: ");
        while(z >= 0){
            System.out.println(team2.get(z));
            z--;
        }

        int a = 5;
        System.out.print("Team 3: ");
        while(a >= 0){
            System.out.println(team3.get(a));
            a--;
        }
    }
}

