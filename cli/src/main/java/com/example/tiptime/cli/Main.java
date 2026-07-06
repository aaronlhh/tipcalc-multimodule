package com.example.tiptime.cli;

import com.example.tiptime.core.TipResult;
import com.example.tiptime.service.TipService;

import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: <cost> <tipFraction> [roundUp]");
            return;
        }
        double cost = Double.parseDouble(args[0]);
        double tipFraction = Double.parseDouble(args[1]);
        boolean roundUp = args.length > 2 && Boolean.parseBoolean(args[2]);

        String label = "Tip:";
        try (InputStream in = Main.class.getResourceAsStream("/app.properties")) {
            if (in != null) {
                Properties props = new Properties();
                props.load(in);
                label = props.getProperty("label", label);
            }
        } catch (Exception e) {
            // ignore, use default label
        }

        TipResult result = TipService.compute(cost, tipFraction, roundUp);
        System.out.println(label + " " + result.getFormatted());
    }
}
