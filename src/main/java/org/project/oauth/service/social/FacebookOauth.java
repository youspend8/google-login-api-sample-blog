package org.project.oauth.service.social;

import org.springframework.stereotype.Component;

@Component
public class FacebookOauth implements SocialOauth {
    @Override
    public String getOauthRedirectURL() {
        return "";
    }

    @Override
    public String requestAccessToken(String code) {
        return null;
    }
}
