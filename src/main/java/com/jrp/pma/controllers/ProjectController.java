package com.jrp.pma.controllers;

import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository proRepo;

    @GetMapping
    public String displayProjects(Model model){
        List<Project> projects = proRepo.findAll();
        model.addAttribute("projects", projects);
        return "projects/list-projects";
    }

    @RequestMapping("/new")
    public String displayProjectForm(Model model){
        Project aProject = new Project();
        model.addAttribute("project", aProject);
        return "projects/new-project";
    }

    @PostMapping("/save")
    public String createProjectForm(Project project, Model model){
        //handles saving to database
        proRepo.save(project);
        return "redirect:/projects/new";
    }
}
