package backend.musicalmate.oauth;

import backend.musicalmate.Member.OauthMember;

//AuthCodeRequestUrlProvider 와 같은 역할을 하는 인터페이스
public interface OauthMemberClient {
    OauthServerType supportServer();
    OauthMember fetch(String code);
}
