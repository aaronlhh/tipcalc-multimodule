package com.example.tiptime.cli;

import com.example.tiptime.core.TipResult;
import com.example.tiptime.service.TipService;

import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: <cost> <tipFraction> [roundUp]");
            return;
        }
        double cost = Double.parseDouble(args[0]);
        double tipFraction = Double.parseDouble(args[1]);
        boolean roundUp = args.length > 2 && Boolean.parseBoolean(args[2]);

        InputStream in = Main.class.getResourceAsStream("/app.properties");
        if (in == null) throw new IllegalStateException("Missing required resource: /app.properties");
        Properties props = new Properties();
        props.load(in);
        String label = props.getProperty("label");
        if (label == null) throw new IllegalStateException("Missing 'label' in app.properties");

        TipResult result = TipService.compute(cost, tipFraction, roundUp);
        System.out.println(label + " " + result.getFormatted());
    }
}
