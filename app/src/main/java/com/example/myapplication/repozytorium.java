package com.example.myapplication;

import java.util.ArrayList;

public class repozytorium {
    private static ArrayList<przepis> przepisy= new ArrayList<>();

    public repozytorium() {
        wstawPrzepisy();
    }

    public static ArrayList<przepis> getPrzepisy() {
        return przepisy;
    }

    public  ArrayList<przepis> wstawPrzepisy(){
        przepisy.add(new przepis("Methamphetamine","desery",1,R.drawable.meth,"Acetone, from paint thinner or polish remover\n" +
                "Battery acid\n" +
                "Iodine crystals\n" +
                "Phosphorous, extracted from flares or matches\n" +
                "Ether or chloroform\n" +
                "Anhydrous ammonia from household cleaners\n" +
                "Sulfuric acid or hydrochloric acid from drain cleaners\n" +
                "Energy drink instead of OTC medications\n" +
                "Toluene from brake fluid\n" +
                "Freon from air-conditioners\n" +
                "Alcohol\n" +
                "Benzene or gasoline\n" +
                "Lithium from car batteries","meth is usually made by combining ephedrine or pseudoephedrine with other chemicals that are often poisonous or highly flammable. The mixture is then added to a solvent such as gasoline and heated to crystallize.\n" +
                "\n" +
                "Because illicit methamphetamine production is not regulated or supervised, and there is no quality control process, any number of cutting agents could conceivably be added to the process to dilute the drug.\n" +
                "\n" +
                "The heating process is particularly dangerous, as there is significant risk of fire and explosion. The waste materials left behind are also highly unstable and combustible. According to the U.S. Forest Service, 1 pound of meth produces up to 6 pounds of toxic waste.2\n" +
                "\n" +
                "There are many detrimental health effects associated with operating a meth lab. Inhaling fumes during methamphetamine production can cause significant lung damage and other respiratory issues, while handling the various corrosive or poisonous chemicals can damage the skin and eyes.\n" +
                "\n" +
                "“Instant Meth” Process\n" +
                "The standard process for producing methamphetamine requires space. Meth labs produce quite a bit of waste products and involve the use of numerous appliances, such as pots and pans for heating, stoves or burners, hoses for ventilation, curtains or other blockages, so individuals from the outside cannot see what is going on inside. This process can be quite expensive and difficult to maintain.\n" +
                "\n" +
                "In addition, these sophisticated laboratories can often be spotted quite easily by legal authorities who are on the lookout for them and present a serious danger for the individuals who work in them, due to the highly unstable process of making methamphetamine and the combustible materials used in the process.\n" +
                "\n" +
                "Some users and manufacturers use a “shake and bake” method to make meth, where ingredients are combined in a plastic or glass container and then shaken and heated. The meth is then extracted. This “instant meth” approach can also be dangerous, as the substance in the containers is very volatile and can explode, particularly when being removed." +
                "\n"+
                "Cutting Meth With Other Substances\n" +
                "Illicitly manufactured methamphetamine may contain numerous cutting agents and chemicals that were improperly separated during production. These often include:\n" +
                "\n" +
                "Red dye. This is common in some forms of methamphetamine where pseudoephedrine is used and the red dye in the tablets has not been washed away, which may make the meth appear reddish or brown.\n" +
                "Methylsulfonylmethane. MSM is a pain reliever used for strengthening cartilage in people or animals, and it is virtually undetectable in meth.\n" +
                "Amphetamines or other stimulants to disguise impurity.\n" +
                "Sulfur that comes from ephedrine sulfate. This may make the meth orange in color.\n" +
                "Copper salts, which may result in a greenish color.\n" +
                "Phosphorus. When phosphorus—an extremely toxic chemical—is used in the manufacturing process and not fully washed out, the meth may have a purplish look to it.\n" +
                "Fentanyl or other synthetic opioids that are fatal in small doses.\n" +
                "Dangers & Risks of Making Meth\n" +
                "Problems with skin abscesses, “meth mouth” (rotting and deteriorating teeth), weight loss, and internal organ damage are all the result of methamphetamine being taken in high doses and the impurities associated with the process of producing meth.\n" +
                "\n" +
                "Physical deterioration can be very rapid in chronic users. The damage associated with chronic use of methamphetamine may not be fully reversible. Individuals may suffer significant organ damage and even brain damage as a result of chronic methamphetamine use."));
        przepisy.add(new przepis("sauce packet cat","ciasteczka",2,R.drawable.sauce,"kot, 2x sos","silly cat :) he so smol"));
        przepisy.add(new przepis("protein shake","napoje",0,R.drawable.giga,"protein, shake","take protein, shake protein, good \uD83D\uDC4D"));
        przepisy.add(new przepis("woda","napoje",0,R.drawable.woda,"woda, naczynie (opcjonalne)","wlej wode do naczynia lub bezpośrednio do otworu gębowego osoby spożywającej"));
        return przepisy;
    }
    public ArrayList<przepis> przepiszkategorii(int nrKategori) {
        ArrayList<przepis> wybranePrzepisy = new ArrayList<>();
        for (przepis p : przepisy) {
            if (p.getNrKategori() == nrKategori) {
                wybranePrzepisy.add(p);
            }
        }
        return wybranePrzepisy;
    }
}
