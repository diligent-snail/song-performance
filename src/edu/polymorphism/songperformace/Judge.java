package edu.polymorphism.songperformace;

/**
 * Судья в шоу
 */
public abstract class Judge {
    /**
     * Оценить выступление участника.
     *
     * @param performance выступление для оценки
     * @return результат оценивания
     */
    public abstract Judgement judge(Performance performance);

    /**
     * @return имя судьи
     */
    public abstract String getName();
}

class FirstJudge extends Judge {
    @Override
    public Judgement judge(Performance performance) {
        if(performance.getSong().equals("Radiohead")) {
            return new Judgement(5, "a");
        }
        return new Judgement(3, "a");
    }

    @Override
    public String getName() {
        return "Judge A";
    }
}

class SecondJudge extends Judge {
    @Override
    public Judgement judge(Performance performance) {
        return new Judgement(5, "a");
    }

    @Override
    public String getName() {
        return "Judge B";
    }
}
