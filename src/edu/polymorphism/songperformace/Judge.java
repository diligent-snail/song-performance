package edu.polymorphism.songperformace;

/**
 * Судья в шоу
 */
public interface Judge {
    /**
     * Оценить выступление участника.
     *
     * @param performance выступление для оценки
     * @return результат оценивания
     */
    Judgement judge(Performance performance);

    /**
     * @return имя судьи
     */
    String getName();
}
