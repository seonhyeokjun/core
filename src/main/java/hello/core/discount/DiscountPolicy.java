package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /**
     * 할인 대상 금액
     * @param member
     * @param price
     * @return
     */
    int discount(Member member, int price);
}
