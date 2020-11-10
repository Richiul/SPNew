package services;

import models.Paragraph;

import javax.naming.Context;

public interface AlignStrategy {
    public void render(Paragraph p, Context c);
}
