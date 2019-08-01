package nl.th8.presidium.user.controller.dto;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class User {

    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    private String password;

    private List<GrantedAuthority> authorityList;

    private boolean verified;


    public User(List<GrantedAuthority> authorityList) {
        this.authorityList = new ArrayList<>();
        this.verified = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public List<GrantedAuthority> getAuthorityList() {
        return authorityList;
    }

    public void grantAuthority(String authority) {
        this.authorityList.add(new SimpleGrantedAuthority(authority));
    }
}
