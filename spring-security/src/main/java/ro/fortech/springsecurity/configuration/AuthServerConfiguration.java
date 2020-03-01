package ro.fortech.springsecurity.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

public class AuthServerConfiguration extends AuthorizationServerConfigurerAdapter {
    @Value("${user.oauth.custom-client.clientId}")
    private String ClientID;
    @Value("${user.oauth.custom-client.clientSecret}")
    private String ClientSecret;
    @Value("${user.oauth.custom-client.redirectUris}")
    private String RedirectURLs;

    private final PasswordEncoder passwordEncoder;

    public AuthServerConfiguration(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void configure(
            AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        oauthServer.tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient(ClientID)
                .secret(passwordEncoder.encode(ClientSecret))
                .authorizedGrantTypes("authorization_code")
                .scopes("user_info")
                .autoApprove(true)
                .redirectUris(RedirectURLs);
    }
}
