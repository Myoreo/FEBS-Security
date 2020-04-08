package cc.mrbird.security.properties;

import cc.mrbird.security.social.SocialProperties;

public class WeiXinProperties extends SocialProperties {

    private String providerId = "weixin";

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
}
