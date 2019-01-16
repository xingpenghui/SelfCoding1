package com.feri.common.email;

/**
 *@Author feri
 *@Date Created in 2018/9/6 11:19
 */
public class EmailMsg {
    private String company;//公司名称
    private String Title;
    private String Content;
    private String Email;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}