package edu.polymorphism.songperformace;

public class SongPerformanceShow {
    public static void main(String[] args) {
        Judge[] judges = {};
        Performance[] performances = {new Performance("Яна", "Видеоигры")};

        for (Performance performance : performances) {
            System.out.println(performance.getCandidateName() + " исполняет '" + performance.getSong() + "'");

            for (Judge judge : judges) {
                Judgement judgement = judge.judge(performance);
                System.out.println(judge.getName() + " говорит: '" + judgement.getComment()
                                   + "', оценка: " + judgement.getPoints() + " из " + Judgement.MAX_POINTS);
            }
        }
    }
}
