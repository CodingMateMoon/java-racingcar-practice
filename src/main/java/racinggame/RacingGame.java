package racinggame;

public class RacingGame {

    private Car[] cars;

    public RacingGame(Car[] cars) {
        this.cars = cars;
    }

    // 프로덕션 코드에서 의존관계를 한단계 끌어올리고 랜덤 관리 로직을 이쪽으로 옮긴 것. 테스트를 위한 목적으로 인터페이스로 분리
    // 프로덕션 코드는 한 가지 전략밖에 없지만 테스트 목적에서는 충분히 인터페이스를 뽑는 것도 좋은 전략일 수 있습니다
    // 테스트를 만들다보면 자연스럽게 이러한 구조가 되어서 MovingStrategy라는 인터페이스에 대한 구현체를 외부에서 의존관계로 주입. DI와 같습니다.
    // 스프링 프레임워크를 써서 빈으로 등록하고 DI를 연결하는게 아니라 스프링 프레임워크가 없어도 프로그램상으로 자연스럽게 DI를 한 것입니다.
    // 실제 DI는 애플리케이션을 개발할 때 스프링없이도 자연스럽게 쓸 수 있어야 테스트하기 좋은 코드, 유연한 코드가 만들어집니다. 스프링 프레임워크를 써야만 할 수 있는게 아닙니다.
    // 애플리케이션을 개발할 때도 얼마든지 DI를 할 수 있습니다.
    private void moveCars2() {
        for (Car car:
                cars) {
            car.move(new RandomMovingStrategy());
        }
    }

    private void moveCars() {
        for (Car car:
             cars) {
            car.move();
        }
    }
}
