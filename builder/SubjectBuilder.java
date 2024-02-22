package builder;

import model.MemberDTO;
import model.SubjectDTO;

public class SubjectBuilder {
    private int korea;
    private int english;
    private int math;

    public SubjectBuilder korea(int korea) {
        this.korea = korea;
        return this;
    }

    public SubjectBuilder english(int english) {
        this.english = english;
        return this;
    }

    public SubjectBuilder math(int math) {
        this.math = math;
        return this;
    }

    public SubjectDTO build() {
        return new SubjectDTO(korea, english, math);
    }
}
