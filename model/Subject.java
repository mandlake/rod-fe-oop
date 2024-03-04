package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Subject {
    private long id;
    private int korea;
    private int english;
    private int math;

    @Builder(builderMethodName = "builder")
    public Subject(long id, int korea, int english, int math) {
        this.id = id;
        this.korea = korea;
        this.english = english;
        this.math = math;
    }
}
