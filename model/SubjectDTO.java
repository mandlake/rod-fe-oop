package model;

public class SubjectDTO {
    private long id;
    private final int korea;
    private final int english;
    private final int math;

    public int getKorea() {
        return korea;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "SubjectDTO{" +
                "korea=" + korea +
                ", english=" + english +
                ", math=" + math +
                '}';
    }

    public SubjectDTO(int korea, int english, int math) {
        this.korea = korea;
        this.english = english;
        this.math = math;
    }
}
