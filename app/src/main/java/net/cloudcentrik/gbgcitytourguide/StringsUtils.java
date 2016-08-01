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
        values.put("EMAIL", "DEMO email");
        values.put("PHONE", "DEMO phone");
        values.put("NAME", "DEMO Name");

        values.put("MAP", "57.7067050,11.9690680,Brunnsparken,city center");
        values.put("GALLERY", "hono_island styrso_island vinga_island");

        return values;
    }


    // Museum START
    //Stad mesuem values
    public static HashMap<String, String> getStadMesuemValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "The Gothenburg Maritime Centre Foundation was established in 1985 with the aim of creating the world’s biggest " +
                        "and best maritime centre. Climb aboard and leave dry land behind you. Set sail for a brand newvworld " +
                        "offering you excitement, adventure and discovery. Climb up the ladders and become a part of the old tales," +
                        " with the salty sea spray in your face and the smell of diesel in your nostrils. Look out over the harbour" +
                        " entrance. At Maritiman you can go to sea without ever casting off."
        );
        values.put("ADDRESS", "value");
        values.put("CONTACT_INFO", "value");
        values.put("OPENING_HOURS", "value");
        values.put("TRAVEL_INFO", "value");
        values.put("TICKET_PRICE", "value");
        values.put("EMAIL", "DEMO email");
        values.put("PHONE", "DEMO phone");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.7067050, 11.9690680, Brunnsparken, citycenter");

        values.put("GALLERY", "value");

        return values;
    }

    // 1 Maritiman Museum
    public static HashMap<String, String> getMaritimanMuseumValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "The Gothenburg Maritime Centre Foundation was established in 1985 with the aim of creating the world’s biggest " +
                        "and best maritime centre.\n" +
                        "Climb aboard and leave dry land behind you. Set sail for a brand new world offering you excitement, " +
                        "adventure and discovery. Climb up the ladders and become a part of the old tales, with the salty sea spray " +
                        "in your face and the smell of diesel in your nostrils. Look out over the harbour entrance. At Maritiman" +
                        " you can go to sea without ever casting off."
        );
        values.put("OPENING_HOURS", "EASTER HOLIDAY\n" +
                "April 3-12 :11am - 4pm\n" +
                "APRIL :11AM - 4PM\n" +
                "Sat 18 - Sun 19\n" +
                "Sat 25 - Sun 26\n" +
                "MAY : 11AM - 5PM\n" +
                "Open daily\n" +
                "JUNE-AUGUST :10AM - 6PM\n" +
                "Open daily except for Midsummer's Eve the 19th of June when we close at 3pm\n" +
                "SEPTEMBER 11AM - 5PM\n" +
                "Open daily\n" +
                " AUTUMN HOLIDAY\n" +
                "Oct 24-Nov 1 :11am - 4pm");
        values.put("TICKET_PRICE", "Adult 120 SEK\n" +
                "Children (5-15) 70 SEK\n" +
                "Family Ticket 350 SEK\n" +
                "(2 Adults & 2 Children)\n" +
                "Students & Senior Citizens 90 SEK");
        values.put("TRAVEL_INFO", "Take trum no 1,2,3,4,7,11,9 from central station and take off Brunnsparken(Just one stoppage)." +
                "Than take trum 5,10  or Buss 55, 19,18,42 from Platform B.Just take off one stoppage later named Lilla Bommen." +
                "It is situated after next to the Goteborg Opera centre.");
        values.put("CONTACT_INFO", "Phone: +4631105950\n" +
                "E-mail: info@maritiman.se\n" +
                "Website: http://www.maritiman.se");
        values.put("ADDRESS", "Packhusplatsen 12, Gothenburg");
        values.put("EMAIL", "info@maritiman.se");
        values.put("PHONE", "+4631105950");
        values.put("NAME", "Maritiman Museum");

        values.put("MAP", "57.712781, 11.965876, Maritiman, Museum");
        values.put("GALLERY", "maritimanmuseum1 maritimanmuseum2 maritimanmuseum3");

        return values;
    }

    // 2 NaturalHistory Museum
    public static HashMap<String, String> getNaturalHistoryMuseumValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "The museum was founded on 31 October 1833 by the Royal Society science and scholarship in Gothenburg. " +
                        "In 1923, the museum moved into its present premises.In the entrance area, see changing special place, " +
                        "the upper floors, as well as the old buildings house the permanent exhibition. This is mainly to animal models, " +
                        "where aquatic animals occupy a special position. The models include both dermoplastics , painted plaster casts, as well as liquid preparations conserved. Outstanding exhibits are the dermoplastics of 1865 stranded near Gothenburg, young blue whale and the one in 1948 killed in Angola elephants.You can see presentations of the Earth, life in the sea, as well as various kinds of environmental issues."
        );
        values.put("OPENING_HOURS", "Tuesday to Sunday 11:00-17:00.\n" +
                "Open late on wednesdays from March 10: 11:00–20:00.");
        values.put("TICKET_PRICE", "Free admission < 25 years\n" +
                "Adults: 40 SEK annual and valid for some other museums");
        values.put("TRAVEL_INFO", "By tram\n" +
                "Take line 1, 2 or 6 from central station and get off at the stop Linnéplatsen.\n" +
                "By bus\n" +
                "Several bus routes pass near the museum. Choose for example line 25, 52 from Brunnsparken and  " +
                "ROSA or BLUE express from Nordstan. Both Brunnsparken and Nordstan are close to central station.");
        values.put("CONTACT_INFO", "Phone: +4610441401\n" +
                "E-mail: info.naturhistoriska@vgregion.se\n" +
                "Website: http://www.gnm.se");
        values.put("ADDRESS", "Museivägen 10, Slottsskogen, Linnéplatsen");

        values.put("EMAIL", "info.naturhistoriska@vgregion.se");
        values.put("PHONE", "+4610441401");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.689907, 11.949346, NaturalHistory, Museum");
        values.put("GALLERY", "naturhistoriskamuseet1 naturhistoriskamuseet2 naturhistoriskamuseet3");

        return values;
    }

    // 3 City Museum
    public static HashMap<String, String> getCityMuseumValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Explore the exciting pre-history, the 19th century life, the development of the modern industrial Gothenburg " +
                        "and the only exhibited Viking ship in Sweden, Äskekärrsskeppet.The museum is located in the historic " +
                        "East India Company building from the 18th century. Here you can study the remains of how people lived " +
                        "in this part of Sweden 12,000 years ago and see why Gothenburg is called the Swedish Amsterdam."
        );
        values.put("OPENING_HOURS", "Tue and Thu-Sun 10.00-17.00. " +
                "Wed 10.00-20.00.");
        values.put("TICKET_PRICE", "Free admission < 25 years\n" +
                "Adults: 40 SEK annual and valid for some other museums");
        values.put("TRAVEL_INFO", "Take trum no 1,2,3,7,11,9 and take off Brunnsparken(Just one stoppage)." +
                "It is situated after next two building of Goteborg Stad Building ");
        values.put("CONTACT_INFO", "Phone: +46313683600\n" +
                "E-mail: stadsmuseum@kultur.goteborg.se\n" +
                "Website: http://www.stadsmuseum.goteborg.se");
        values.put("ADDRESS", "Norra Hamngatan 12");
        values.put("EMAIL", "stadsmuseum@kultur.goteborg.se");
        values.put("PHONE", "+46313683600");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.706333, 11.963504, City, Museum");
        values.put("GALLERY", "citymuseum1 citymuseum2 citymuseum3");

        return values;
    }

    // 4  Volvo Museum
    public static HashMap<String, String> getVolvoMuseumValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "8000 square meters of cars, buses, machines, engines and unique concepts. All by the local car manufacturer Volvo.\n" +
                        "\n" +
                        "Apart from cars, buses and other vehicles the museum also have exhibitions on Volvo Ocean Race and Volvo Golf Experience."
        );
        values.put("OPENING_HOURS", "Tuesday-Friday 10.00-17.00 " +
                "and Saturday-Sunday 11.00-16.00. May-September also open Monday 10.00-17.00.");
        values.put("TICKET_PRICE", "1 free admission with Göteborg City Card");
        values.put("TRAVEL_INFO", "Stop: Arendal Skans\n" +
                "At first: From Nordstan tram stop to Eketrägata By tram 6, 10 Or by buss 16, 24. \n" +
                "\n" +
                "Stop Eketrägatan, Läge E : Take buss 32 to Arendal Skans stop.");
        values.put("CONTACT_INFO", "Phone: +46313655858\n" +
                "E-mail: tradgardsforeningen@ponf.goteborg.se\n" +
                "Website: http://www.tradgardsforeningen.se");
        values.put("ADDRESS", "Volvo Arendal/Arendal Skans");
        values.put("EMAIL", "tradgardsforeningen@ponf.goteborg.se");
        values.put("PHONE", "+46313655858");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.694774, 11.819454, Volvo, Museum");
        values.put("GALLERY", "volvomuseum1 volvomuseum2 volvomuseum3");

        return values;
    }

    // 5 Universeum
    public static HashMap<String, String> getUniverseumValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Universeum is located in the heart of Gothenburg and is Scandinavia's largest science centre. Throughout its seven floors you can experience life-size dinosaurs, a tropical rainforest, huge aquariums and lots of exciting experiments – on your own or with the Universeum guides.\n" +
                        "\n" +
                        "Explore the Swedish wilderness with its fish and birds, visit our sharks and rays and step into a space station. You can also see snakes and other poisonous animals, go on safari among monkeys, sloths and caimans, learn how nature has inspired new technologies, let really young children try out their dream jobs at Job Land and a whole lot more.\n" +
                        "\n" +
                        "A 25 meter tall kapok tree with suspension bridges take you on adventures and offers impressive views of the rainforest.\n" +
                        "\n" +
                        "Experience the exotic birds, sloths, monkeys, frogs, butterflies and other known and unknown animals. Hike through the rain cave and explore everything from the thriving canyon up to the rainforest canopy.\n" +
                        "Guides, animal keepers and divers make sure there are plenty of fun happening every day at Universeum science centre. See the website for programme events.\n" +
                        "Altogether the Universeum aquariums houses over three million litres of water.\n"
        );
        values.put("OPENING_HOURS", "Open daily 10.00-18.00, during summer (2 July–21 August) 10.00-20.00.");
        values.put("TICKET_PRICE", "Free admission with Göteborg City Card \n" +
                "They have different ticket prices!");
        values.put("TRAVEL_INFO", "Stop: Korsvägen");
        values.put("CONTACT_INFO", "Phone: +46313356450\n" +
                "E-mail: info@universeum.se\n" +
                "Website: http://www.universeum.se");
        values.put("ADDRESS", "Address: Södra vägen 50");
        values.put("EMAIL", "info@universeum.se");
        values.put("PHONE", "+46313356450");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.695558, 11.989418, Universeum, Gothenburg");
        values.put("GALLERY", "universeum1 universeum2 universeum3");

        return values;
    }

    // 6 WorldCulture Museum
    public static HashMap<String, String> getWorldCultureMuseumValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Exhibitions and programs about current questions in the world around us.\n" +
                        "\n" +
                        "In this award-winning building you'll meet the world and experience a mixture of international architecture, contemporary art, seriousness and exciting activities.\n" +
                        "\n" +
                        "The Museum of World Culture is a place for questions, big or small, and for curiosity and dialogue. The museum brings you historic and current issues, offering experiences for all ages. The unique architecture and central location makes the museum a natural meeting point and in Gothenburg.\n" +
                        "Besides, the museum has a rich program with everything from film and theatre to seminars, festivals and performances and a special program with activities for kids and families.\n" +
                        "The magnificent building, inaugurated in 2004, was designed by London based architects Cécile Brisac and Edgar Gonzales."
        );
        values.put("OPENING_HOURS", "Tus, Thu and Fri 12-17, " +
                "Wed 12-20 and Sat and Sun 11-17. ");
        values.put("TICKET_PRICE", "Free admission < 25 years\n" +
                "Adults: 40 SEK annual and valid for some other museums");
        values.put("TRAVEL_INFO", "DEMO travel information");
        values.put("CONTACT_INFO", "Stop: Korsvägen\n" +
                "Phone: +46104561200\n" +
                "E-mail: info@varldskulturmuseet.se\n" +
                "Website: http://www.varldskulturmuseet.se");
        values.put("ADDRESS", "Södra Vägen 54, 412 54 Göteborg");
        values.put("EMAIL", "info@varldskulturmuseet.se");
        values.put("PHONE", "+46104561200");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.694738, 11.989337, WorldCulture, Museum");
        values.put("GALLERY", "worldculturemuseum1 worldculturemuseum2 worldculturemuseum3");

        return values;
    }

    // 7 MuseumOfArt
    public static HashMap<String, String> getMuseumOfArtValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "The art collection is one of the finest in Northern Europe with significant Nordic and international artwork.\n" +
                        "\n" +
                        "Among the collections you'll find masterpieces by Albert Edelfelt, Ernst Josephson, P.S. Krøyer, " +
                        "Carl Larsson, Bruno Liljefors, Edvard Munch, Anders Zorn, Rembrandt, Rubens, Monet, Picasso Chagall " +
                        "and others. The museum also offers temporary exhibitions, family activities, lectures, workshops, " +
                        "guided tours and a shop.\n" +
                        "Gothenburg Museum of Art has three stars in the Michelin Green Guide.\n" +
                        "On the ground floor you'll find small shop and a café."
        );
        values.put("OPENING_HOURS", "Tuseday, Thursday 11.00, Wednesday 11.00-20.00 and Friday-Sunday 11.00-17.00. \n" +
                "The museum is closed during Christmas Eve, Christmas Day, New Years Eve, New Years Day, Good Friday," +
                " Easter Eve, May 1, June 6, Midsummer's Eve and Midsummer's Day.");
        values.put("TICKET_PRICE", "Free admission with Göteborg City Card " +
                "Free admission < 25 years\n" +
                "Adults: 40 SEK annual and valid for some other museums");
        values.put("TRAVEL_INFO", "Stop: Götaplatsen");
        values.put("CONTACT_INFO", "Phone: +46313683500\n" +
                "E-mail: info.konstmuseum@kultur.goteborg.se\n" +
                "Website: http://www.konstmuseum.goteborg.se");
        values.put("ADDRESS", "Götaplatsen 6\n" +
                "412 56 Göteborg");
        values.put("EMAIL", "info.konstmuseum@kultur.goteborg.se");
        values.put("PHONE", "+46313683500");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.696477, 11.980620, MuseumOf, Art");
        values.put("GALLERY", "museumofart1 museumofart2 museumofart3");

        return values;
    }

    // Museum END

    // Historical Place START
    //1 Gustaf Adlofs Square HPActivity
    public static HashMap<String, String> getGustafAdlofsSquareHPHPValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Gustaf Adlofs Square ------------" +
                        "chants were not part of the lucrative dealings of the English, so Scot Colin Campbell, in association " +
                        "with Niclas Sahlgren in Gothenburg, devised an idea for a Swedish East India Company, which would be Sweden's " +
                        "first international trading company.\n\n" +
                        "The company started up in 1731, and the next year the first ship set off for the Far East. This made Gothenburg " +
                        "a European centre of trade in products from China and the East. The main goods were silk, tea, furniture, " +
                        "porcelain, precious stones and other distinctive luxury items."
        );

        values.put("OPENING_HOURS", "Any time");
        values.put("TICKET_PRICE", "Free Access");
        values.put("TRAVEL_INFO", "Tran Stop: Brunnsparken");
        values.put("CONTACT_INFO", "Not Available");
        values.put("ADDRESS", "Gustaf Adolfs torg, 411 10 Göteborg");
        values.put("EMAIL", "Not Available");
        values.put("PHONE", "Not Available");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.707027, 11.967122, Gustaf Adlof's, Square");
        values.put("GALLERY", "gustav_adolf_square1 gustav_adolf_square2 gustav_adolf_square3");

        return values;
    }


    //2 East India Company data
    public static HashMap<String, String> getEastIndiaCompanyHPValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "The old East India Company House (now the City Museum) was once the hub of Sweden's trade with the Far East." +
                        "Most seafaring nations in the 18th century had an East India company which held a monopoly on trade with the East. " +
                        "Scottish merchants were not part of the lucrative dealings of the English, so Scot Colin Campbell, in association " +
                        "with Niclas Sahlgren in Gothenburg, devised an idea for a Swedish East India Company, which would be Sweden's " +
                        "first international trading company.\n\n" +
                        "The company started up in 1731, and the next year the first ship set off for the Far East. This made Gothenburg " +
                        "a European centre of trade in products from China and the East. The main goods were silk, tea, furniture, " +
                        "porcelain, precious stones and other distinctive luxury items."
        );

        values.put("ADDRESS", "Address: Norra Hamngatan 12, 411 14 Göteborg ");
        values.put("CONTACT_INFO", "Address: Norra Hamngatan 12\n" +
                "Stop: Brunnsparken\n" +
                "Phone: +46313683600\n" +
                "E-mail: stadsmuseum@kultur.goteborg.se\n" +
                "Website: http://www.stadsmuseum.goteborg.se");
        values.put("OPENING_HOURS", "Tuesday and Thursday-Sunday: 10.00-17.00. \n" +
                "Wednesday: 10.00-20.00\n\n");
        values.put("TRAVEL_INFO", "Tran Stop: Brunnsparken \n" +
                "Or, You can walk for 6/7 minutes from Centralstation to there.\n\n");
        values.put("TICKET_PRICE", "40 Sek ");
        values.put("EMAIL", "stadsmuseum@kultur.goteborg.se");
        values.put("PHONE", "+46313683600");
        values.put("NAME", "DEMO Name");

        values.put("MAP", "57.706328, 11.963463, East India, Company");
        values.put("GALLERY", "east_india_company_house1 east_india_company_house2 east_india_company_house3");

        return values;
    }

    //3 CarlstenFort HP Activity data
    public static HashMap<String, String> getCarlstenFortHPActivity() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "At the top of the Marstrand island rests Carlsten Fortress. For more than 300 years, this huge security " +
                        "guard have protected the wooden town below.Today, the fortress is a fascinating and extraordinary " +
                        "experience. Welcome to Marstrand's biggest attraction.\n\n The Carlsten Fort and it´s dramatic " +
                        "history are best experienced on a guided tour. Those who climb up to the roof of the tower are " +
                        "rewarded by a magnificent view of the whole Marstrand archipelago! During the traditional fort " +
                        "festival, life in the 1700's is reconstructed with prisoners, soldiers and the firing of cannons. " +
                        "Dinners, historical meals, conferences, historical re-enactmens etc are also arranged at the fort.\n"
        );
        values.put("ADDRESS", "Address: 442 67 Marstrand");
        values.put("CONTACT_INFO", "(+46)303 602 65");
        values.put("OPENING_HOURS", "OPEN ALL YEAR AROUND!");
        values.put("TRAVEL_INFO", "Stop: Marstrands färjeläge . Go by Buss MEXP from Nils Ericson terminalen stop.");
        values.put("TICKET_PRICE", "NA\n\n");
        values.put("EMAIL", "Not Available");
        values.put("PHONE", "(+46)303 602 65");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.886635, 11.578018, Carlsten, Fortress");

        values.put("GALLERY", "carlstenfort1 carlstenfort2 carlstenfort3");

        return values;
    }


    //4 Alvsborg Castle HP Activity data
    public static HashMap<String, String> getAlvsborgCastleHPActivity() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Älvsborg, also Elfsborg Fortress, is a sea fortress situated on the mouth of the Göta Älv river. It served to protect " +
                        "Sweden's access to the Atlantic Ocean and the nearby settlement of today's Gothenburg and its four predecessors. The " +
                        "fortress was relocated in the 17th century, this New Älvsborg Fortress is still maintained. Of the Old Älvsborg " +
                        "Fortress, only few ruins are visible today in the vicinity of the Carnegie-pier. The new fortress was founded " +
                        "in 1621 by Gustavus Adolphus of Sweden."
        );
        values.put("ADDRESS", "On the mouth of the Göta Älv river. \n" +
                "413 01 Gothenburg");
        values.put("CONTACT_INFO", "Address: Lilla Bommen\n" +
                "Stop: Lilla Bommen\n" +
                "Phone: +4631609670\n" +
                "E-mail: info@strommaskargardsbatar.se\n" +
                "Website: http://www.stromma.se/sv/Goteborg/Turer/Stromma-Skargardsbatar/Batutflykter/Alvsborgs-fastning");
        values.put("OPENING_HOURS", "Daily 1 July-9 August.\n\n");
        values.put("TRAVEL_INFO", "The boat ride takes approximately 30 minutes one way and " +
                "departs from Lilla Bommen 10.45, 12.00, 13.15, 14.30.");
        values.put("TICKET_PRICE", "200 Sek\n\n");
        values.put("EMAIL", "info@strommaskargardsbatar.se");
        values.put("PHONE", "+4631609670");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.685718, 11.838562, Alvsborg, Castle");
        values.put("GALLERY", "avsborgcast1 avsborgcast2 avsborgcast3");

        return values;
    }

    // 5 Skansen Kronan
    public static HashMap<String, String> getSkansenKronanValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Skansen Kronan is a redoubt built in the later half of the 17th century according to the plans of Erik Dahlberg. " +
                        "Skansen Kronan was introduced in 1698 and was fitted with 23 guns. The roof was not completed until 1700. " +
                        "Skansen has 4-5 metre thick walls made of granite, gneiss and diabase. Skansen Kronan was never attacked and " +
                        "the cannons on the inside have never been used.\n" +
                        "\n" +
                        "The fortress - originally built outside the city walls - is today situated in the city centre of Gothenburg " +
                        "on a hill in the city district of Haga. It was used as a military museum until 2004. Today Skansen Kronan is " +
                        "a private facility for conferences and private parties."
        );
        values.put("OPENING_HOURS", "Opened \n" +
                "August 11 to October 13  \n" +
                "Thursdays and Fridays 10.00- 15:00  \n" +
                "Guided tours during summer in cooperation with Walknet. Large groups can pre-book all year round. " +
                "Please go to http://www.skansenkronan.se/ for more information.");
        values.put("TICKET_PRICE", "Free admission ");
        values.put("TRAVEL_INFO", "Stop: Prinsgatan . Tram 1, 6 and Bus 60");
        values.put("CONTACT_INFO", "Phone: +46317113033\n" +
                "E-mail: bokning@skansenkronan.se\n" +
                "Website: http://www.skansenkronan.se/");
        values.put("ADDRESS", "Skansberget");
        values.put("EMAIL", "bokning@skansenkronan.se");
        values.put("PHONE", "+46317113033");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.696052, 11.955292, Skansen, Kronan");
        values.put("GALLERY", "skansen_kronan1 skansen_kronan2 skansen_kronan3");

        return values;
    }


    // ISLAND START
    //1 VRANGÅ ISLAND INFORMATION
    public static HashMap<String, String> getVrangoIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Vrango is the most southerly island of the Gothenburg archipelago. Around 380 people live there the whole year round. The island contains a post office, shops, and schools, among other things. Fishing is still an important industry and the there are six working fishing boats on the island. The island is most famous for its beautiful nature reserves and excellent sandy beaches."
        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Address: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "TRAVEL_INFO",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "TICKET_PRICE",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "OPENING_HOURS",
                "Any Time!"
        );

        values.put(
                "ADDRESS",
                "Vrango,Göteborg"
        );
        values.put("EMAIL", "info@walona.se");
        values.put("PHONE", "+46317113450");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.570634, 11.791026, Vrango, Island");
        values.put("GALLERY", "vrango1 vrango2 vrango3");


        return values;
    }

    //2 VINGA ISLAND INFORMATION
    public static HashMap<String, String> getVingaIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Vinga, Gothenburg's most westerly point. The childhood home of swedish music legend Evert Taube and well worth a visit for it's stunning nature. See the lighthouse and Taube Museum, and swim in some of the west coast's best waters."
        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        "ADDRESS: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "TRAVEL_INFO",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "TICKET_PRICE",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "OPENING_HOURS",
                "Any time"
        );

        values.put(
                "ADDRESS",
                "Vinga,Göteborg"
        );
        values.put("EMAIL", "info@walona.se");
        values.put("PHONE", "+46317113450");
        values.put("NAME", "DEMO Name");

        values.put("MAP", "57.633008, 11.606685, Vinga, Island");
        values.put("GALLERY", "vinga1 vinga2 vinga3");

        return values;
    }

    //3 HÖNÖ ISLAND INFORMATION
    public static HashMap<String, String> getHonoIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "A popular island with restaurants, shops and activities.\n" +
                        "In the northern part of the archipelago lies Hönö which has a popular marina and a wide range of activities such as scuba diving and kayaking. For those who are interested in fishing history a visit to the Fishing Museum is recommended. There are several dining options, both pizzerias, cafes and restaurants."
        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Address: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "TRAVEL_INFO",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "TICKET_PRICE",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "OPENING_HOURS",
                "Any time"
        );

        values.put(
                "ADDRESS",
                "Hono Island, Göteborg"
        );

        values.put("EMAIL", "info@walona.se");
        values.put("PHONE", "+46317113450");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.690350, 11.650757, Hono, Island");
        values.put("GALLERY", "hono1 hono2 hono3");


        return values;
    }

    //4 RÖRÖ ISLAND INFORMATION
    public static HashMap<String, String> getRoroIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Rörö is located at the northern end of the archipelago. The island's beautiful nature reserves invite you to walk along their trails. The harbor is one of the better among the islands. In the summer, there is a café, supermarket and marina. You can rent sea kayaks by the hour, day or week. Fishing has characterized Rörö since the 1600s."
        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Address: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "TRAVEL_INFO",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "TICKET_PRICE",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "OPENING_HOURS",
                "NA"
        );

        values.put(
                "ADDRESS",
                "Roro Island ,Göteborg"
        );
        values.put("EMAIL", "info@walona.se");
        values.put("PHONE", "+46317113450");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.771577, 11.620462, Roro, Island");
        values.put("GALLERY", "roro1 roro2 roro3");


        return values;
    }

    //5 STYRSÖ ISLAND INFORMATION
    public static HashMap<String, String> getStyrsoIslandValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                " Styrsö Gothenburg's most westerly point. The childhood home of swedish music legend Evert Taube and well worth a visit for it's stunning nature. See the lighthouse and Taube Museum, and swim in some of the west coast's best waters."
        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Address: Skeppsbron\n" +
                        "Stop: Lilla Torget\n" +
                        "Phone: +46317113450\n" +
                        "E-mail: info@walona.se\n" +
                        "Website: http://www.vinga.org/sv/dagstur-vinga"
        );

        values.put(
                "TRAVEL_INFO",
                "Take a boat trip to the most westerly outpost of the Gothenburg Archipelago.\n" +
                        "\n" +
                        "30 June - 23 August. Day trips Tuseday-Sunday (10.00-16.30) and evening trips Wednesday-Saturday (18.00-22.15)"

        );

        values.put(
                "TICKET_PRICE",
                "adult:  220:- SEK\n" +
                        "Child (7-16 år): 140:- SEK\n" +
                        "Departure Gothenburg  10:00\n" +
                        "Stop at Vinga: 3,5 hour\n" +
                        "Back in Gothenburg 16:30"
        );
        values.put(
                "OPENING_HOURS",
                "Any Time!"
        );

        values.put(
                "ADDRESS",
                "Styrso Island, Göteborg"
        );
        values.put("EMAIL", "info@walona.se");
        values.put("PHONE", "+46317113450");
        values.put("NAME", "DEMO Name");

        values.put("MAP", "57.611620, 11.785106, Styrso, Island");
        values.put("GALLERY", "styrso1 styrso2 styrso3");


        return values;
    }
    // Islands END

    // Restaurant Start
    //1 Fiskekrogen_Restaurant values
    public static HashMap<String, String> getFiskekrogen_RestaurantValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Fiskekrogen is the natural place to enjoy the treasures of the sea. Be enchanted by the fresh fish – straight from the sea, lobsters, langoustines, shrimps, mussels and oysters. It combine top-class cooking with advanced knowledge about fish and shellfish, they also have one of the most initiated wine menus in Sweden. With a love for our product we enjoy serving a simple shellfish plateau as well as a sophisticated tasting menu. At Fiskekrogen you will go on a journey of flavours that will last in your memory, because here we always serve “The best the sea has to offer”."
        );
        values.put("ADDRESS", "Lilla torget 1\n" +
                "411 18 Göteborg");
        values.put("CONTACT_INFO", "value");
        values.put("OPENING_HOURS", "value");
        values.put("TRAVEL_INFO", "value");
        values.put("TICKET_PRICE", "value");
        values.put("EMAIL", "DEMO email");
        values.put("PHONE", "DEMO phone");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.705570 11.961317 Fiskekrogen Restaurant");
        values.put("GALLERY", "fiskekrogen1 fiskekrogen2 fiskekrogen3");

        return values;
    }

    //2 Olearys Restaurant values
    public static HashMap<String, String> getOlearysValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "O'Learys is one of Sweden's strongest and most well-known brands with satisfied staff members and profitable franchise operators. Up to 3 million people visit our restaurants every year."
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        " Monday:  16.00-24.00\n" +
                        "Tues-thus:16.00-01.00\n" +
                        "Fri:      13.00-0100\n" +
                        "Sat:      13.00-02.00\n" +
                        "Sun:      16.00-24.00"
        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        " Address:Kungsportsavenyn 9\n" +
                        "Phone: +4631 7304900\n" +
                        "E-mail: avenyn@olearys.se\n" +
                        "Website: http://www.olearys.se/avenyn"
        );

        values.put(
                "ADDRESS",
                "\n" +
                        " Address:Kungsportsavenyn 9"

        );

        values.put(
                "TICKET_PRICE",
                "NA"
        );
        values.put("TRAVEL_INFO", "DEMO travel information");
        values.put("EMAIL", "avenyn@olearys.se");
        values.put("PHONE", "+4631 7304900");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.701097, 11.973467, Olearys, Restaurant");
        values.put("GALLERY", "olearys1 olearys2 olearys3");

        return values;

    }

    // 3 HardRock Cafe Values
    public static HashMap<String, String> getHardRockCafeValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "\n" +
                        "With a massive global presence, Hard Rock International is one of the world's most globally recognized brands. Hard Rock is also known for its collectible fashion and music-related merchandise, memorable dining experiences, Hard Rock Live performance venues.\n"
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        "Monday:" +
                        "\n" +
                        "Kitchen 11:30 - 23:00               Shop 11:30 - 00:00\n" +
                        "Restaurant 11:30 - 00:00         Bowling 18:00 - 23:00\n" +
                        "Tuesday:" +
                        "\n" +
                        "Kitchen 11:30 - 23:00               Shop 11:30 - 00:00\n" +
                        "Restaurant 11:30 - 01:00         Bowling 18:00 - 23:00\n" +

                        "Wednesday:" +
                        "\n" +
                        "Kitchen 11:30 - 23:00              Shop 11:30 - 00:00\n" +
                        "Restaurant 11:30 - 01:00         Bowling 18:00 - 23:00\n" +
                        "Thursday:" +
                        "\n" +
                        "Kitchen 11:30 - 23:00              Shop 11:30 - 00:00\n" +
                        "Restaurant 11:30 - 01:00         Bowling 18:00 - 23:00\n" +
                        "Friday:" +
                        "\n" +
                        "Kitchen 11:30 - 23:30               Shop 11:30 - 22:00\n" +
                        "Restaurant 11:30 - 03:00         Nightclub 22:00 - 03:00\n" +
                        " Bowling 18:00 - 01:00" +
                        "Saturday:" +
                        "\n" +
                        "Kitchen 12:00 - 23:30               Shop 12:00 - 22:00\n" +
                        "Restaurant 12:00 - 04:00         Nightclub 22:00 - 04:00\n" +
                        "Bowling 12:00 - 01:00\n" +

                        "Sunday:" +
                        "\n" +
                        "Kitchen 12:00 - 23:00\n" +
                        "Shop 12:00 - 00:00\n" +
                        "Restaurant 12:00 - 00:00\n" +
                        "Bowling 12:00 - 21:00"

        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Phone: +46(0) 31 10 23 30\n" +
                        " Web: www.hardrock.se\n" +
                        "Email: booking@hardrock.se\n"
        );

        values.put(
                "ADDRESS",
                "\n" +
                        " Kungsportsavenyn 10, 41136 Göteborg\n");


        values.put(
                "TRAVEL_INFO",
                "\n" +
                        "Stop: Valand." +
                        "Take trum no 4(destination:Möndal),\n" +
                        "trum no 7(destination:Tynnered),\n" +
                        "trum no 3(destination:Marklandsgatan)\n" +
                        "from central station.\n"

        );
        values.put("EMAIL", "booking@hardrock.se");
        values.put("PHONE", "+46(0) 31 10 23 30");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.701289, 11.974197, HardRock, Cafe");
        values.put("GALLERY", "hardrockcafe1 hardrockcafe2 hardrockcafe3");

        return values;

    }

    //4 JohnScotts Restaurant
    public static HashMap<String, String> getJohnScottsRestaurantValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "John Scott's found in Linnaeus has a historical explanation. Linnegatan is named after Carl Linnaeus, who is best known for his knowledge of plants and animals. But Carl Linnaeus also had a great interest in beer, just as John Scott's has."
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        "Mon-Tue:   11:30 - 00:00\n" +
                        "Wed-Fri    11:30 - 01:00\n" +
                        "Sat-Sun    12:00 - 01:00\n"
        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        " Telefon: 031-80 75 50\n" +
                        "E-post: palace@johnscotts.se\n"
        );

        values.put(
                "ADDRESS",
                "\n" +
                        " John Scott's Palace, Södra Hamngatan 2"

        );

        values.put(
                "TICKET_PRICE",
                "NA"
        );
        values.put("TRAVEL_INFO", "3 min Walking distance from central station.\n  " +
                "Close to brunnsparken tram stop");
        values.put("EMAIL", "palace@johnscotts.se");
        values.put("PHONE", "031-80 75 50");
        values.put("NAME", "DEMO Name");

        values.put("MAP", "57.706980, 11.970779, JohnScotts, Restaurant");
        values.put("GALLERY", "johnscott1 johnscott2 johnscott3");

        return values;

    }


    //5 JoeFerellis Restaurant
    public static HashMap<String, String> getJoeFerellisRestaurantValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Joe Farelli’s is a popular meeting place in the middle of Gothenburg’s main street, Kungsportsavenyn. the American-inspired kitchen serves everything from juicy steaks and burgers to pasta and authentic wood oven baked pizzas."
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        "Mon – Thu: 11.30 – 01.00\n" +
                        "Fri :      11.30 – 02.00\n" +
                        "Sat :      12.00 – 03.00\n" +
                        "Sun :      12.00 – 01.00"
        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Phone: +4631105826\n" +
                        "E-mail: info@joefarelli.com\n" +
                        "Website: http://www.joefarelli.com"
        );

        values.put(
                "ADDRESS",
                "\n" +
                        "Kungsportsavenyn 12, Goteborg 41136"

        );

        values.put(
                "TICKET_PRICE",
                "NA"
        );
        values.put("TRAVEL_INFO", "Stop: Valand. Take trum no 4(destination:Möndal),\n " +
                "7(destination:Tynnered),\n " +
                "3(destination:Marklandsgatan) from central station.");

        values.put("EMAIL", "info@joefarelli.com");
        values.put("PHONE", "+4631105826");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.701262, 11.974533, JoeFerellis, Restaurant");
        values.put("GALLERY", "joefarellis1 joefarellis2 joefarellis3");

        return values;

    }

    // Restaurant END


    public static HashMap<String, String> getInfoCenterValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "HÖNÖ Gothenburg's most westerly point. The childhood home of swedish music legend Evert Taube and well worth a visit for it's stunning nature. See the lighthouse and Taube Museum, and swim in some of the west coast's best waters."
        );
        return values;
    }

    // SHOPPING CENTRES  START

    // 1 Nordstan Shopping Centre
    public static HashMap<String, String> getNordstanValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "In Scandinavia's leading shopping centre are 200 shops offering the latest in all possible areas. " +
                        "The largest collection is in fashion - clothing and shoes." +
                        "\n" +
                        "\n" +
                        "\n\n" + "You will also find cosmetics, consumer electronics, sport shops, flowers, toys, home " +
                        "furnishings, banks, liquors, restaurants, pharmacy and much more.The shopping centre is " +
                        "composed of eight blocks under one roof, which really can be nice on a rainy and windy day.\n" +
                        "-----If you need assistance finding the right things you can pay the Tourist Centre a visit, " +
                        "it's located in the centre of Nordstan. Here you get the best Gothenburg tips and get to know " +
                        "what's going on in Nordstan, because there is always something going on. Fashion shows, " +
                        "exhibitions, launches, contests and shows can be seen here annually. Around Christmas time and in " +
                        "the summer the popular handicraft and design market is organized. It's easy and convenient to park in " +
                        "the Nordstan parking garage, it's always open and has a lot of spaces."
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        "Mon-Fri: 10-20\n" +
                        "Sat-Sun: 10-18\n\n"

        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Phone: +46317008660\n" +
                        "E-mail: info@nordstan.se\n" +
                        "Website: http://www.nordstan.se\n"
        );

        values.put(
                "ADDRESS",
                "\n" +
                        " Norra Hamngatan\n");


        values.put(
                "TRAVEL_INFO",
                "\n" +
                        "Tram Stop: Brunnsparken  \n" +
                        "Or, walk for 3 minutes from Centralstation.\n\n"

        );

        values.put(
                "TICKET_PRICE",
                "Free Entry!\n" +
                        "\n"
        );
        values.put("EMAIL", "info@nordstan.se");
        values.put("PHONE", "+46317008660");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.708692,11.969067, Nordstan, Shopping Centre");
        values.put("GALLERY", "nordstan1 nordstan2 nordstan3");

        return values;
    }

    // 2 NORDISKA KOMPANIET(NK) Shopping Centre
    public static HashMap<String, String> getNordiskaValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Situated in the heart of the city, NK’s four storeys and 45 departments of fashion, beauty and interior " +
                        "design is one of Gothenburg's biggest shopping venues. Here you can find a mix of leading Swedish " +
                        "and international brands.\n" +
                        "The store has many departments: children, ladies, men, books and stationery, sport, lingerie, " +
                        "shoes, bags, accessories, foot care, hairdressing, manicure, facial treatments, florist, glassware," +
                        " chinaware, kitchen, hair and cosmetics, dry cleaning, shoemaker and key service. NK service center on " +
                        "the lower floor will help with transportation and shipping.\n"
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        "Mon-Fri: 10-19\n" +
                        "Sat: 10-17\n"+
                        "Sun: 10-16\n\n"
        );


        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Phone: +46317101000\n" +
                        "E-mail: servicecenter.gbg@nk.se\n" +
                        "Website: http://www.nk.se/sv/nk-goteborg/\n"
        );

        values.put(
                "ADDRESS",
                "\n" +
                        " Address: Östra Hamngatan 42\n");


        values.put(
                "TRAVEL_INFO",
                "\n" +
                        "Tram Stop: Brunnsparken  \n" +
                        "Or, walk for 3 minutes from Centralstation.\n\n"

        );

        values.put(
                "TICKET_PRICE",
                "Free Entry!\n"

        );
        values.put("EMAIL", "servicecenter.gbg@nk.se");
        values.put("PHONE", "+46317101000");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.706350, 11.969555, Nordiska, Shopping Centre");
        values.put("GALLERY", "nordiskakompaniet1 nordiskakompaniet2 nordiskakompaniet3");

        return values;
    }



    // 3 Frölunda Torg Shopping Centre
    public static HashMap<String, String> getFrolundaTorgValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "At Frölunda Torg shopping center there's a mix of large retailers and small upcoming and trendy " +
                        "shops selling everything from fashion and home furnishing to sports and cosmetics.\n" +
                        "For thoes interested in food there's a market square where you'll find italian delicacies, " +
                        "coffée. fresh fish and seafood. Frölunda Torg has all of this under one roof with free parking just outside.\n"
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        "Mon-Fri: 10-20\n" +
                        "Sat: 10-18\n"+
                        "Sun: 10-17\n\n"
        );

        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Phone: +46317343560\n" +
                        "E-mail: info@frolundatorg.se\n" +
                        "Website: http://frolundatorg.se/\n"
        );

        values.put(
                "ADDRESS",
                "\n" +
                        "Address: Frölunda Torg\n"
        );

        values.put(
                "TRAVEL_INFO",
                "\n" +
                        "Tram Stop: Frölunda Torg  \n" +
                        "Take Tram 1, 7, 8 or Buss 50 \n" +
                        "It will take 40 minutes.\n"

        );

        values.put(
                "TICKET_PRICE",
                "Free Entry!\n" +
                        "\n"
        );
        values.put("EMAIL", "info@frolundatorg.se");
        values.put("PHONE", "+46317343560");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.652060, 11.911981, Frolunda, Torg");
        values.put("GALLERY", "frolundatorggbg1 frolundatorggbg2 frolundatorggbg3");

        return values;
    }


    // 4 Arkaden Shopping Centre
    public static HashMap<String, String> getArkadenShopingCenterValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Arkaden opened in 1899. A lot has changed since then, but the mall is still a central part of the " +
                        "Gothenburg fashion scene.\n" +
                        "The gallery has 25 shops over three floors, with a focus on fashion, design and home decor. " +
                        "Here you find the latest from trendy brands in shops like Topshop, Raglady, Zara, Beyond Retro, " +
                        "MQ and The North Face.\n" +
                        "-----If arrive by car, it's easy and convenient to park in the parking garage P-Hus City, Östra Larmgatan 3-7. Not included in the City Card. \n" +
                        "\n" +
                        "When you buy a Gothenburg City Card you get a book of discount coupons valid in Arkaden. " +
                        "Pick up the vouchers at the Gothenburg Tourist Centre at Kungsportsplatsen or in Nordstan"
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        "Mon-Fri: 10-20\n " +
                        "Sat: 10-18\n " +
                        "Sun: 10-17\n\n"
        );

        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Phone: +46317434200\n" +
                        "Website: http://www.arkaden.nu/\n"
        );

        values.put(
                "ADDRESS",
                "\n" +
                        "Address: Fredsgatan 1\n"
        );

        values.put(
                "TRAVEL_INFO",
                "\n" +
                        "Stop: Brunnsparken \n" +
                        "It's just beside the tram stop.\n"

        );

        values.put(
                "TICKET_PRICE",
                "Free Entry!\n" +
                        "\n"
        );
        values.put("EMAIL", "DEMO email");
        values.put("PHONE", "+46317434200");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.706497, 11.969985, Arkaden, Shopping Centre");
        values.put("GALLERY", "arkaden1 arkaden2 arkaden3");

        return values;
    }
    // SHOPPING CENTRES  END

    // Lakes values start
    //1 Delsjon Lake
    public static HashMap<String, String> getDelsjonValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Delsjön is a huge area with a variety of lakes and lots of forest. The forest seems never-ending and you " +
                        "can walk without seeing anyone else once you get off the main tracks. Swim in Delsjön (or ice skate " +
                        "on it in winter) or rent canoes and kayaks. There are two good cafes - Lyktan which is just near the " +
                        "main parking area and Bertilssons Cafe which you can also drive to. It is lovely in the spring when " +
                        "the flowers are in bloom and the trees are just turning green.\n" +
                        "\n" +
                        "Delsjön consist of two coherent lakes, Stora Delsjön and Lilla Delsjön, located in eastern Gothenburg, " +
                        "in the Delsjöområdet nature reserve. They serve as a reservoir for the city, receiving water from the " +
                        "Göta River. At the shore of Stora Delsjön there is a popular beach.  \n"
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        "Any time you can visit there.\n\n"
        );

        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Phone: 010-224 40 00\n"
        );

        values.put(
                "ADDRESS",
                "\n" +
                        "Delsjön, 413 04 Göteborg\n"
        );

        values.put(
                "TRAVEL_INFO",
                "\n" +
                        "Tram Stop: Töpelsgatan \n" +
                        "From tram stop you have to walk about 20 minutes to Delsjön\n"+
                        "Take Tram 5 from Brunnsparken stop to Ästra kjuhuset direction \n"

        );

        values.put(
                "TICKET_PRICE",
                "Free Entry!\n" +
                        "\n"
        );
        values.put("EMAIL", "Not Available!");
        values.put("PHONE", "010-224 40 00");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.688867, 12.034804, Delsjon, Lake");
        values.put("GALLERY", "delsjonlake1 delsjonlake2 delsjonlake3");

        return values;
    }

    //2 Harlanda Tjarn Lake
    public static HashMap<String, String> getHarlandaTjarnValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Harlanda Tjarn is a small lake, stretching on the territory of Sävenäs , Kålltorp and Delsjön " +
                        "in eastern Gothenburg. In the summer, this is a popular swimming spot for families with " +
                        "children residing in the three neighborhoods listed above.\n" +
                        "Aside swimming areas, Härlanda Tjärn offers excellent facilities, including beach, showers, " +
                        "playground, kiosk and public toilets. This shallow swimming area is also known as the “pee Gulf”" +
                        " as many many families come here with their toddlers, and the small kiddies wee in the water. \n"
        );

        values.put(
                "OPENING_HOURS",
                "\n" +
                        "Any time you can visit there.\n\n"
        );

        values.put(
                "CONTACT_INFO",
                "\n" +
                        "Not Available!");

        values.put(
                "ADDRESS",
                "\n" +
                        "Härlanda Tjärn\n"
        );

        values.put(
                "TRAVEL_INFO",
                "\n" +
                        "Bus Stop: ?? \n" +
                        "From Bus stop you have to walk about 10 minutes to Härlanda Tjärn\n"+
                        "Take Bus 17 from centralstation stop to Kålltorp direction \n"

        );

        values.put(
                "TICKET_PRICE",
                "Free Entry!\n\n"
        );
        values.put("EMAIL", "Not Available!");
        values.put("PHONE", "Not Available!" +
                "You may contact Information Centre!!");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.710019, 12.053979, Harlanda, Tjarn");
        values.put("GALLERY", "harlandatjarn1 harlandatjarn2 harlandatjarn3");

        return values;
    }

    /*

        // 3 Aspen Lake
        public static HashMap<String, String> getAspenValues() {
            HashMap<String, String> values = new HashMap<String, String>();

            values.put(
                    "OVERVIEW",
                    "Aspen is a lake of Botkyrka Municipality, Södermanland, Sweden.[1] The lake is crossed by the European " +
                            "route E4/European route E20 and is located about 20 kilometres southwest of Stockholm, the Swedish " +
                            "capital. It has an area of 1,847 km².[citation needed]\n" +
                            "During the Stone Age, Aspen was in the ocean, but was uplifted by the time of the Bronze Age. " +
                            "Bronze Age settlements grew up around the lake and for some thousand years Iron Age farms were around " +
                            "the lake. The area developed during this period.[2] A graveyard from that period is preserved in the area.\n" +
                            "Skrävsta Ekholmen nature reserve is in the vicinity of the lake with about sixty large oak trees, " +
                            "half of which are centuries old. There are large bats and many other rare animal and plant species. Around the lake is a nature trail at 7½ km length. The path leads through the woods, high above the marsh.\n" +
                            "Surface elevation: 18 m\n" +
                            "Area: 1,847 km²\n" +
                            "Length: 3.5 km\n" +
                            "Width: 950 m\n" +
                            "Catchment area: 7.97 km²\n" +
                            "Shore length: 11.95 km\n"
            );

            values.put(
                    "OPENING_HOURS",
                    "\n" +
                            "Any time you can visit there.\n\n"
            );

            values.put(
                    "CONTACT_INFO",
                    "\n" +
                            "Telephone:0302-711 66\n"
            );

            values.put(
                    "ADDRESS",
                    "\n" +
                            "Seglarvägen 25, 443 30 Lerum\n"
            );

            values.put(
                    "TRAVEL_INFO",
                    "\n" +
                            "By car \n" +
                            "or by train from Centralstation to Jonsered. " +
                            "It will take 20 minutes to go there. \n"

            );

            values.put(
                    "TICKET_PRICE",
                    "Train ticket 40 kr. " +
                            "Centralstation to Jonsered!\n\n"
            );
            values.put("MAP", "57.7067050 11.9690680 Brunnsparken citycenter");
            values.put("GALLERY", "vandrarhemhotel1 vandrarhemhotel2 vandrarhemhotel3");

            return values;
        }
    */
    //3 Berjson Lake
    public static HashMap<String, String> getBerjsonLakeValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "A beautiful lake area north-east of the city centre.Bergsjön is a forest lake with nice rocks, " +
                        "bathing platforms and a diving tower. "
        );
        values.put("OPENING_HOURS", "Any time you can visit there.");
        values.put("TICKET_PRICE", "Free Entry!");
        values.put("TRAVEL_INFO", "Stop: Atmosfärgatan");
        values.put("CONTACT_INFO", "Not Available!");
        values.put("ADDRESS", "Atmosfärgatan 15");

        values.put("EMAIL", "Not Available!");
        values.put("PHONE", "Not Available!" +
                "You may contact Information Centre!!");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.748679, 12.064137, Berjson, Lake");
        values.put("GALLERY", "berjsonlake1 berjsonlake2 berjsonlake3");

        return values;
    }
    //4 Surtesjon Lake
    public static HashMap<String, String> getSurtesjonLakeValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "A relatively large lake with two swimming areas. Included in Vättlefjälls nature reserve with sandy beaches, " +
                        "rocky beaches, flat lawns and barbecue. Take a walk around the lake and experience the wilderness just " +
                        "around town. Here you can also rent a canoe. From June 4 to August 31 are bathing hosts at Surtesjön.Equipment: " +
                        "Jetty, barbecue. Two outdoor toilets open from 15 May to 15 September. Nearest stop: Persiljegatan. " +
                        "From the bus stop is 515 meters to the swimming area."
        );
        values.put("OPENING_HOURS", "Any time you can visit there.");
        values.put("TICKET_PRICE", "Free Entry!");
        values.put("TRAVEL_INFO", "Stop: Persiljegatan");
        values.put("CONTACT_INFO", "031-365 00 00");
        values.put("ADDRESS", "Persiljegatan");

        values.put("EMAIL", "Not Available!");
        values.put("PHONE", "(+46)31 365 00 00");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.829139, 12.033371, Surtesjon, Lake");
        values.put("GALLERY", "surtesjonlake1 surtesjonlake2 surtesjonlake3");

        return values;
    }

    //5 SvarteMosse Lake
    public static HashMap<String, String> getSvarteMosseLakeValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Svarte Mosse naturområde ligger i Biskopsgården, på Hisingen. Här finns hällmarker, kärr och tjärnar." +
                        " Det är ett rekreationsområde med löpspår och naturstigar. Här finns många skyddsvärda arter samt " +
                        "Stora Vette fornborg från år 500. Svarte Mosse, vattenområdet som gett namn till området, är en välbesökt fågellokal."
        );
        values.put("OPENING_HOURS", "Any time you can visit there.");
        values.put("TICKET_PRICE", "Free Entry!");
        values.put("TRAVEL_INFO", "Stop: Temperaturgatan, Väderilsgatan.");
        values.put("CONTACT_INFO", "(+46) 31 365 00 00");
        values.put("ADDRESS", "Temperaturgatan, Väderilsgatan.");

        values.put("EMAIL", "Not Available!");
        values.put("PHONE", "(+46) 31 365 00 00");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.7067050, 11.9690680, Brunnsparken, citycenter");
        values.put("GALLERY", "svartemosselake1 svartemosselake2 svartemosselake3");

        return values;
    }


    // Lakes values END

    // HOTELS START
    // 1 VandrarHem Hotel
    public static HashMap<String, String> getVandrarHemHotelValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Gothenburg Hostel is a family owned good standard hostel situated in central Gothenburg. We have bright, clean and cozy rooms. The hostel is open all year around and has approximately 200 beds in 47 rooms.\n" +
                        "Showers and toilets can be found nearby the rooms, a couple of rooms have private showers and toilets. All showers and toilettes are totally refurnished in 2013. All romms have windows and four rooms have opening skylights.\n" +
                        "\n" +
                        "-----Free WiFi, TV lounge, guest kitchen with dining area and a large terrace where you can eat breakfast and sunbath.\n" +
                        "\n" +
                        "!!---Please note that the hostel is smoke and pet-free. \t\t \t "
        );
        values.put("OPENING_HOURS", "THE FRONT DESK IS OPEN:\n" +
                "Monday - Sunday 8am - 4pm\n" +
                "\n" +
                "CHECK-IN: 2-4pm.\n" +
                "Please contact us for late arrival!\n" +
                "CHECK-OUT: before 10:00 am");
        values.put("TICKET_PRICE", "Contact VandrarHem");
        values.put("TRAVEL_INFO", "Gothenburg Vandrarhem is located close to the south entrance of Liseberg amusement park. " +
                "It only takes a few minutes to walk from the Universeum, Scandinavium, Ullevi Stadium and Avenyn.");
        values.put("CONTACT_INFO", "Telefon +46 (0)31 401050 \t\t\t \t\t\t info@goteborgsvandrarhem.se\n" +
                "http://www.goteborgsvandrarhem.se");
        values.put("ADDRESS", "Göteborgs vandrarhem\n" +
                "Mölndalsvägen 23\n" +
                "412 63 Göteborg ");
        values.put("EMAIL", "info@goteborgsvandrarhem.se");
        values.put("PHONE", "+46 (0)31 401050");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.689008, 11.993930, VandrarHem, Hotel");
        values.put("GALLERY", "vandrarhemhotel1 vandrarhemhotel2 vandrarhemhotel3");

        return values;
    }

    //2 Avalon Hotel
    public static HashMap<String, String> getAvalonHotelValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Avalon Hotel is a feng-shui certified hotel where the decor, candles, scent and sound play a major role. The hotel is located at Kungsportsplatsen, right in the city center.\n" +
                        "\n" +
                        "First Hotel Avalon offers rooms in six different categories - Penthouse Suite, Suite, Deluxe, Superior, Business and Moderate. All rooms have the same high quality, it is the size of the room that determines which category the room belongs to.\n" +
                        "\n" +
                        "As a hotel guest you can enjoy a dip in the lovely outdoor pool."
        );
        values.put("OPENING_HOURS", "Contact Avalon Hotel");
        values.put("TICKET_PRICE", "Contact Avalon Hotel");
        values.put("TRAVEL_INFO", "Stop: Kungsportsplatsen");
        values.put("CONTACT_INFO", "Phone:031-751 02 00\n" +
                "info@avalonhotel.se\n" +
                "http://www.avalonhotel.se/en/");
        values.put("ADDRESS", "Kungstorget 9, 411 17 Göteborg");

        values.put("EMAIL", "info@avalonhotel.se");
        values.put("PHONE", "031-751 02 00");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.704010, 11.968196, Avalon, Hotel");
        values.put("GALLERY", "avalonhotel1 avalonhotel2 avalonhotel3");

        return values;
    }

    // 3 RadissonBlue Hotel
    public static HashMap<String, String> getRadissonBlueHotelValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Stay within walking distance of the Opera House and the Gothenburg Museum of Art when you reserve a room at the " +
                        "Radisson Blu Scandinavia Hotel, Gothenburg. Our position in the city center places guests right across " +
                        "the street from excellent shopping at Nordstaden Mall and also the train station. In addition to a " +
                        "prime location, our hotel features sophisticated style with modern amenities. Each of our 349 rooms and " +
                        "suites includes niceties like a mini bar and Free high-speed, wireless Internet. Order room service or enjoy " +
                        "an upscale dining experience onsite at Atrium Bar & Restaurant. We also offer access to our fitness center " +
                        "with a Jacuzzi, sauna, solarium and swimming pool. If you’re in the city for business and need a convenient " +
                        "meeting venue, choose from 16 aesthetic conference rooms suitable for both corporate and social gatherings.\n"
        );
        values.put("OPENING_HOURS", "Any time.");
        values.put("TICKET_PRICE", "Contact Radisson blu.");
        values.put("TRAVEL_INFO", "Stop: Centralstation or Nordstan. A 2-minute walk from the nearest tram stop.");
        values.put("CONTACT_INFO", "Tel: +46 31 758 5000\n" +
                "Fax: +46 31 758 5001\n" +
                "https://www.radissonblu.com/en/hotel-gothenburg\n" +
                "Email: info.scandinavia.gothenburg@radissonblu.com\n" +
                "Email: reservations.scandinavia.gothenburg@radissonblu.com");
        values.put("ADDRESS", "Södra Hamngatan 59\n" +
                "P.O. Box 288\n" +
                "S-401 24 Göteborg, Sweden");

        values.put("EMAIL", "Email: info.scandinavia.gothenburg@radissonblu.com \n" +
                "Email: reservations.scandinavia.gothenburg@radissonblu.com");
        values.put("PHONE", "+46 31 758 5000");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.706853, 11.972809, RadissonBlue, Hotel");
        values.put("GALLERY", "radissonbluehotel1 radissonbluehotel2 radissonbluehotel3");

        return values;
    }

    // 4 Vanila Hotel
    public static HashMap<String, String> getVanilaHotelValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "With walking distance to popular restaurants, shopping streets and sightseeing activities Hotel Vanilla offers comfort to all of you who appreciate the good things in life\n" +
                        "\n" +
                        "!---The hotel have 32 rooms with shower, WC, telephone, cable-TV, safety box and internet through wireless network on request.\n" +
                        "\n" +
                        "!---The hotel is situated in a 19th century building which has been carefully restored and is protected under the Swedish Heritage Conservation Act. The personal touch and familiar atmosphere will make you feel at home as soon as you step inside."
        );
        values.put("OPENING_HOURS", "Contact Vanila Hotel");
        values.put("TICKET_PRICE", "Room                       Price                              Weekend price \t \n" +
                "Single room \tFrom 1195 SEK/Night  From 835 SEK/Night\t Double room \t\t From 1345 SEK/Night  From 1045 SEK/Night Family room                 From 1345 SEK/Night  From 1145 SEK/Night \t\t \t\t \n" +
                "Extra bed 300 SEK/Night  \t\t\n" +
                "Parking 150 SEK/Night");
        values.put("TRAVEL_INFO", "Stop: Brunnsparken");
        values.put("CONTACT_INFO", "Phone: +46317116220\n" +
                "E-mail: info@hotelvanilla.se\n" +
                "Website: http://www.hotelvanilla.se");
        values.put("ADDRESS", "Hotel Vanilla\n" +
                "Kyrkogatan 38\n" +
                "411 15 Göteborg");
        values.put("EMAIL", "info@hotelvanilla.se");
        values.put("PHONE", "+46317116220");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.705172, 11.966919, Vanila, Hotel");
        values.put("GALLERY", "vanilahotel1 vanilahotel2 vanilahotel3");

        return values;
    }


    // 5 ScandicEuropa Hotel
    public static HashMap<String, String> getScandicEuropaHotelValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Stay just steps away from the central station, right in the heart of the urban vibe and next door to the shopping streets. " +
                        "HAK restaurant and bar lives and breathes creativity, where live music and photo exhibitions blend with great people" +
                        " to create a wonderful entertainment venue.\n" +
                        "HAK restaurant and bar sets the tone for our hotel, with its welcoming hotel bar, social " +
                        "gatherings, art exhibitions and delicious, imaginative menu. Come and dine here, or hang out at our bar. " +
                        "The next day you can swim a few laps in our pool, work out in our gym or relax in our sauna before you head out " +
                        "into town. You can also break free from the monotony of everyday life by booking a conference in one of our " +
                        "12 meeting rooms. We'll add an element of surprise with a delicious coffee break, lunch or perhaps dinner to " +
                        "round it all off.\n" +
                        "Scandic Europa is within walking distance of the vibrant shopping hub in Nordstan, as well as the quieter cobbled " +
                        "streets with cafés and exclusive shops. Outside our hotel, you can take tram 5 straight to Gothenburg's most " +
                        "entertaining district with Liseberg amusement park, Universum science centre and Museum of World Culture all on " +
                        "the same street. If you still have energy to spare, Avenyn is just 10 minutes from our hotel with shops, cafés and " +
                        "restaurants and the majority of Gothenburg's nightlife. When it’s time to travel, central station is right opposite " +
                        "our hotel, where you’ll find the airport shuttle to Landvetter Airport."
        );
        values.put("OPENING_HOURS", "Any time.");
        values.put("TICKET_PRICE", "Contact Scandic Europa.");
        values.put("TRAVEL_INFO", "Stop: Centralstation or Nordstan. A 2-minute walk from the nearest tram stop.");
        values.put("CONTACT_INFO", "+46 31 7516500\n" +
                "https://www.scandichotels.com/hotels/sweden/gothenburg/scandic-europa");
        values.put("ADDRESS", "Nils Ericsonsgatan 21\n" + "Göteborg");

        values.put("EMAIL", "DEMO email");
        values.put("PHONE", "+46 31 7516500");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.708104, 11.970235, ScandicEuropa, Hotel");
        values.put("GALLERY", "scandiceuropahotel1 scandiceuropahotel2 scandiceuropahotel3");

        return values;
    }

    // // HOTELS END

    // Graden START
    //1 Botanical Garden
    public static HashMap<String, String> getBotanicalGardenValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "The greenhouses have the largest collection of tropical orchids in Sweden, carnivorous plants and the rare Easter Island tree, which is extinct in its natural environment. A series of exhibitions are held in the greenhouses every year and the garden has a comprehensive schedule of activities all year round.\n" +
                        "The garden is close to the nature reserve Änggårdsbergen, where the scientific tree collection, the arboretum, is located. \n" +
                        "The Botanical Garden has two stars in the Michelin Green Guide and guided tours are arranged daily during the summer season." +
                        "- - - Inside garden there a a restaurant. You can have your lunch there. "
        );
        values.put("OPENING_HOURS", "The garden is open daily from 09.00-21.00 and the greenhouses are open daily in May-August 10.00-17.00, the rest of the year 10.00-16.00.\n" +
                "GÖTEBORG CITY CARD\n" +
                "Göteborg City Card gives you 1 free admission to the greenhouses.");
        values.put("TICKET_PRICE", "Free Entry / maybe 20 Sek");
        values.put("TRAVEL_INFO", "Stop: Botaniska Trädgården\n" +
                "By Tram:From Centralstation by Tram 1, 2, 7 to Botaniska Trädgården stop. " +
                "It will take arround 13-17 minutes!");
        values.put("CONTACT_INFO", "Address: Carl Skottbergs Gata 22A\n" +
                "Stop: Botaniska Trädgården\n" +
                "Phone: +46317411101\n" +
                "E-mail: botaniska.tradgarden@vgregion.se\n" +
                "Website: http://www.botaniska.se/");
        values.put("ADDRESS", "Address: Carl Skottbergs Gata 22A\n" +
                "Stop: Botaniska Trädgården");
        values.put("EMAIL", "botaniska.tradgarden@vgregion.se");
        values.put("PHONE", "+46317411101");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.682979, 11.950089, Botanical, Garden");
        values.put("GALLERY", "botanicalgarden1 botanicalgarden2 botanicalgarden3");

        return values;
    }

    //2 Tradgardsforeningen
    public static HashMap<String, String> getTradgardsforeningenValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "A beautiful garden located in the heart of the city. The Garden Society of Gothenburg, Trädgårdsföreningen, " +
                        "is one of the best preserved 19th century parks in Europe. Here you can find thousands of roses, carpet " +
                        "beddings and lush woodlands. The palm house from 1878 houses exotic plants in a Mediterranean climate.\n" +
                        "\n" +
                        "The park was the first in Sweden to be appointed a historic building in 1992 and has a star in the Michelin Green Guide.\n" +
                        "Thanks to reverend Göte Haglund’s donation of his collection of roses the park was able in 1987 to pride itself in " +
                        "becoming one of the leading rosaria of Northern Europe. The glass and cast iron of the Palmhouse constitute a " +
                        "glittering work of art in the middle of the park, inspired by Crystal Palace in London.\n" +
                        "!---The Garden Society of Gothenburg also has a popular playground."
        );
        values.put("OPENING_HOURS", "Parken är öppen (dagligen):\n" +
                "Maj-september: 07.00-20.00\n" +
                "Oktober-april: 07.00-18.00\n" +
                "Palmhuset är öppet (dagligen):\n" +
                "Juni-augusti: 10.00-20.00\n" +
                "September-maj: 10.00-16.00");
        values.put("TICKET_PRICE", "Free Entry to  parken och Palmhuset.");
        values.put("TRAVEL_INFO", "Stop: Centralstationen or Kungsportsplatsen");
        values.put("CONTACT_INFO", "Address: Södra vägen\n" +
                "Stop: Kungsportsplatsen\n" +
                "Phone: +46313655858\n" +
                "E-mail: tradgardsforeningen@ponf.goteborg.se" +
                "Website: http://www.tradgardsforeningen.se");
        values.put("ADDRESS", "Address: Södra vägen");
        values.put("EMAIL", "tradgardsforeningen@ponf.goteborg.se");
        values.put("PHONE", "+46313655858");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.706395, 11.976134, Tradgards, foreningen");
        values.put("GALLERY", "tradgardsforeningen1 tradgardsforeningen2 tradgardsforeningen3");

        return values;
    }
    // Graden END


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
                        "cuisine such as mulled wine and specialties such as döner kebab made from reindeer meat.\n" +
                        "The official colors of Liseberg are pink and green as can be seen on the entrance and the older houses in the park, " +
                        "the colors were also adopted for the logo, which was introduced in the 1980s, but changed in 2013 to the current logo."
        );
        values.put("OPENING_HOURS", "PREMIERE DATE:\n" +
                "Summer season April 23, October 21 Halloween and Christmas at Liseberg 18 November.\n" +
                "Mon-Fri: 11-23 Sun: 11-22");
        values.put("TICKET_PRICE", "Entry: 95 Sek, It has different offers for the rides.");
        values.put("TRAVEL_INFO", "Stop: Liseberg Or Korsvagen ");
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
                        "Lindholmen Science Park offers a neutral development environment where industry, academy and public sector can run research and development projects. For almost 15 years we have been creating successful collaborations and innovations. \n" +
                        "Open Arena Lindholmen is an environment and our concept of running collaborative projects. People working within Lindholmen Science Park's focus areas meet at Open Arena. There are scientists, project managers, business managers, vehicle specialists, EU experts, students, designers, artists, specialist, entrepreneurs and politicians. \n" +
                        "Lindholmen is Gothenburg's most knowledge-intensive and growing area. Today 21 000 people work, study or live at Lindholmen. Our vision is that the figure shall be 30 000 people by 2020.\n"
        );
        values.put("OPENING_HOURS", "You can visit outside anytime!");
        values.put("TICKET_PRICE", "NA");
        values.put("TRAVEL_INFO", "Stop: Lindholmen");
        values.put("CONTACT_INFO", "Lindholmen Science Park AB\n" +
                "Phone: +46 (0)31-764 70 00\n" +
                "Fax: +46 (0)31-764 70 49\n" +
                "Email: info@lindholmen.se");
        values.put("ADDRESS", "Lindholmspiren 5, 417 56 Gothenberg");
        values.put("EMAIL", "info@lindholmen.se");
        values.put("PHONE", "+46 (0)31-764 70 00");
        values.put("NAME", "LindholmenPark");
        values.put("MAP", "57.706830, 11.935716, Lindholmen, Park");
        values.put("GALLERY", "lindholmen1 lindholmen2 lindholmen3");

        return values;
    }

    // Park END

}


