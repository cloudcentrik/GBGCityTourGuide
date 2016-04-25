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

    public static String[] stadMesuem = {
            "The Gothenburg Maritime Centre Foundation was established in 1985 with the aim of creating the world’s biggest " +
                    "and best maritime centre. Climb aboard and leave dry land behind you. Set sail for a brand newvworld " +
                    "offering you excitement, adventure and discovery. Climb up the ladders and become a part of the old tales," +
                    " with the salty sea spray in your face and the smell of diesel in your nostrils. Look out over the harbour" +
                    " entrance. At Maritiman you can go to sea without ever casting off.",
            "Packhusplatsen 12",
            "Packhusplatsen 12\n" +
                    "Phone: +4631105950\n" +
                    "E-mail: info@maritiman.se\n" +
                    "Website: http://www.maritiman.se",
            "EASTER HOLIDAY\n" +
                    "April 3-12 :11am - 4pm\n" +
                    "APRIL :11AM - 4PM\n" +
                    "Sat 18 - Sun 19\n" +
                    "Sat 25 - Sun 26\n" +
                    "MAY : 11AM - 5PM\n" +
                    "Open daily\n" +
                    "JUNE-AUGUST :10AM - 6PM\n" +
                    "Open daily except for Midsummers Eve the 19th of June when we close at 3pm\n" +
                    "SEPTEMBER 11AM - 5PM\n" +
                    "Open daily\n" +
                    "AUTUMN HOLIDAY\n" +
                    "Oct 24-Nov 1 :11am - 4pm",
            "Take trum no 1,2,3,4,7,11,9 from central\n" +
                    "station and take off Brunnsparken(Just one stoppage).\n" +
                    "Than take trum 5,10  or Buss 55, 19,18,42\n" +
                    "from Platform B.Just take off one stoppage\n" +
                    "later named Lilla Bommen.It is situated after\n" +
                    "next to the Goteborg Opera centre.",
            "Adult 120 SEK\n" +
                    "Children (5-15) 70 SEK\n" +
                    "Family Ticket 350 SEK\n" +
                    "(2 Adults and 2 Children)\n" +
                    "Students and Senior Citizens 90 SEK"
    };


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

        values.put("key", "value");
        values.put("key", "value");
        values.put("key", "value");
        values.put("key", "value");
        values.put("key", "value");
        values.put("key", "value");
        values.put("key", "value");
        values.put("key", "value");
        values.put("key", "value");

        return values;
    }


}
