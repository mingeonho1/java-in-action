package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50);    // 변경
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("MemberConstruct.MemberConstruct");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
