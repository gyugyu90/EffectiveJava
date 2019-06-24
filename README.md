# EffectiveJava


Ch3

Item 10) equals는 일반 규약을 지켜 재정의하라

- 객체 식별성(object identity) => 두 객체가 물리적으로(주소가) 같은가  
- 논리적 동치성(logical equality) => 내용이 같은가  

equals()를 재정의해야할 때는  
  => 논리적 동치성이 필요할 때  
  => 상위 클래스에서는 객체 식별성에 대한 비교만 했을 때