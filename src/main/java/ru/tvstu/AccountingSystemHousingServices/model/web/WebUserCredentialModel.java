package ru.tvstu.AccountingSystemHousingServices.model.web;

import com.fasterxml.jackson.annotation.JsonInclude;

public class WebUserCredentialModel {
    private String username;
    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
