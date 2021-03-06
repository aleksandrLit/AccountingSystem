package ru.tvstu.AccountingSystemHousingServices.model.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import ru.tvstu.AccountingSystemHousingServices.model.IdentityDocument;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebUserInfoModel {
    private String firstName;
    private String lastName;
    private String middleName;

    private IdentityDocument identityDocument;

    public WebUserInfoModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(IdentityDocument identityDocument) {
        this.identityDocument = identityDocument;
    }
}
