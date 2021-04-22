package hello.core.singleton;

public class SingletonService {

    // 1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 객체 인스터스를 조회할 수 있도록 한다
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. private 생성자를 통해 외부에서 new 키워드를 통해 객체 생성을 못하게 한다.
    private SingletonService(){}

    public void logic() {
        System.out.println("싱글통 객체 로직 호출");
    }
}
