package com.asalfo.jokes;

import java.util.ArrayList;
import java.util.Random;

public class Joker {

    private ArrayList<String> jokes = null;

    public Joker() {
        jokes = new ArrayList<>();
        this.jokes.add("Husband sent a text to wife at night,\n \"Hi I will get late, plz try and wash all my dirty clothes\n" +
                "And make sure you prepare my favorite dish before I return.\" He sent another text, “I forgot to tell u that I got an increase in\n" +
                "My salary at the end of month I’m getting u a new car” \n She text back, “Omg really?”\n" +
                "Husband Replied: “No I just wanted to make sure u got my 1st msg.”" );
        this.jokes.add("True Love is like a pillow.\n" +
                "U could HUG it when Ur in trouble.\n" +
                "U could CRY on it when Ur in pain.\n" +
                "U could EMBRACE it when Ur happy.\n" +
                "Want True Love?\n" +
                "Spend Rs.50 buy a Pillow.");

        this.jokes.add("Dog & Mosquito were in\n" +
                "Love\n" +
                "..\n" +
                "mosquito kissed the dog\n" +
                "..\n" +
                "Dog\n" +
                "became emotional…gave Love bite to\n" +
                "mosquito\n" +
                ".\n" +
                "Mosquito died of Rabies & Dog died of\n" +
                "Dengue\n" +
                ".\n" +
                "MORAL:- LOVE is DANGEROUS \uD83D\uDE1B");
        this.jokes.add("Dog & Mosquito were in\n" +
                "Love\n" +
                "..\n" +
                "mosquito kissed the dog\n" +
                "..\n" +
                "Dog\n" +
                "became emotional…gave Love bite to\n" +
                "mosquito\n" +
                ".\n" +
                "Mosquito died of Rabies & Dog died of\n" +
                "Dengue\n" +
                ".\n" +
                "MORAL:- LOVE is DANGEROUS \uD83D\uDE1B");
        this.jokes.add("A client comes to a bank:\n" +
                "– My cheque was returned with a remark: “Insufficient funds”. I’d like to know whether it refers to mine or the Bank?");
        this.jokes.add("Unlike others your brain is a master piece,\n" +
                "It is divided in 2 parts – Left & Right.\n" +
                "In left nothing is Right & in right nothing is Left!");
        this.jokes.add("Dad’s writes on son’s facebook wall:\n" +
                "Dear Son, how are you? All are fine here. We miss you a lot.\n" +
                "Please turn off the computer and come down for dinner.");
    }

    public String getJoke(){
        Random rand = new Random();
        int randomNum = rand.nextInt(this.jokes.size());
           return this.jokes.get(randomNum);
        }
}
