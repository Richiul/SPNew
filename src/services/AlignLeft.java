package services;

import models.Paragraph;

import javax.naming.Context;

public class AlignLeft implements AlignStrategy{

    public void render(Paragraph p, Context c) {
        System.out.println(p.text+"++++++++++");
    }

}
