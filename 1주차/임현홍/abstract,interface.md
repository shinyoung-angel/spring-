# 접근 제어자 

접근 제어자는 객체의 로직을 보호하기 위해서 사용한다.
외부의 접근을 허용하거나 차단해야할 때 사용한다.

### 종류 

자주 사용하는 것
- public : 어디서든 사용이 가능하다.
- private : 클래스 내부에서는 사용가능하지만 외부에서는 사용하지 못한다. 


- protected : 상속을 받았다면 다른패키지의 내용을 사용가능, 인스턴스에서 함수는 사용 불가  
- defualt : 상속을 받아도 다른패키지의 내용을 사용 불가능, 아무것도 안적을 경우 
  - 패키지에서 내부적으로 사용하는 클래스 용으로 사용한다.
private < default < protected < public 


> 웬만하면 public 과 private 두개만 사용해도 충분히 사용할 만하다고 한다. 

# Abstract (추상)

상속을 강제하는 규제 ? 
직접 사용하는 것이 아니라 반드시 상속해서 사용하도록 강제하게 하는 것

### 추상 메소드 

```java
abstract class A{
    public abstract int b();
  
    public void d(){
        System.out.println("world");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        A obj = new A(); // => 오류 
    }
}
``` 

클래스 A 는 abstact 로 선언이 되어있기 때문에 클래스 A를 사용하려고 하면 오류가 난다. 

자 그래서 이번엔 A 메서드를 상속받은 B를 만들어보겠다.

```java
public class B extends A{
}
```
만들자마자 오류가 발생한다 => 이유는 
`public abstract int b()` 구문 때문이다.

보통의 경우는 메서드를 선언할 때 `b(){}` 으로 중괄호 안에 적지만 추상적(?)으로 형식만 적혀져 있는 형태이다.

abstract로 적힌 문구의 뜻은 클래스를 상속받아 사용할 때, b 메서드를 다시 오버라이드 해줘야 사용 가능하다는 뜻이다.

```java
public class B extends A{
  public int b(){
    return 3;
  }
}
```
이제야 에러가 나지 않는다.


> 클래스 내용 중 멤버가 하나라도 abstract로 선언이 되어 있다면, class 전체를 abstract로 선언해야한다.


### 추상 클래스를 사용하는 이유 
상속을 강제하기 위한 것
메소드의 시그니처만 정의해두고, 그 메소드의 실제 동작방법은 이 베소드를 상속 받은 하위 클래스의 책임으로 위임하고 있다. 


# final 
abstract와 반대되는 정의를 가졌다.
추상이 상속을 강제하는 것이라면 final은 상속/변경을 금지하는 규제다.

`PI = 3.14`라는 변수가 있다면 바뀔 리 없다. 바꾸려고 하면 오류가 나게 된다. 
메서드,클래스 에서도 마찬가지이다. 상속이 되지 않는다. 


# interface
규제라고 할 수 있다.
어떤 객체가 있고, 그 객체가 특정한 interface를 사용한다면 반드시 그 인터페이스의 메소드가 포함되어야 한다. 

```java
interface I{
  public void z();
}

class A implements I{
  public void z(){
  }
}
```
implements = 구현하다.
클래스 A는 인터페이스 I를 구현하고 있다는 의미이다. 
그리고 A는 I의 z 메서드를 반드시 포함하고 있어야 한다. 

인터페이스는 상속과는 다르다. 상속이 상위 클래스의 기능을 받는 것이면
인터페이스는 하위 클래스에 특정 메소드가 반드시 존재하도록 하는 것



### interface 규칙 

```java
  public interface Calc{
    public void setOprands(int a,int b);
    public int sum();
    public int avg();
  }
   public interface Calc2{
    public int cel();
  }
  interface Calc3 extends Calc2{
    public int hi();
  }
  class A implements Calc,Calc3{
    public void setOprands(int a,int b);
    public int sum();
    public int avg();
    public int cel();
    public int hi();
  }
```

> 규칙 
1. 하나의 클래스가 여러개의 인터페이스를 구현할 수 있다.
2. 인터페이스도 상속이 된다.
3. 인터페이스의 멤버는 반드시 public이어야 한다.
