package com.dish.controller;

import com.dish.app.DBConnection;
import com.dish.app.PIDPlatformException;
import com.dish.models.DeveloperProject;
import com.dish.models.Projects;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author cperalta
 */
public class ProjectController {
    
    
    public Projects findProject() throws PIDPlatformException{
        String sql = "select id,name,description, project_manager from projects";
        Connection cn = new DBConnection().connect();
        Projects e = new Projects();
        ArrayList<DeveloperProject> data = new ArrayList<>();
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.first()){
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setDescription(rs.getString("description"));
                e.setProject_manager(rs.getString("project_manager"));
            }
            String sql2 = "Select developer_name from developers_project where id="+e.getId();
            rs = st.executeQuery(sql2); 
            while(rs.next()){
                DeveloperProject a = new DeveloperProject();
                a.setDeveloper(rs.getString("developer_name"));       
                data.add(a);
                e.setDeveloper(data);
            }
            cn.close();
            return e;
            
        } catch (SQLException ex) {
            throw new PIDPlatformException("Internal Error: "+ex.getMessage());
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                throw new PIDPlatformException(ex.getMessage());
            }
        }
    }
   
    
}
