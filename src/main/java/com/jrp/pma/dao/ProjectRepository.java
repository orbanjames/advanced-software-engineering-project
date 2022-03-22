package com.jrp.pma.dao;

import com.jrp.pma.dtob.ChartData;
import com.jrp.pma.dtob.TimeChartData;
import com.jrp.pma.entities.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

    @Override
    public List<Project> findAll();

    @Query(nativeQuery=true, value="SELECT stage as label, COUNT(*) as value " +
            "FROM project " +
            "GROUP BY stage")
    public List<ChartData> getProjectStatus();

    @Query(nativeQuery=true, value="SELECT name as projectName, start_date as startDate, end_date as endDate"
            + " FROM project WHERE start_date is not null")
    public List<TimeChartData> getTimeData();
}