package org.blitmatthew.service;

import org.blitmatthew.data.DataRetriever;
import org.blitmatthew.entity.Student;

import java.util.List;

public class StudentOps {
    private List<Student> students = DataRetriever.getStudents();
}
