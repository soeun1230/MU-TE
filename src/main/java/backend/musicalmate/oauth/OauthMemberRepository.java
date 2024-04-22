package backend.musicalmate.oauth;

import backend.musicalmate.Member.OauthMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OauthMemberRepository extends JpaRepository<OauthMember,Long> {
    Optional<OauthMember> findByemail(String email);
}
