package org.openmrs.module.clinic.utils;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonObs {
    private String concept_id;
    private String concept_answer;
    private String datetime = "";
    private String comment = "";
    private String group_id;
    private String type;
    private List<JsonObs> groups ;

    public String getConcept_id() {
        return concept_id;
    }

    public void setConcept_id(String concept_id) {
        this.concept_id = concept_id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConcept_answer() {
        return concept_answer;
    }

    public void setConcept_answer(String concept_answer) {
        this.concept_answer = concept_answer;
    }

    public List<JsonObs> getGroups() {
        return groups;
    }

    public void setGroups(List<JsonObs> groups) {
        this.groups = groups;
    }
}
