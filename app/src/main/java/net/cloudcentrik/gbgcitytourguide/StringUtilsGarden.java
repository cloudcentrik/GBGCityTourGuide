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
        values.put("OPENING_HOURS", "The garden is open odaily 9 am to 9 pm");
        values.put("TICKET_PRICE", "Volontary admission fee SEK 20");
        values.put("TRAVEL_INFO", "Nearest Stop: Botaniska Trädgården\n" +
                "Tram: 1, 2, 7 \n" +
                "Bus:  \n" +
                "You can go there by one of the Bus or Tram");
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
                "A beautiful garden located in the heart of the city. The Garden Society of Gothenburg, Tr&auml;dg&aring;rdsf&ouml;reningen, " +
                        "is one of the best preserved 19th century parks in Europe. Here you can find thousands of roses, carpet " +
                        "beddings and lush woodlands. The palm house from 1878 houses exotic plants in a Mediterranean climate.\n" +
                        "\n" +
                        "The park was the first in Sweden to be appointed a historic building in 1992 and has a star in the Michelin Green Guide.\n" +
                        "Thanks to reverend Göte Haglund's donation of his collection of roses the park was able in 1987 to pride itself in " +
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
}
