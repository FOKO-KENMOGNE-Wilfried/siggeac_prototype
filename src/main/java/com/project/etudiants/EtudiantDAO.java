package com.project.etudiants;

import java.sql.Connection;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import com.project.config.DBConnectionManager;

import siggeac.jooq.generated.tables.Etudiant;
import siggeac.jooq.generated.tables.records.EtudiantRecord;

public class EtudiantDAO {
    public List<EtudiantRecord> findAll() throws Exception {

        try (Connection conn = DBConnectionManager.getConnection()) {
            DSLContext ctx = DSL.using(conn);
            return ctx.selectFrom(Etudiant.ETUDIANT).fetch();
        }
    }
}
