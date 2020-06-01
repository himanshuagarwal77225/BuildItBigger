package com.udacity.jokeproviderjavalib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JokeProvider {

    static List<String> list = asList(
            "I got another letter from this lawyer today. It said 'Final Notice'. Good that he will not bother me anymore. ",
            "What is invisible and smells of worms? - A bird's fart.",
            "A cockroach enters.\n" +
                    "Chinese catches it & eats it!\n" +
                    "\n" +
                    "Another cockroach enters.\n" +
                    "Gujju catches & asks d chinese: Kharidega?\n",
            "Don't be sad when a bird craps on your head. Be happy that dogs can't fly.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "It has four legs and it can fly, what is it? - Two birds.",
            "Wife:\n" +
                    "Jab Tum Desi Sharab peete Ho To Mujhe Paaro Kehte ho\n" +
                    "Beer Peete ho To Darling…\n" +
                    "Par Aaj Bhootni kyun kaha…?\n" +
                    ".\n" +
                    "\n" +
                    ".\n" +
                    "\n" +
                    "Husband:\n" +
                    "Aaj maine SPRITE Pee hai\n" +
                    "\"Seedhi Baat No Bakwas\"\n",
            "How do you rob a snowman? - With a hairdryer.",
            "Son came late…\n" +
                    "Mom: beta kaha gaya tha..??\n" +
                    "\n" +
                    "Beta: – Mom movie dekhne gaya tha.\n" +
                    "\n" +
                    "Mom: Beta Kaunsi..?\n" +
                    "\n" +
                    "Beta: MAA KI MAMTA\n" +
                    "\n" +
                    "Mom: Ja beta upar ja nayi film lagi hai.\n" +
                    "\n" +
                    "Beta: Maa , kaunsi..?\n" +
                    "\n" +
                    "Maa: BAAP KA KEHAR\n", "Saas (bahu se): Bhagwan ne tumhe 2-2 aankhe di. Chawal me se 2-4 pathhar nahi nikal sakti kya.\n" +
                    "Bahu: Very funny! Bhagwan ne tumhe 32 daant diye 2-4 pathhar bhi nahi chaba sakti ?", "husband-talak lena hai,\n" +
                    "advocate-talak lene ke liye 5000rp lagenge,\n" +
                    "husband-pagal ho kya?pandit ne 51rp me shadi kari thi.\n" +
                    "advocate-dekh liye na saste ka Natija!!"
    );

    public static String getJoke() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

}
