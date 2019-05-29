/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dish.models;

import java.util.List;

/**
 *
 * @author mcperalta
 */

public class Projects {

   
    private Integer id;
    private String name;
    private String description;
    private String project_manager;
    private List<DeveloperProject> developer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProject_manager() {
        return project_manager;
    }

    public void setProject_manager(String project_manager) {
        this.project_manager = project_manager;
    }

    public List<DeveloperProject> getDeveloper() {
        return developer;
    }

    public void setDeveloper(List<DeveloperProject> developer) {
        this.developer = developer;
    }

}
