
package services;

import models.Book;

public class StatisticsCommand implements Command {
    public StatisticsCommand() {
    }

    public void execute() {
        DocumentManager.getInstance();
        Book b1 = DocumentManager.getBook();
        BookStatistics stats = new BookStatistics();
        b1.accept(stats);
        stats.printStatistics();
    }
}
