package com.project.etudiants;

import java.util.List;

import siggeac.jooq.generated.tables.records.EtudiantsRecord;

public class EtudiantService {

    private final EtudiantDAO dao = new EtudiantDAO();

    public List<EtudiantsRecord> listerEtudiants() throws Exception {
        return dao.findAll();
    }

}
