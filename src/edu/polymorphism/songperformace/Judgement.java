package edu.polymorphism.songperformace;

/**
 * Заключение судьи
 */
public class Judgement {
    /**
     * Максимум баллов
     */
    public static final int MAX_POINTS = 5;
    /**
     * Минимум баллов
     */
    public static final int MIN_POINTS = 1;

    /**
     * Количество баллов, которое поставил судья
     */
    private final int points;
    /**
     * Комментарий судьи
     */
    private final String comment;

    public Judgement(int points, String comment) {
        if (points < MIN_POINTS || points > MAX_POINTS) {
            throw new IllegalArgumentException("points must be in range [" + MIN_POINTS + ", " + MAX_POINTS + "]");
        }
        this.points = points;
        this.comment = comment;
    }

    public int getPoints() {
        return points;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Judgement{" +
               "points=" + points +
               ", comment='" + comment + '\'' +
               '}';
    }
}
