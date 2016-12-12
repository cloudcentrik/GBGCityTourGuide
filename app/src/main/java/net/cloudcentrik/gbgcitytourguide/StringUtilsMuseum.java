package net.cloudcentrik.gbgcitytourguide;

import java.util.HashMap;

/**
 * Created by ismail on 21/11/16.
 */

public class StringUtilsMuseum {


    // 1 Maritiman Museum
    public static HashMap<String, String> getMaritimanMuseumValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "The Gothenburg Maritime Centre Foundation was established in 1985 with the aim of creating the world's biggest " +
                        "and best maritime centre. \n" +
                        "Climb aboard and leave dry land behind you. Set sail for a brand new world offering you excitement, " +
                        "adventure and discovery. Climb up the ladders and become a part of the old tales, with the salty sea spray " +
                        "in your face and the smell of diesel in your nostrils. Look out over the harbour entrance. At Maritiman" +
                        " you can go to sea without ever casting off."
        );
        values.put("OPENING_HOURS", "Open daily in June-August 10.00-18.00\n" +
                "May and September 11.00-17.00\n" +
                "and 11.00-16.00 on weekends in April.");
        values.put("TICKET_PRICE", "Adult 120 SEK\n" +
                "Children (5-15) 70 SEK\n" +
                "Family Ticket 350 SEK\n" +
                "(2 Adults & 2 Children)\n" +
                "Students & Senior Citizens 90 SEK");
        values.put("TRAVEL_INFO", "Nearest Stop: Lilla Bommen\n" +
                "Tram: 5, 10\n" +
                "Bus: 18, 19, 52, 55\n" +
                "You can go there by one of the Bus or Tram");
        values.put("CONTACT_INFO", "Phone: +4631105950\n" +
                "E-mail: info@maritiman.se\n" +
                "Website: http://www.maritiman.se");
        values.put("ADDRESS", "Packhusplatsen 12\n" +
                  "411 13 Göteborg");
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
                        "In 1923, the museum moved into its present premises. In the entrance area, see changing special place, " +
                        "the upper floors, as well as the old buildings house the permanent exhibition. This is mainly to animal models, " +
                        "where aquatic animals occupy a special position. The models include both dermoplastics, painted plaster casts, as well " +
                        "as liquid preparations conserved. Outstanding exhibits are the dermoplastics of 1865 stranded near Gothenburg, " +
                        "young blue whale and the one in 1948 killed in Angola elephants. " +
                        "You can see presentations of the Earth, life in the sea, as well as various kinds of environmental issues. \n" +
                        "See the world’s only mounted blue whale and a huge African elephant, birds and fish from the entire planet and much more."
        );
        values.put("OPENING_HOURS", "Tuesday to Sunday 11:00-17:00.\n" +
                "Open late on wednesdays from March 10: 11:00–20:00.");
        values.put("TICKET_PRICE", "Free entry < 25 years\n" +
                "Adults: 40 SEK annual and valid for some other museums");

        values.put("TRAVEL_INFO", "Nearest Stop: Linneplatsen\n" +
                "Tram: 1, 2, 6\n" +
                "Bus: 25, 52, 761, ROSA, BLÅ express\n" +
                "You can go there by one of the Bus or Tram");
        values.put("CONTACT_INFO", "Phone: +4610 441 44 00\n" +
                "E-mail: info.naturhistoriska@vgregion.se\n" +
                "Website: http://www.gnm.se");
        values.put("ADDRESS", "MUSEIVÄGEN 10 \n" +
                "413 11 Göteborg");

        values.put("EMAIL", "info.naturhistoriska@vgregion.se");
        values.put("PHONE", "+4610 441 44 00");
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
                        "and the only exhibited Viking ship in Sweden, &Auml;skek&auml;rrsskeppet.The museum is located in the historic " +
                        "East India Company building from the 18th century. Here you can study the remains of how people lived " +
                        "in this part of Sweden 12,000 years ago and see why Gothenburg is called the Swedish Amsterdam. " +
                        "There are also temporary exhibitions about current topics, guided tours, city walks and much more. \n" +
                        "Furthermore there's a play room for the kids – the Children’s Museum as well as a shop, cafe and restaurant."
        );
        values.put("OPENING_HOURS", "Tuseday and Thursday-Sunday 10.00-17.00 \n" +
                   "Wednesday 10.00-20.00.");
        values.put("TICKET_PRICE", "Free entry < 25 years\n" +
                "Adults: 40 SEK annual and valid for some other museums");
        values.put("TRAVEL_INFO", "Nearest Stop: Brunnsparken\n" +
                "Tram: 1,2,3,4,5,6,7,9,11,13 \n" +
                "Bus: 16, 17, 18, 19, 50 \n" +
                "You can go there by one of the Bus or Tram");
        values.put("CONTACT_INFO", "Phone: +46313683600\n" +
                "E-mail: stadsmuseum@kultur.goteborg.se\n" +
                "Website: http://www.stadsmuseum.goteborg.se");
        values.put("ADDRESS", "Norra Hamngatan 12 \n" +
                   "411 14 Göteborg");
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
        values.put("OPENING_HOURS", "Tuesday-Friday 10.00-17.00\n" +
                "Saturday-Sunday 11.00-16.00\n" +
                "May-September also open Monday 10.00-17.00.");
        values.put("TICKET_PRICE", "Adults: 100 SEK\n" +
                "Youth: 16-19: 50 SEK\n" +
                "Children: 6-15: 25 SEK\n" +
                "Family ticket:2 adults +x children =>19 : 200 SEK\n" +
                "Group ticket: (20 or more): 75 SEK / person\n" +
                "Senior citizens: 65+ and Students with ID: 80 SEK\n" +
                "Schools: 20 SEK p.p.");
        values.put("TRAVEL_INFO", "Nearest Stop: Arendal Skans\n" +
                "At first: From Nordstan stop to Eketrägatan By tram 6, 10 Or by buss 16, 24\n" +
                "\n" +
                "Stop Eketrägatan, Läge E : Take buss 32 to Arendal Skans stop.");
        values.put("CONTACT_INFO", "Phone: +4631664814\n" +
                "E-mail: museum@volvo.com\n" +
                "Website: http://www.volvomuseum.se");
        values.put("ADDRESS", "Arendal Skans \n" +
                    "405 08 Göteborg");
        values.put("EMAIL", "museum@volvo.com");
        values.put("PHONE", "+4631664814");
        values.put("NAME", "DEMO Name");
        values.put("MAP", "57.695453, 11.820012, Volvo, Museum");
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
                        "Explore the Swedish wilderness with its fish and birds, visit our sharks and rays and step into a space station. You can " +
                        "also see snakes and other poisonous animals, go on safari among monkeys, sloths and caimans, learn how nature has inspired " +
                        "new technologies, let really young children try out their dream jobs at Job Land and a whole lot more.\n" +
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
                        "The Museum of World Culture is a place for questions, big or small, and for curiosity and dialogue. The museum brings you " +
                        "historic and current issues, offering experiences for all ages. The unique architecture and central location makes the museum " +
                        "a natural meeting point and in Gothenburg.\n" +
                        "Besides, the museum has a rich program with everything from film and theatre to seminars, festivals and performances and a " +
                        "special program with activities for kids and families.\n" +
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
                        "On the ground floor you'll find small shop and a cafe."
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

}
