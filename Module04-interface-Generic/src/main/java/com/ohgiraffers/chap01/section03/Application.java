package com.ohgiraffers.chap01.section03;

/*
* 상속 계층도와 설계 간편화
*
* - 상속 계층도와 인터페이스를 결합하여 전자기기 설계 간편화
*
* 설계 의도
* - 전자기기는 다양한 특성과 기능을 가지는데, 상속만으로 모든 기능을 정의하면 불필요한 기능까지 물려받거나 유연성이 떨어질 수 있다.
* - 예 : 모든 기기에 충전을 상속한다면 TV도 충전해야 하는 비현실적 상황 발생.
* - 인터페이스로 특정 기능(충전)을 분리하면 필요한 기기만 선택적으로 가져갈 수 있어 설계가 깔끔해짐.
*
* 설계 과정 상세
* 1) Device로 기본 계층 구축 :
*   - 모든 전자기기는 전원을 켜고 끄는 기본 동작이 필요 -> Device를 추상 클래스로 정의해 공통 동작 보장.
*   - 역할 : 전자기기는 큰 범주를 설정하고, 하위 계층으로 특성을 나눌 준비.
*   - 비유 : 전자기기 공장에서 기본 모델 설계도를 만드는 단계
*
* 2) PortableDevice와 FixedDevice로 특성 분리 :
*   - 휴대 기기 (SmartPhone, Laptop)은 이동 가능, 고정 기기 (TV)는 고정 설치 -> 계층도를 나누어 특성 구체화
*   - 역할 : 상속으로 각 기기의 기본 동작(전원 방식)을 다르게 정의해 계층적 관리 가능.
*   - 비유 : 공장에서 휴대용과 고정형 라인으로 생산 분리.
*
* 3) Rechargeable 인터페이스로 충전 관점 분리
*   - 모든 휴대 기기가 충전 가능한 것은 아님(배터리가 없는 건전지형 모델)
*   - 역할 : 상속 계층 밖에서 충전 기능을 정의해 필요한 기기만 가져가도록 설계하여 유연성 확보.
*   - 비유 : 공장에서 충전 옵션을 별도 부품으로 만들어 필요한 모델에만 장착
*
* 설계의 장점 :
* - 계층도(Device -> Portable/Fixed) : 전원 동작과 기기 유형을 체계적으로 정리
* - 인터페이스(Rechargeable) : 충전이라는 관점을 독립적으로 정의해 불필요한 결합 방지
* - 결과 : SmartPhone과 laptop은 충전 기능, TV는 충전 없이 고정 기기로 유지 -> 설계 간결, 확장 쉬움.
* */

import com.ohgiraffers.chap01.section03.model.Device;
import com.ohgiraffers.chap01.section03.model.Laptop;
import com.ohgiraffers.chap01.section03.model.SmartPhone;
import com.ohgiraffers.chap01.section03.model.Tv;
import com.ohgiraffers.chap01.section03.service.Rechargeable;

public class Application {
    public static void main(String[] args) {
        System.out.println("=== 기능 특징과 충전 관점 ===");

        Device smartphone = new SmartPhone("Galaxy");
        Device laptop = new Laptop("MacBook");
        Device tv = new Tv("OLED TV");

        smartphone.powerOn();
        laptop.powerOn();
        tv.powerOn();

        smartphone.powerOff();
        laptop.powerOff();
        tv.powerOff();

        // 충전 관점
        // 휴대용 기기는 충전 행위가 가능하다.
        ((Rechargeable) smartphone).recharge();
        ((Rechargeable) laptop).recharge();

        System.out.println("=== 설계의 간편화 ===");
        Device[] devices = {smartphone, laptop, tv};

        for (Device device : devices) {
            device.powerOn();
            if(device instanceof Rechargeable) {
                ((Rechargeable) device).recharge();
            }
            device.powerOff();
        }
    }
}
