# java-racingcar

자동차 경주 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 구현 기능 목록

- [X] : 자동차 이름을 입력 받는다.
  - [X] : 자동차 이름은 쉼표(,)를 기준으로 구분한다. 
  - [X] : 예외처리 : 자동차 이름은 5자 이하만 가능하다.
  - [X] : 예외처리 : 자동차 이름은 공백일 수 없다.
- [X] : 시도할 횟수를 입력 받는다.
  - [X] : 예외처리 : 시도할 횟수는 1이상의 숫자만 가능하다.
- [X] : 자동차가 경우에 따라 이동하거나 멈춘다.
  - [X] : 0-9 사이의 랜덤 값을 구한 후, 4 이상인 경우 한 칸 전진하고 3 이하인 경우 가만히 있는다.
- [X] : 각 라운드 별 이동 결과를 출력한다.
  - [X] : 자동차 이름과 함께 각각의 이동한 칸 수를 '-'로 표시한다.
  - [X] : 처음에는 `실행 결과` 문자열을 출력한다.
- [X] : 우승자를 출력한다.
  - [X] : 가장 멀리 간 사람이 우승한다.
  - [X] : 공동 우승자가 존재할 수 있다. (쉼표로 구분)

## 소스코드 구조
```text
main
└── java
     ├── domain
     ├── view
     ├── RacingCarController.java
     └── RacingCarApplication.java
```

- domain
  - '자동차 경주 미션'의 비즈니스 로직을 담고 있다.
- view
  - 입출력 로직을 담고 있다.
- RacingCarController
  - '자동차 경주 미션'의 제어 로직을 담고 있다.
- RacingCarApplication
  - 프로그램의 실행 시작 지점이다.
