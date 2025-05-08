package com.project.etudiants;

import java.util.List;

import siggeac.jooq.generated.default_schema.tables.records.EtudiantRecord;

public class EtudiantService {

    private final EtudiantDAO dao = new EtudiantDAO();

    public List<EtudiantRecord> listerEtudiants() throws Exception {
        return dao.findAll();
    }

    public void function() {
    }

}
