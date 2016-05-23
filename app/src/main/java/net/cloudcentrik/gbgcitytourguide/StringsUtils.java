package net.cloudcentrik.gbgcitytourguide;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by ismail on 18/04/16.
 */
public class StringsUtils {

    public static HashMap<String, String> getTemValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "DEMO overview"
        );
        values.put("OPENING_HOURS", "DEMO opening hours");
        values.put("TICKET_PRICE", "DEMO ticket price");
        values.put("TRAVEL_INFO", "DEMO travel information");
        values.put("CONTACT_INFO", "DEMO contact information");
        values.put("ADDRESS", "DEMO address");

        values.put("MAP", "DEMO map image id");
        values.put("GALLERY", "DEMO pictures");

        return values;
    }


    //Stad mesuem values
    public static HashMap<String, String> getStadMesuemValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "history",
                "The Gothenburg Maritime Centre Foundation was established in 1985 with the aim of creating the world’s biggest " +
                        "and best maritime centre. Climb aboard and leave dry land behind you. Set sail for a brand newvworld " +
                        "offering you excitement, adventure and discovery. Climb up the ladders and become a part of the old tales," +
                        " with the salty sea spray in your face and the smell of diesel in your nostrils. Look out over the harbour" +
                        " entrance. At Maritiman you can go to sea without ever casting off."
        );
        values.put("address", "value");
        values.put("contactInfo", "value");
        values.put("openingHours", "value");
        values.put("travelInfo", "value");
        values.put("ticketPrice", "value");

        values.put("picture", "value");

        return values;
    }

    // East India Company data
    public static HashMap<String, String> getEastIndiaCompanyHPValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "history",
                "The old East India Company House (now the City Museum) was once the hub of Sweden's trade with the Far East." +
                        "Most seafaring nations in the 18th century had an East India company which held a monopoly on trade with the East. " +
                        "Scottish merchants were not part of the lucrative dealings of the English, so Scot Colin Campbell, in association " +
                        "with Niclas Sahlgren in Gothenburg, devised an idea for a Swedish East India Company, which would be Sweden's " +
                        "first international trading company.\n\n" +
                        "The company started up in 1731, and the next year the first ship set off for the Far East. This made Gothenburg " +
                        "a European centre of trade in products from China and the East. The main goods were silk, tea, furniture, " +
                        "porcelain, precious stones and other distinctive luxury items."
        );

        values.put("address", "Address: Norra Hamngatan 12, 411 14 Göteborg ");
        values.put("contactInfo", "Address: Norra Hamngatan 12\n" +
                "Stop: Brunnsparken\n" +
                "Phone: +46313683600\n" +
                "E-mail: stadsmuseum@kultur.goteborg.se\n" +
                "Website: http://www.stadsmuseum.goteborg.se");
        values.put("openingHours", "Tuesday and Thursday-Sunday: 10.00-17.00. \n" +
                "Wednesday: 10.00-20.00\n\n");
        values.put("travelInfo", "Tran Stop: Brunnsparken \n" +
                "Or, You can walk for 6/7 minutes from Centralstation to there.\n\n");
        values.put("ticketPrice", "40 Sek ");

        values.put("picture", "value");


        return values;
    }

    // CarlstenFort HP Activity data
    public static HashMap<String, String> getCarlstenFortHPActivity() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "history",
                "At the top of the Marstrand island rests Carlsten Fortress. For more than 300 years, this huge security " +
                        "guard have protected the wooden town below.Today, the fortress is a fascinating and extraordinary " +
                        "experience. Welcome to Marstrand's biggest attraction.\n\n The Carlsten Fort and it´s dramatic " +
                        "history are best experienced on a guided tour. Those who climb up to the roof of the tower are " +
                        "rewarded by a magnificent view of the whole Marstrand archipelago! During the traditional fort " +
                        "festival, life in the 1700's is reconstructed with prisoners, soldiers and the firing of cannons. " +
                        "Dinners, historical meals, conferences, historical re-enactmens etc are also arranged at the fort.\n"
        );
        values.put("address", "NA ");
        values.put("contactInfo", "NA");
        values.put("openingHours", "NA.\n\n");
        values.put("travelInfo", "NA.");
        values.put("ticketPrice", "NA\n\n");

        values.put("picture", "value");

        return values;
    }


    //Alvsborg Castle HP Activity data
    public static HashMap<String, String> getAlvsborgCastleHPActivity() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "history",
                "Älvsborg, also Elfsborg Fortress, is a sea fortress situated on the mouth of the Göta Älv river. It served to protect " +
                        "Sweden's access to the Atlantic Ocean and the nearby settlement of today's Gothenburg and its four predecessors. The " +
                        "fortress was relocated in the 17th century, this New Älvsborg Fortress is still maintained. Of the Old Älvsborg " +
                        "Fortress, only few ruins are visible today in the vicinity of the Carnegie-pier. The new fortress was founded " +
                        "in 1621 by Gustavus Adolphus of Sweden."
        );
        values.put("address", "On the mouth of the Göta Älv river. \n" +
                "413 01 Gothenburg");
        values.put("contactInfo", "Address: Lilla Bommen\n" +
                "Stop: Lilla Bommen\n" +
                "Phone: +4631609670\n" +
                "E-mail: info@strommaskargardsbatar.se\n" +
                "Website: http://www.stromma.se/sv/Goteborg/Turer/Stromma-Skargardsbatar/Batutflykter/Alvsborgs-fastning");
        values.put("openingHours", "Daily 1 July-9 August.\n\n");
        values.put("travelInfo", "The boat ride takes approximately 30 minutes one way and " +
                "departs from Lilla Bommen 10.45, 12.00, 13.15, 14.30.");
        values.put("ticketPrice", "200 Sek\n\n");

        values.put("picture", "value");

        return values;
    }

    // VRANGÅ ISLAND INFORMATION
    public static HashMap<String, String> getVrangoIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "Overview",
                "VRANGÅ Gothenburg's most westerly point. The childhood home of swedish music legend Evert Taube and well worth a visit for it's stunning nature. See the lighthouse and Taube Museum, and swim in some of the west coast's best waters."
        );



        values.put(
                "contact",
                "\n" +
                        "Address: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "travel",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "ticket",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "opening_hours",
                "NA"
        );

        values.put(
                "address",
                "Vinga,Göteborg"
        );

        values.put(
                "key",
                "value"
        );


        return values;
    }

    // VINGA ISLAND INFORMATION
    public static HashMap<String, String> getVingaIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "Overview",
                "Gothenburg's most westerly point. The childhood home of swedish music legend Evert Taube and well worth a visit for it's stunning nature. See the lighthouse and Taube Museum, and swim in some of the west coast's best waters."
        );



        values.put(
                "contact",
                "\n" +
                        "Address: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "travel",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "ticket",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "opening_hours",
                "NA"
        );

        values.put(
                "address",
                "Vinga,Göteborg"
        );

        values.put(
                "key",
                "value"
        );


        return values;
    }

    // HÖNÖ ISLAND INFORMATION
    public static HashMap<String, String> getHonoIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "Overview",
                "HÖNÖ Gothenburg's most westerly point. The childhood home of swedish music legend Evert Taube and well worth a visit for it's stunning nature. See the lighthouse and Taube Museum, and swim in some of the west coast's best waters."
        );



        values.put(
                "contact",
                "\n" +
                        "Address: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "travel",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "ticket",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "opening_hours",
                "NA"
        );

        values.put(
                "address",
                "Vinga,Göteborg"
        );

        values.put(
                "key",
                "value"
        );


        return values;
    }

    // RÖRÖ ISLAND INFORMATION
    public static HashMap<String, String> getRoroIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "Overview",
                "RÖRÖ Gothenburg's most westerly point. The childhood home of swedish music legend Evert Taube and well worth a visit for it's stunning nature. See the lighthouse and Taube Museum, and swim in some of the west coast's best waters."
        );



        values.put(
                "contact",
                "\n" +
                        "Address: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "travel",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "ticket",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "opening_hours",
                "NA"
        );

        values.put(
                "address",
                "Vinga,Göteborg"
        );

        values.put(
                "key",
                "value"
        );


        return values;
    }

    // STYRSÖ ISLAND INFORMATION
    public static HashMap<String, String> getStyrsoIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "Overview",
                " Styrsö Gothenburg's most westerly point. The childhood home of swedish music legend Evert Taube and well worth a visit for it's stunning nature. See the lighthouse and Taube Museum, and swim in some of the west coast's best waters."
        );



        values.put(
                "contact",
                "\n" +
                        "Address: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "travel",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "ticket",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "opening_hours",
                "NA"
        );

        values.put(
                "address",
                "Vinga,Göteborg"
        );

        values.put(
                "key",
                "value"
        );


        return values;
    }


    //Fiskekrogen_Restaurant values
    public static HashMap<String, String> getFiskekrogen_RestaurantValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "history",
                "The Gothenburg Fiskekrogen_Restaurant " +
                        " go to sea without ever casting off."
        );
        values.put("address", "value");
        values.put("contactInfo", "value");
        values.put("openingHours", "value");
        values.put("travelInfo", "value");
        values.put("ticketPrice", "value");

        values.put("picture", "value");

        return values;
    }

    public static HashMap<String, String> getOlearysValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "Overview",
                "O'Learys is one of Sweden's strongest and most well-known brands with satisfied staff members and profitable franchise operators. Up to 3 million people visit our restaurants every year."
        );

        values.put(
                "opening_hours",
                "\n" +
                       " Monday:  16.00-24.00\n"+
                       "Tues-thus:16.00-01.00\n"+
                       "Fri:      13.00-0100\n"+
                       "Sat:      13.00-02.00\n"+
                       "Sun:      16.00-24.00"
        );



        values.put(
                "contact",
                "\n" +
                        " Address:Kungsportsavenyn 9\n"+
                        "Phone: +4631 7304900\n"+
                        "E-mail: avenyn@olearys.se\n"+
                        "Website: http://www.olearys.se/avenyn"
        );

        values.put(
                "address",
                "\n" +
                        " Address:Kungsportsavenyn 9"

        );

        values.put(
                "ticket",
                "NA"
        );
        values.put(
                "key",
                "value"
        );

        return values;

}
    public static HashMap<String, String> getHardRockCafeValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "Overview",
                "\n" +
                        "With a massive global presence, Hard Rock International is one of the world's most globally recognized brands. Hard Rock is also known for its collectible fashion and music-related merchandise, memorable dining experiences, Hard Rock Live performance venues.\n"
        );

        values.put(
                "opening_hours",
                "\n" +
                        "Monday:"+
                "\n"+
        "Kitchen 11:30 - 23:00               Shop 11:30 - 00:00\n"+
        "Restaurant 11:30 - 00:00         Bowling 18:00 - 23:00\n"+
        "Tuesday:"+
                "\n"+
        "Kitchen 11:30 - 23:00               Shop 11:30 - 00:00\n"+
        "Restaurant 11:30 - 01:00         Bowling 18:00 - 23:00\n"+

        "Wednesday:"+
                "\n"+
        "Kitchen 11:30 - 23:00              Shop 11:30 - 00:00\n"+
        "Restaurant 11:30 - 01:00         Bowling 18:00 - 23:00\n"+
        "Thursday:"+
                "\n"+
        "Kitchen 11:30 - 23:00              Shop 11:30 - 00:00\n"+
        "Restaurant 11:30 - 01:00         Bowling 18:00 - 23:00\n"+
        "Friday:"+
                "\n"+
        "Kitchen 11:30 - 23:30               Shop 11:30 - 22:00\n"+
        "Restaurant 11:30 - 03:00         Nightclub 22:00 - 03:00\n"+
       " Bowling 18:00 - 01:00"+
        "Saturday:"+
                "\n"+
        "Kitchen 12:00 - 23:30               Shop 12:00 - 22:00\n"+
        "Restaurant 12:00 - 04:00         Nightclub 22:00 - 04:00\n"+
        "Bowling 12:00 - 01:00\n"+

        "Sunday:"+
                "\n"+
        "Kitchen 12:00 - 23:00\n"+
        "Shop 12:00 - 00:00\n"+
        "Restaurant 12:00 - 00:00\n"+
        "Bowling 12:00 - 21:00"

        );



        values.put(
                "contact",
                "\n" +
                        "Phone: +46(0) 31 10 23 30\n"+
                        " Web: www.hardrock.se\n"+
                        "Email: booking@hardrock.se\n"
        );

        values.put(
                "address",
                "\n" +
                        " Kungsportsavenyn 10, 41136 Göteborg\n" );



        values.put(
                "travel",
                "\n" +
                        "Stop: Valand."+
                        "Take trum no 4(destination:Möndal),\n"+
                         "trum no 7(destination:Tynnered),\n"+
                        "trum no 3(destination:Marklandsgatan)\n"+
                        "from central station.\n"

        );
        values.put(
                "key",
                "value"
        );

        return values;
    }

    // Nordstan Shopping Centre
    public static HashMap<String, String> getNordstanValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "Overview",
                "In Scandinavia's leading shopping centre are 200 shops offering the latest in all possible areas. " +
                        "The largest collection is in fashion - clothing and shoes." +
                        "\n"+
                "\n"+
                        "\n\n"+ "You will also find cosmetics, consumer electronics, sport shops, flowers, toys, home " +
                        "furnishings, banks, liquors, restaurants, pharmacy and much more.The shopping centre is " +
                        "composed of eight blocks under one roof, which really can be nice on a rainy and windy day.\n"
        );

        values.put(
                "opening_hours",
                "\n" +
                        "Mon-Fri: 10-20\n" +
                        "Sat-Sun: 10-18\n\n"

        );



        values.put(
                "contact",
                "\n" +
                        "Phone: +46317008660\n" +
                        "E-mail: info@nordstan.se\n"+
                        "Website: http://www.nordstan.se\n"
        );

        values.put(
                "address",
                "\n" +
                        " Norra Hamngatan\n" );



        values.put(
                "travel",
                "\n" +
                        "Tram Stop: Brunnsparken  \n" +
                        "Or, walk for 3 minutes from Centralstation.\n\n"

        );

        values.put(
                "ticket",
                "Free Entry!\n" +
                        "\n"
        );
        values.put(
                "key",
                "value"
        );

        return values;
    }

}


