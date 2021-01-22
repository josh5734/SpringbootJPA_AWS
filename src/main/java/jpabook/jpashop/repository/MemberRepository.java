package jpabook.jpashop.repository;


import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member){
        em.persist(member);
    }

    public Member findOne(Long id){ // PK 이용
        return em.find(Member.class, id);
    }

    // Entity Member를 조회해라 / 조회 타입이 Member.class
    public List<Member> findAll(){
        return em.createQuery("select m from Member m", Member.class)
                .getResultList(); // 결과를 컬렉션으로 반환
    }

    public List<Member> findByName(String name){
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }


}