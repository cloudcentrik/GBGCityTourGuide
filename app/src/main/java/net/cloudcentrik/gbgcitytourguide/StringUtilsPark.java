package net.cloudcentrik.gbgcitytourguide;

import java.util.HashMap;

/**
 * Created by ismail on 27/11/16.
 */

public class StringUtilsPark {
    // Graden START
    //1 Botanical Garden
    /*public static HashMap<String, String> getBotanicalGardenValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "The Gothenburg Botanical Garden (Swedish: Göteborgs botaniska trädgård) is located in Gothenburg, Sweden, and is one of the larger botanical gardens in Europe. The area in total is 175 hectares (ca 430 acres), of which most constitutes a nature reserve including the arboretum. The garden proper is about 40 hectars and here grow something like 16,000 different species and cultivars in various parts of it. Among many fascinating parts of the garden are The Rhododendron Valley, The Japanese Glade and The Rockgarden with it's waterfall. In the Greenhouses you will find about 4,000 various species and cultivars, including some 1,500 orchids, a remarkable travertine department and the rare Eastern Island Tree."
        );
        values.put("OPENING_HOURS", "Daily 9 am to 9 pm");
        values.put("TICKET_PRICE", "Volontary admission fee SEK 20");
        values.put("TRAVEL_INFO", "Nearest Stop: Botaniska Trädgården\n" +
                "Tram: 1, 2, 7 \n" +
                "You can go there by one of the Tram");
        values.put("ADDRESS", "Carl Skottsbergs Gata 22A\n" +
                "SE-413 19 Göteborg\n" +
                "http://www.botaniska.se/");
        values.put("EMAIL", "botaniska.tradgarden@vgregion.se");
        values.put("PHONE", "+46 (0)10-4737777");
        values.put("NAME", "Gothenburg Botanical Garden");
        values.put("MAP", "57.682979, 11.950089, Botanical, Garden");
        values.put("GALLERY", "botanicalgarden1 botanicalgarden2 botanicalgarden3");

        return values;
    }*/

    // Park START
    // 1 Lisaberg Park
    public static HashMap<String, String> getLisabergParkValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Liseberg is an amusement park located in Gothenburg, Sweden, that opened in 1923. It is one of the most visited" +
                        " amusement parks in Scandinavia, attracting about three million visitors annually. Among the noteworthy " +
                        "attractions is the wooden roller coaster Balder, twice (2003 and 2005) voted as the Best Wooden Tracked Roller " +
                        "Coaster in the world in a major international poll.[1] The park itself has also been chosen as one of the top ten" +
                        " amusement parks in the world (2005) by Forbes magazine.\n" +
                        "\n\n" +
                        "Additional to the summer season, the park is also open during November and December, albeit with fewer rides " +
                        "operating, hosting a Halloween season with various house of horros and a Christmas market with traditional Swedish " +
                        "cuisine such as mulled wine and specialties such as d&ouml;ner kebab made from reindeer meat.\n" +
                        "The official colors of Liseberg are pink and green as can be seen on the entrance and the older houses in the park, " +
                        "the colors were also adopted for the logo, which was introduced in the 1980s, but changed in 2013 to the current logo."
        );
        values.put("OPENING_HOURS", "PREMIERE DATE:\n" +
                "Summer season April 23, October 21 Halloween and Christmas at Liseberg 18 November.\n" +
                "Mon-Fri: 11-23 Sun: 11-22");
        values.put("TICKET_PRICE", "Entry: 95 Sek, It has different offers for the rides.");
        values.put("TRAVEL_INFO", "Nearest Stop: Liseberg Or Korsvagen ");
        values.put("CONTACT_INFO", "Phone: +46 31-400 100\n" +
                "E-mail: kontakt@liseberg.se\n" +
                "http://www.liseberg.com/en/home/");
        values.put("ADDRESS", "Address: Orgrytevägen 5, 402 22 Gothenberg");
        values.put("EMAIL", "kontakt@liseberg.se");
        values.put("PHONE", "+46 31-400 100");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.695541, 11.991520, Lisaberg, Park");
        values.put("GALLERY", "liseberg1 liseberg2 liseberg3");

        return values;
    }


    // 2 Slotsskogen Park
    public static HashMap<String, String> getSlotsskogenParkValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "A large park and recreation area in the city. This is Gothenburg's main park. See elks, Gotland ponies, " +
                        "Gute sheep and other Nordic animals in the park zoo. In the summer, there is a petting zoo with piglets and " +
                        "kid goats. Don't miss feeding time for the seals and penguins.\n" +
                        "\n" +
                        "Much of the park is given over to natural parkland with native trees such as linden, beech, maple and various " +
                        "species of oak. The Dawn Redwood and stately Serbian spruce are a few examples of the more exotic plants on display. " +
                        "The azaleas are not native but have become famous in Slottskogen. The petting zoo and pony rides are open from April " +
                        "to September. The large playground Plikta is a favourite for families with children and reason enough for a daytrip. " +
                        "The facilities includes a 15-metre whale to climb on and scheduled activities take place in the park on certain hours.\n"
        );
        values.put("OPENING_HOURS", "Any Time");
        values.put("TICKET_PRICE", "Free entry");
        values.put("TRAVEL_INFO", "Stop: Linnéplatsen");
        values.put("CONTACT_INFO", "Phone: +46313655823\n" +
                "E-mail: parkonatur@ponf.goteborg.se\n" +
                "Website: http://www.goteborg.se/slottsskogen");
        values.put("ADDRESS", "Address: Slottsskogen");
        values.put("EMAIL", "parkonatur@ponf.goteborg.se");
        values.put("PHONE", "+46313655823");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.685893, 11.948587, Slotsskogen, Park");
        values.put("GALLERY", "slotss slottsskogen2 slottsskogen3");

        return values;
    }


    // 3 LindholmenPark
    public static HashMap<String, String> getLindholmenParkValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Lindholmen Science Park is an international collaborative environment for research, innovation and education within the areas Transport, ICT and Media.\n" +
                        "It offers a neutral development environment where industry, academy and public sector can run research and development projects."
        );
        values.put("OPENING_HOURS", "You can visit outside anytime!");
        values.put("TICKET_PRICE", "N/A");
        values.put("TRAVEL_INFO", "Nearest Stop: Lindolmen\n" +
                    "Bus: 16,45,99,55,121,402\n" +
                    "You can go there by one of the bus");
        values.put("CONTACT_INFO", "Lindholmen Science Park AB\n" +
                "Phone: +46 (0)31-764 70 00\n" +
                "Fax: +46 (0)31-764 70 49\n" +
                "Email: info@lindholmen.se");
        values.put("ADDRESS", "Lindholmspiren 5, 417 56 Gothenberg\n" +
                    "http://www.lindholmen.se/en");
        values.put("EMAIL", "info@lindholmen.se");
        values.put("PHONE", "+46 (0)31-764 70 00");
        values.put("NAME", "LindholmenPark");
        values.put("MAP", "57.706830, 11.935716, Lindholmen, Park");
        values.put("GALLERY", "lindholmen1 lindholmen2 lindholmen3");

        return values;
    }

    // Park END TEST
}
