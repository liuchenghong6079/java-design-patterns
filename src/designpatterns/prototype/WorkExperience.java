package designpatterns.prototype;

import java.io.Serializable;

/**
 * 工作经历
 * @author lch
 */
public class WorkExperience implements Serializable {

    private static final long serialVersionUID = -8934495589625953125L;

    private String workDate;

    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
