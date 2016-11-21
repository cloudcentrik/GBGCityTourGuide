package net.cloudcentrik.gbgcitytourguide;

import java.util.HashMap;

/**
 * Created by ismail on 07/11/16.
 */

public class StringsUtilsHotel {
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

    public static HashMap<String, String> getLaithaiValues() {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put(
                "OVERVIEW",
                "Halal Thai food. LUNCH BUFFE"
        );
        values.put("OPENING_HOURS", "11AM - 8 PM");
        values.put("TICKET_PRICE", "NA");
        values.put("TRAVEL_INFO", "Nearest tram stop SKF. Tram 6, 7, 11 and buss 58, 519 go through SKF");
        values.put("CONTACT_INFO", "DEMO contact information");
        values.put("ADDRESS", "Artillerigatan 8, 415 03 Göteborg");
        values.put("EMAIL", "kaniz.laithai@gmail.com");
        values.put("PHONE", "+46(0)31-253350");
        values.put("NAME", "Lai Thai Gamlastan");

        values.put("MAP", "57.728869, 12.010326,Lai Thai Gamlastan,Halal food");
        values.put("GALLERY", "laithai0 laithai1 laithai2");

        return values;
    }
}
