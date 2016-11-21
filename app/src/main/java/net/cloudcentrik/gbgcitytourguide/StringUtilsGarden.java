package net.cloudcentrik.gbgcitytourguide;

import java.util.HashMap;

/**
 * Created by ismail on 21/11/16.
 */

public class StringUtilsGarden {

    // Graden START
    //1 Botanical Garden
    public static HashMap<String, String> getBotanicalGardenValues() {
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
    }

    //2 Tradgardsforeningen
    public static HashMap<String, String> getTradgardsforeningenValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "The Garden Society of Gothenburg (Swedish : Trädgårdsföreningen) is one of the best-preserved 19th century parks in Europe. A verdant ocean in the very heart of the city; a place to relax and be inspired. Undulating lawns, and flower beds filled with native and foreign plants alongside historic buildings that take you back to the golden age of horticulture. With its gentle lines, the park has a very distinct 19th century atmosphere. Contemporary flowerbeds, woodlands and the magnificent collection of roses also make the park of interest from a modern-day perspective. There is no doubt that from the very beginning The Garden Society of Gothenburg has been an oasis for the people of Gothenburg. Here, you will find a very diverse range of plants with among other things, a Rose Garden, exotic plants in the Palmhouse, an impressive collection of trees, perennials and annuals, as well as an agave and a cactus planting. Restaurants and cafés, musical arrangements, theatrical performances, seminars, seasonal parties and many other things make the park hustle and bustle throughout the year."
        );
        values.put("OPENING_HOURS", "Daily:\n" +
                "May-September: 07.00-20.00\n" +
                "October-April: 07.00-18.00\n");
        values.put("TICKET_PRICE", "Free Entry");
        values.put("TRAVEL_INFO", "Nearest Stop: Centralstationen\n" +
                "Tram: 1, 2, 3, 4, 7, 9, 11 \n" +
                "Bus: 17, 58, 60, Blå, Röd, Svart \n" +
                "You can go there by one of the Tram or Bus");
        values.put("ADDRESS", "Trädgårdsföreningen, Slussgatan 1,\n411 06 Göteborg\nhttp://www.tradgardsforeningen.se");
        values.put("EMAIL", "tradgardsforeningen@ponf.goteborg.se");
        values.put("PHONE", "031-365 00 00");
        values.put("NAME", "Trädgårdsföreningen");
        values.put("MAP", "57.706395, 11.976134, Tradgards, foreningen");
        values.put("GALLERY", "tradgardsforeningen1 tradgardsforeningen2 tradgardsforeningen3");

        return values;
    }
    // Graden END
}
