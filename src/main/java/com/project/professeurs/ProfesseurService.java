package com.project.professeurs;

import java.util.List;

import siggeac.jooq.generated.tables.records.ProfesseurRecord;

public class ProfesseurService {
    private final ProfesseurDAO dao = new ProfesseurDAO();

    public List<ProfesseurRecord> listerProfesseurs() throws Exception {
        return dao.findAll();
    }

    public void test(){}
}
